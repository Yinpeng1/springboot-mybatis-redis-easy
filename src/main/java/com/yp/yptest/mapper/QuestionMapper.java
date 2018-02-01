package com.yp.yptest.mapper;

import com.yp.yptest.Entity.QuestionEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface QuestionMapper {

    @Select(" SELECT * FROM question")
    List<QuestionEntity>  getAllQuestions();

    @Insert("insert into question(id, question, answer) values (#{id}, #{question}, #{answer})")
    void insert(QuestionEntity questionEntity);

    @Update("update question set question=#{question}, answer=#{answer} where id = #{id}")
    void update(QuestionEntity questionEntity);

    @Delete("delete from question where id = #{id}")
    void delete(@Param("id") String id);

    @Select("select id, question, answer from question where id = #{id}")
    QuestionEntity find(@Param("id") String id);

}
