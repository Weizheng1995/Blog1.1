package com.wz.service;

import com.wz.pojo.Term;

import java.util.List;

/**
 * Created by zheng on 2017/6/13.
 */
public interface TermService {
    /**
     * 根据学校编号查询学期信息
     * @param universityId
     * @return
     */
    public List<Term> queryByUniversity(int universityId);
}
