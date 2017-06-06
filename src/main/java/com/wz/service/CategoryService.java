package com.wz.service;

import com.wz.pojo.Category;

import java.util.List;

/**
 * Created by zheng on 2017/6/3.
 */
public interface CategoryService {
    /**
     * 查询所有的分类信息
     * @return
     */
    public List<Category> queryAll();

    /**
     * 根据分类编号查询分类信息
     * @param categoryId  分类编号
     * @return 若为空则返回null
     */
    public Category queryById(int categoryId);
}
