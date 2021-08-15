package com.csiic.springboot.mapper;
import com.csiic.springboot.model.LogsStat;
import java.util.List;

import org.apache.ibatis.annotations.*;

@Mapper
public interface logsStatMapper {

    //增加数据
    @Insert("insert into logsstat values(#{logdate},#{pv},#{reguser},#{ip},#{jumper})")
    int insertOneLogsStat(LogsStat logsStat);

    //    根据日期查询一天数据
    @Select("select logdate, pv, reguser, ip, jumper from logsstat where logdate=#{logdate}")
    LogsStat queryOnelogsStat(String logdate);

    //查询所有日志数据
    @Select("select logdate, pv, reguser, ip, jumper from logsstat")
    List<LogsStat> queryAllLogsStat();

    //根据日期删除
    @Delete("delete from logsstat where logdate=#{logdate}")
    void deleteLogsStat(String logdate);

    //根据日期更新pv
    @Update("update logsstat set pv=#{pv} where logdate=#{logdate}")
    void updateLogsStat(String logdate,Integer pv);

}