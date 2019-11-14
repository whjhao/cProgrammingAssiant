package com.whjbatisgenerate.whj_batis_generate.service;

import com.whjbatisgenerate.whj_batis_generate.entity.Stuser;

import java.util.List;

public interface  StudentAllService {

    List<Stuser>  selectAll();

    int deleteByPrimaryKey(Integer stuid);

    int insert(Stuser record);

    Stuser selectByPrimaryKey(Integer stuid);


    int updateByPrimaryKey(Stuser record);
}
