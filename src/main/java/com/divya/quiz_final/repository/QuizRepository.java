package com.divya.quiz_final.repository;

import com.divya.quiz_final.model.Quiz;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepository extends CrudRepository<Quiz,Long> {
}
