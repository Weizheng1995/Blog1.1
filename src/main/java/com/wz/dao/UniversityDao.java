package com.wz.dao;

import com.wz.pojo.University;
import org.apache.ibatis.annotations.Param;

/**
 * Created by zheng on 2017/6/12.
 */
public interface UniversityDao {
    /**
     * 根据学校编号查询学校信息
     * @param universityId 学校编号
     * @return
     */
    public University queryById(@Param("universityId") int universityId);
}
