package com.csiic.springboot.service;

import com.csiic.springboot.mapper.UploadMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UploadService {

    @Autowired
    private UploadMapper uploadMapper;

    public void insert(String imgpath,String username) {
        uploadMapper.insert(imgpath,username);
    }

    public void insertfile(String wenjianPath){
        uploadMapper.insertfile(wenjianPath);
    }
}

