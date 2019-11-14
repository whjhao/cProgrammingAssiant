package com.whjbatisgenerate.whj_batis_generate.dao;

import com.whjbatisgenerate.whj_batis_generate.entity.Scoretb;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoretbMapper {
    int deleteByPrimaryKey(@Param("stuid") Integer stuid, @Param("testid") Integer testid);

    int insert(Scoretb record);

    Scoretb selectByPrimaryKey(@Param("stuid") Integer stuid, @Param("testid") Integer testid);

    List<Scoretb> selectAll();

    int updateByPrimaryKey(Scoretb record);
}