package com.wz.service;

import com.wz.pojo.University;

/**
 * Created by zheng on 2017/6/13.
 */
public interface UniversityService {
    /**
     * 根据学校编号查询信息
     * @param universityId
     * @return
     */
    public University queryById(int universityId);
}
