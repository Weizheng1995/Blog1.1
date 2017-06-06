package com.wz.dao;

import com.wz.pojo.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zheng on 2017/6/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class CategoryDaoTest {
    // 自动注入
    @Resource
    CategoryDao categoryDao;
    @Test
    public void testQueryAll(){
        List<Category> list=categoryDao.queryAll();
        if(list!=null){
            for(Category category:list){
                System.out.println(category.getCategoryId()+"--->"+category.getCategoryName());
            }
        }else{
            System.out.println("查询为空");
        }

    }
    @Test
    public void testQueryById(){
        Category category=categoryDao.queryById(2);
        if(category!=null){
            System.out.println(category.getCategoryId()+"--->"+category.getCategoryName());
        }else{
            System.out.println("查询失败");
        }
    }
}
