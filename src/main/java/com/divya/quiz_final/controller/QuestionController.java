package com.divya.quiz_final.controller;

import com.divya.quiz_final.model.Question;
import com.divya.quiz_final.model.Quiz;
import com.divya.quiz_final.service.QuestionService;
import com.divya.quiz_final.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class QuestionController {
@Autowired
    private QuestionService questionService;
    private QuizService quizService;

    public QuestionController(QuestionService questionService, QuizService quizService) {
        this.questionService = questionService;
        this.quizService = quizService;
    }

    @RequestMapping(value = "save",method = RequestMethod.POST)
    @PreAuthorize("isAuthenticated()")
    @ResponseStatus(HttpStatus.OK)
    public Question save(@Valid Question question, BindingResult answer, Long quizId){
        Quiz quiz = quizService.find(quizId);
        //question.setQuiz(quiz);
        return questionService.save(question);
    }

    @RequestMapping(value = "/updateAll",method = RequestMethod.POST)
    @PreAuthorize("isAuthenticated()")
    @ResponseStatus(HttpStatus.OK)
    public Question updateAll(@RequestBody List<Question> questions){
        for(int i = 0; i <questions.size();i++){
            Question question = questions.get(i);
        }
        return null;
    }

    @RequestMapping(value = "/{question_id}",method = RequestMethod.POST)
    @PreAuthorize("permitAll")
    @ResponseStatus(HttpStatus.OK)
    public Question find(@PathVariable Long questionId){
        return questionService.find(questionId);

    }

    @RequestMapping(value = "/{question_id}", method = RequestMethod.POST)
    @PreAuthorize("isAuthenticated()")
    @ResponseStatus(HttpStatus.OK)
    public Question update(@PathVariable Long questionId,@Valid Question question ){
        //RestVerifier.verifyModelResult(answer);
        question.setQuestionId(questionId);
        return questionService.update(question);
    }

    @RequestMapping(value = "/{question_id}", method = RequestMethod.DELETE)
    @PreAuthorize("isAuthenticated()")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable Long question_id){
        Question question = questionService.find(question_id);
        questionService.delete(question);
    }

//    @RequestMapping(value = "/{question_id}/answers", method = RequestMethod.GET)
//    @PreAuthorize("permitAll")
//    @ResponseStatus(HttpStatus.OK)
//    public List<Answer> findAnswer(@PathVariable Long question_id){
//        Question question = questionService.find(question_id);
//        return questionService.findAnswersByQuestion(question);
//    }

    @RequestMapping(value = "/{question_id}/correctAnswer", method = RequestMethod.GET)
    @PreAuthorize("isAuthenticated()")
    @ResponseStatus(HttpStatus.OK)
    public Question getCorrectAnswer(@PathVariable Long question_id){
        Question question = questionService.find(question_id);
        return questionService.getCorrectAnswer(question);
    }
    @RequestMapping(value = "/{question_id}/correctAnswer", method = RequestMethod.POST)
    @PreAuthorize("isAuthenticated()")
    @ResponseStatus(HttpStatus.OK)
    public void setCorrectAnswer(@PathVariable Long question_id, @RequestParam Long answer_id){
        Question question = questionService.find(question_id);
        Question answer = questionService.find(answer_id);
        questionService.setCorrectAnswer(question, answer);
    }
}
