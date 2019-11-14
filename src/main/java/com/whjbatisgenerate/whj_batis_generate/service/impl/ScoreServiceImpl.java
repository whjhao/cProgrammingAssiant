package com.whjbatisgenerate.whj_batis_generate.service.impl;

import com.whjbatisgenerate.whj_batis_generate.dao.ScoretbMapper;
import com.whjbatisgenerate.whj_batis_generate.entity.Scoretb;
import com.whjbatisgenerate.whj_batis_generate.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ScoreServiceImpl implements ScoreService {

    @Autowired
    ScoretbMapper scoretbMapper;
    @Override
    public int deleteByPrimaryKey(Integer stuid, Integer testid) {
        return scoretbMapper.deleteByPrimaryKey(stuid,testid);
    }

    @Override
    public int insert(Scoretb record) {
        return scoretbMapper.insert(record);
    }

    @Override
    public Scoretb selectByPrimaryKey(Integer stuid, Integer testid) {
        return scoretbMapper.selectByPrimaryKey(stuid,testid);
    }

    @Override
    public List<Scoretb> selectAll() {
        return scoretbMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Scoretb record) {
        return scoretbMapper.updateByPrimaryKey(record);
    }
}
