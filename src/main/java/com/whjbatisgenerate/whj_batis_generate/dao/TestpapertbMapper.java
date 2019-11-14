package com.whjbatisgenerate.whj_batis_generate.dao;

import com.whjbatisgenerate.whj_batis_generate.entity.Testpapertb;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TestpapertbMapper {
    int deleteByPrimaryKey(Integer testid);

    int insert(Testpapertb record);

    Testpapertb selectByPrimaryKey(Integer testid);

    List<Testpapertb> selectAll();

    int updateByPrimaryKey(Testpapertb record);
}