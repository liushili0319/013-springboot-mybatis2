package com.csiic.springboot.controller;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.csiic.springboot.service.UploadService;
import com.csiic.springboot.utils.JwtUtils;
import com.csiic.springboot.vo.CodeMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Date;

@RestController
@CrossOrigin
public class UploadController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UploadController.class);

    @Autowired
    private UploadService uploadService;


    @PostMapping("/upload")
    public Object upload(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
        if (file.isEmpty()) {
            return "上传失败，请选择文件";
        }
        String fileName = file.getOriginalFilename();
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        Date date = new Date();
        fileName=date.getTime()+suffixName;
        String filePath = "D:\\codes\\springmvc\\013-springboot-mybatis2\\src\\main\\resources\\images\\";

        String imagePath = filePath + fileName;
        File dest = new File(imagePath);

        //获取用户账号
        String token = request.getHeader("token");
        System.out.println(token);
        DecodedJWT verify = JwtUtils.getTokenInfo(token);
        String username = verify.getClaim("username").asString();
        System.out.println(username);

        try {
            file.transferTo(dest);
            uploadService.insert(imagePath,username);
            LOGGER.info("上传图片成功");
            return new CodeMsg(1);
        } catch (IOException e) {
            LOGGER.error(e.toString(), e);
        }
        return new CodeMsg(-1);
    }


    @PostMapping("/upfile")
    public Object wenjian(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return "上传失败，请选择文件";
        }

        String fileName = file.getOriginalFilename();
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        Date date = new Date();
        fileName=date.getTime()+suffixName;
        String filePath = "D:\\codes\\springmvc\\013-springboot-mybatis2\\src\\main\\resources\\file\\";

        String wenjianPath = filePath + fileName;
        File dest = new File(wenjianPath);

        try {
            file.transferTo(dest);
            uploadService.insertfile(wenjianPath);
            LOGGER.info("上传文件成功");
            return new CodeMsg(1);
        } catch (IOException e) {
            LOGGER.error(e.toString(), e);
        }
        return new CodeMsg(-1);
    }


}

