package com.yp.yptest.Service;

import com.yp.yptest.Entity.QuestionEntity;
import com.yp.yptest.mapper.QuestionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.interceptor.SimpleKey;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@CacheConfig(cacheNames = "QuestionCache")
public class QuestionService {
    @Autowired
    private QuestionMapper questionMapper;

    @CachePut(value = "Question",keyGenerator = "keyGenerator")
    public List<QuestionEntity> getAllQuestions() throws Exception{
        return this.questionMapper.getAllQuestions();
    }

    @CachePut(key = "#p0.id")
    public QuestionEntity update(QuestionEntity questionEntity) {
        this.questionMapper.update(questionEntity);
        return this.questionMapper.find(questionEntity.getId());
    }

    @CachePut(key = "#p0.id")
    public QuestionEntity insert(QuestionEntity questionEntity) {
        this.questionMapper.insert(questionEntity);
        return this.questionMapper.find(questionEntity.getId());
    }
}
