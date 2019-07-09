package com.qcby.telemedicine.dao;

import com.qcby.telemedicine.entity.Schedule;

public interface ScheduleMapper {
    int insert(Schedule record);

    int insertSelective(Schedule record);
}