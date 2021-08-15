package com.csiic.springboot.mapper;

import com.csiic.springboot.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Insert("insert into user(username,userpwd) values(#{username},#{userpwd})")
    void insert(User user);

    @Select("select count(*) from user where username=#{username}")
    int selectName(String username);

    @Select("SELECT COUNT(*) FROM user WHERE username=#{username} and userpwd=#{userpwd}")
    int findUser(User user);
}
