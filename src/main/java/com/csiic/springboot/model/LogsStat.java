package com.csiic.springboot.model;

import lombok.Data;

@Data
public class LogsStat {
    private String logdate;

    private Integer pv;

    private Integer reguser;

    private Integer ip;

    private Integer jumper;

    public String getLogdate() {
        return logdate;
    }

    public void setLogdate(String logdate) {
        this.logdate = logdate == null ? null : logdate.trim();
    }

    public Integer getPv() {
        return pv;
    }

    public void setPv(Integer pv) {
        this.pv = pv;
    }

    public Integer getReguser() {
        return reguser;
    }

    public void setReguser(Integer reguser) {
        this.reguser = reguser;
    }

    public Integer getIp() {
        return ip;
    }

    public void setIp(Integer ip) {
        this.ip = ip;
    }

    public Integer getJumper() {
        return jumper;
    }

    public void setJumper(Integer jumper) {
        this.jumper = jumper;
    }
}