package com.wz.dao;

import com.wz.pojo.Category;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by zheng on 2017/6/2.
 */
public interface CategoryDao {
    /**
     * 查询所有的分类信息
     * @return
     */
    public List<Category> queryAll();

    /**
     * 根据分类编号查询分类信息
     * @param categoryId  分类编号
     * @return
     */
    public Category queryById(@Param("categoryId") int categoryId);
}
