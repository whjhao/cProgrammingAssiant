package com.whjbatisgenerate.whj_batis_generate.service.impl;

import com.whjbatisgenerate.whj_batis_generate.dao.StuserMapper;
import com.whjbatisgenerate.whj_batis_generate.entity.Stuser;
import com.whjbatisgenerate.whj_batis_generate.service.StudentAllService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudengtAllServiceImpl implements StudentAllService {
    @Autowired
    StuserMapper stuserMapper;
    @Override
    public List<Stuser> selectAll() {
        return stuserMapper.selectAll();
    }

    @Override
    public int deleteByPrimaryKey(Integer stuid) {
        return stuserMapper.deleteByPrimaryKey(stuid);
    }

    @Override
    public int insert(Stuser record) {
        return stuserMapper.insert(record);
    }

    @Override
    public Stuser selectByPrimaryKey(Integer stuid) {
        return stuserMapper.selectByPrimaryKey(stuid);
    }

    @Override
    public int updateByPrimaryKey(Stuser record) {
        return stuserMapper.updateByPrimaryKey(record);
    }
}
