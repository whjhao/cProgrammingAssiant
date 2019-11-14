package com.whjbatisgenerate.whj_batis_generate.service.impl;

import com.whjbatisgenerate.whj_batis_generate.dao.TestpapertbMapper;
import com.whjbatisgenerate.whj_batis_generate.entity.Testpapertb;
import com.whjbatisgenerate.whj_batis_generate.service.TestPaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TestPaperServiceImpl implements TestPaperService {
@Autowired
    TestpapertbMapper testpapertbMapper;
    @Override
    public int deleteByPrimaryKey(Integer testid) {
        return testpapertbMapper.deleteByPrimaryKey(testid);
    }

    @Override
    public int insert(Testpapertb record) {
        return testpapertbMapper.insert(record);
    }

    @Override
    public Testpapertb selectByPrimaryKey(Integer testid) {
        return testpapertbMapper.selectByPrimaryKey(testid);
    }

    @Override
    public List<Testpapertb> selectAll() {
        return testpapertbMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Testpapertb record) {
        return testpapertbMapper.updateByPrimaryKey(record);
    }
}
