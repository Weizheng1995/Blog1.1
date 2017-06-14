package com.wz.service;

import com.wz.pojo.Course;

import java.util.List;

/**
 * Created by zheng on 2017/6/13.
 */
public interface CourseService {
    /**
     * 根据学期编号查询课程信息
     * @param termId
     * @return
     */
    public List<Course> queryByTermId(int termId);
}
