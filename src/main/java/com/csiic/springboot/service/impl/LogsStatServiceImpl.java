package com.csiic.springboot.service.impl;


import com.csiic.springboot.mapper.logsStatMapper;
import com.csiic.springboot.model.LogsStat;
import com.csiic.springboot.service.logsStatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogsStatServiceImpl implements logsStatService {

    @Autowired
    private logsStatMapper logsStatMapper;

    @Override
    public List<LogsStat> queryAllLogsStat() {
        return logsStatMapper.queryAllLogsStat();
    }

    @Override
    public LogsStat queryOnelogsStat(String logdate) {
        return logsStatMapper.queryOnelogsStat(logdate);
    }

    @Override
    public void insertOnelogsStat(LogsStat logsStat) {
        logsStatMapper.insertOneLogsStat(logsStat);
    }

    @Override
    public void deletelogsStat(String logdate) {
        logsStatMapper.deleteLogsStat(logdate);
    }

    @Override
    public void update(String logdate, Integer pv) {
        logsStatMapper.updateLogsStat(logdate,pv);
    }

}
