package com.harmoleap.job.dao;

import com.harmoleap.job.model.scheduleJob;

public interface scheduleJobMapper {
    int deleteByPrimaryKey(Long jobId);

    int insert(scheduleJob record);

    int insertSelective(scheduleJob record);

    scheduleJob selectByPrimaryKey(Long jobId);

    int updateByPrimaryKeySelective(scheduleJob record);

    int updateByPrimaryKey(scheduleJob record);
}