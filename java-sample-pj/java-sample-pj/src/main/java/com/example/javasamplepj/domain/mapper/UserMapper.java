package com.example.javasamplepj.domain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.javasamplepj.domain.model.user.User;

@Mapper
public interface UserMapper {
    // @Select("SELECT id, name, state, country FROM city WHERE state = #{state}")
    // User save(@Param("userName") String userName, @Param("password") String
    // password, @Param("mailAddress") String mailAddress);
    int insert(User user);

    List<User> findAll();

    User findById(Long id);
}