package com.wz.service.imp;

import com.wz.dao.CourseDao;
import com.wz.pojo.Course;
import com.wz.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by zheng on 2017/6/13.
 */
@Service("courseService")
public class CourseServiceImp implements CourseService{
    @Autowired
    private CourseDao courseDao;
    /**
     * 根据学期编号查询课程列表
     *
     * @param termId 学期编号
     * @return
     */
    @Override
    @Transactional(isolation= Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    public List<Course> queryByTermId(int termId) {
        return courseDao.queryByTerm(termId);
    }
}
