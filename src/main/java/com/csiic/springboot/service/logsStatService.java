package com.csiic.springboot.service;

import com.csiic.springboot.model.LogsStat;

import java.util.List;

public interface logsStatService {
    List<LogsStat> queryAllLogsStat();

    LogsStat queryOnelogsStat(String logdate);

    void insertOnelogsStat(LogsStat logsStat);

    void deletelogsStat(String logdate);

    void update(String logdate, Integer pv);
}
