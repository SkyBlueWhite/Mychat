package com.harmoleap.job.dao;

import com.harmoleap.job.model.scheduleJobLog;

public interface scheduleJobLogMapper {
    int deleteByPrimaryKey(Long logId);

    int insert(scheduleJobLog record);

    int insertSelective(scheduleJobLog record);

    scheduleJobLog selectByPrimaryKey(Long logId);

    int updateByPrimaryKeySelective(scheduleJobLog record);

    int updateByPrimaryKey(scheduleJobLog record);
}