package com.wz.service.imp;

import com.wz.dao.CategoryDao;
import com.wz.pojo.Category;
import com.wz.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by zheng on 2017/6/3.
 */
@Service("categoryService")
public class CategoryServiceImp implements CategoryService{
    @Autowired
    private CategoryDao categoryDao;
    /**
     * 查询所有的分类信息
     *
     * @return
     */
    @Override
    @Transactional(isolation= Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    public List<Category> queryAll() {
        return categoryDao.queryAll();
    }

    /**
     * 根据分类编号查询分类信息
     *
     * @param categoryId 分类编号
     * @return 若为空则返回null
     */
    @Override
    @Transactional(isolation= Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    public Category queryById(int categoryId) {
        return categoryDao.queryById(categoryId);
    }
}
