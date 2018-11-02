package com.dao;

import com.bean.Incomeproof;

public interface IncomeproofMapper {
    int insert(Incomeproof record);

    int insertSelective(Incomeproof record);
}