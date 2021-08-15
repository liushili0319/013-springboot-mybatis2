package com.csiic.springboot.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UploadMapper {

    @Insert("insert into img(url) values(#{url},#{username})")
    void insert(String url,String username);

    @Insert("insert into file(url) values(#{url})")
    void insertfile(String url);
}
