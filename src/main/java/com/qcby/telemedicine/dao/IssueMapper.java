package com.qcby.telemedicine.dao;

import com.qcby.telemedicine.entity.Issue;

public interface IssueMapper {
    int deleteByPrimaryKey(Long issueId);

    int insert(Issue record);

    int insertSelective(Issue record);

    Issue selectByPrimaryKey(Long issueId);

    int updateByPrimaryKeySelective(Issue record);

    int updateByPrimaryKey(Issue record);
}