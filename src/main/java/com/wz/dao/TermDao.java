package com.wz.dao;

import com.wz.pojo.Term;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by zheng on 2017/6/12.
 */
public interface TermDao {
    /**
     * 根据学校编号查询
     * @param universityId  学校编号
     * @return
     */
    public List<Term> queryByUniversity(@Param("universityId")int universityId);
}
