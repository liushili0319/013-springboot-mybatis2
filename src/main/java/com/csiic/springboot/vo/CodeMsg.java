package com.csiic.springboot.vo;

import org.apache.ibatis.annotations.Param;

public class CodeMsg {
    private Integer code;
    private String msg;

    public CodeMsg(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public CodeMsg(Integer code) {
        this.code = code;
    }

    public CodeMsg() {
    }

    @Override
    public String toString() {
        return "CodeMsg{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
