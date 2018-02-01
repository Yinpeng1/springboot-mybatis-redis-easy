package com.yp.yptest.controller;

import com.yp.yptest.Entity.QuestionEntity;
import com.yp.yptest.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @RequestMapping("/getAllUQuestions")
    public List<QuestionEntity> getAllQuestions(){
        List<QuestionEntity> list = null;
        try {
            list =  questionService.getAllQuestions();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  list;
    }

    @RequestMapping("/add")
    public void add() {
        QuestionEntity questionEntity = new QuestionEntity();
        questionEntity.setId(UUID.randomUUID().toString().replace("-",""));
        questionEntity.setQuestion("hello YTO");
        questionEntity.setAnswer("YTO Hello");
        questionService.insert(questionEntity);
    }
}
