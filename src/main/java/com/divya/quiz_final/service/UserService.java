package com.divya.quiz_final.service;

import com.divya.quiz_final.model.User;
import com.divya.quiz_final.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        List<User> userList = new ArrayList<>();
        userRepository.findAll().forEach(x -> userList.add(x));
        return userList;
    }

    public User create(User user) {
        User userCreated = userRepository.save(user);
        return userCreated;
    }

    public User get(Long id) {
        Optional<User> potentialUser = userRepository.findById(id);
        User user = potentialUser.get();
        return user;
    }

    public User update(Long id, User user) {
        User userInDataBase = get(id);
        String newUserName = user.getUserName();
        String newFirstName = user.getFirstName();
        String newLastName = user.getLastName();
        String newEmail = user.getEmail();
        String newPassword = user.getPassword();

        userInDataBase.setUserName(newUserName);
        userInDataBase.setFirstName(newFirstName);
        userInDataBase.setLastName(newLastName);
        userInDataBase.setEmail(newEmail);
        userInDataBase.setPassword(newPassword);
        userRepository.save(userInDataBase);
        return userInDataBase;
    }

    public User delete(Long id) {
        User user = get(id);
        userRepository.delete(user);
        return user;
    }
}
