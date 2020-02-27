package com.divya.quiz_final.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Quiz {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    private Long questionId;
    private String userAnswer;
    private Long score;
    private boolean isCorrect;

    public Quiz() {
    }

    public Quiz(Long userId, Long questionId, String userAnswer, Long score, boolean isCorrect) {
        this.userId = userId;
        this.questionId = questionId;
        this.userAnswer = userAnswer;
        this.score = score;
        this.isCorrect = isCorrect;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "userId=" + userId +
                ", questionId=" + questionId +
                ", userAnswer='" + userAnswer + '\'' +
                ", score=" + score +
                ", isCorrect=" + isCorrect +
                '}';
    }
}
