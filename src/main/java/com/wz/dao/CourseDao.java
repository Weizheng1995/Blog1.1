package com.wz.dao;

import com.wz.pojo.Course;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by zheng on 2017/6/12.
 */
public interface CourseDao {
    /**
     * 根据学期编号查询课程列表
     * @param termId 学期编号
     * @return
     */
    public List<Course> queryByTerm(@Param("termId")int termId);
}
