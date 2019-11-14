package com.whjbatisgenerate.whj_batis_generate.service;

import com.whjbatisgenerate.whj_batis_generate.entity.Scoretb;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ScoreService {
    int deleteByPrimaryKey(@Param("stuid") Integer stuid, @Param("testid") Integer testid);

    int insert(Scoretb record);

    Scoretb selectByPrimaryKey(@Param("stuid") Integer stuid, @Param("testid") Integer testid);

    List<Scoretb> selectAll();

    int updateByPrimaryKey(Scoretb record);
}
