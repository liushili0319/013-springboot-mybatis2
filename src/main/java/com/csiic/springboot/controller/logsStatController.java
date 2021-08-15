package com.csiic.springboot.controller;


import com.csiic.springboot.model.LogsStat;
import com.csiic.springboot.model.User;
import com.csiic.springboot.service.impl.LogsStatServiceImpl;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
//@ResponseBody
//相当于
@RestController
@CrossOrigin
public class logsStatController {

    @Autowired
    private LogsStatServiceImpl logsStatIml;

    @GetMapping(value="/query")
    public List<LogsStat> logsStat(){
        List<LogsStat> LogsStats = logsStatIml.queryAllLogsStat();
        return LogsStats;
    }

    @GetMapping("/selectOne/{logdate}")
    public LogsStat selectOne(@PathVariable String logdate){
        return logsStatIml.queryOnelogsStat(logdate);
    }

    @PostMapping("/insert/{logdate}/{pv}/{reguser}/{ip}/{jumper}")
    public String insertLogsStat(LogsStat logsStat){
        logsStatIml.insertOnelogsStat(logsStat);
        return "插入成功";
    }

    @DeleteMapping("/delete/{logdate}")
    public String deleteLogsStat(@PathVariable String logdate){
        logsStatIml.deletelogsStat(logdate);
        return "删除成功";
    }



    @PutMapping("/update/{logdate}/{pv}")
    public String updateLogsStat(@PathVariable String logdate,@PathVariable Integer pv){
        logsStatIml.update(logdate,pv);
        return "更新成功";
    }

}
