package com.divya.quiz_final.service;

import com.divya.quiz_final.model.Question;
import com.divya.quiz_final.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public Question save(Question question) {
        return null;
    }

    public Question find(Long questionId) {
        return null;
    }

    public Question update(Question question) {
        return null;
    }

    public void delete(Question question) {

    }

    public Question getCorrectAnswer(Question question) {
        return null;
    }

    public void setCorrectAnswer(Question question, Question answer) {
    }

    public List<Question> findAnswersByQuestion(Question question) {
        return null;
    }
}
