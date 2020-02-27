package com.divya.quiz_final.service;

import com.divya.quiz_final.model.Quiz;
import com.divya.quiz_final.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizService {
    @Autowired
    private QuizRepository quizRepository;

    public QuizService(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    public Quiz find(Long quizId) {
        return null;
    }
}
