package com.whjbatisgenerate.whj_batis_generate.service;

import com.whjbatisgenerate.whj_batis_generate.entity.Testpapertb;

import java.util.List;

public interface TestPaperService {
    int deleteByPrimaryKey(Integer testid);

    int insert(Testpapertb record);

    Testpapertb selectByPrimaryKey(Integer testid);

    List<Testpapertb> selectAll();

    int updateByPrimaryKey(Testpapertb record);

}
