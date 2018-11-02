package com.service.impl;

import com.bean.Bscardprint;
import com.dao.BscardprintMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BscardprintServiceImpl implements BscardprintMapper {

    @Autowired
    private BscardprintMapper bscardprintMapper;

    @Override
    public int deleteByPrimaryKey(Integer bscardId) {
        return 0;
    }

    @Override
    public int insert(Bscardprint record) {
        return 0;
    }

    @Override
    public int insertSelective(Bscardprint record) {
        return 0;
    }

    @Override
    public Bscardprint selectByPrimaryKey(Integer bscardId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Bscardprint record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Bscardprint record) {
        return 0;
    }
}