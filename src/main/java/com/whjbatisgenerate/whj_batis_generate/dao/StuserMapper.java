package com.whjbatisgenerate.whj_batis_generate.dao;

import com.whjbatisgenerate.whj_batis_generate.entity.Stuser;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StuserMapper {
    int deleteByPrimaryKey(Integer stuid);

    int insert(Stuser record);

    Stuser selectByPrimaryKey(Integer stuid);

    List<Stuser> selectAll();

    int updateByPrimaryKey(Stuser record);
}