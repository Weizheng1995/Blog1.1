package com.wz.dao;

import com.wz.pojo.Author;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by zheng on 2017/6/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class AuthorDaoTest {
    // 实现dao注入
    @Resource
    private AuthorDao authorDao;
    @Test
    public void testLogin(){
        if(authorDao.login("zheng","zhen")!=null){
            System.out.println("验证成功");
        }else{
            System.out.println("验证失败");
        }
    }

    @Test
    public void testUpdateInfo(){
        Author author=authorDao.login("zheng","zheng");
        if(author!=null){
            author.setAuthorDescription("你若安好便是晴天");
            if(authorDao.updateInfo(author)>0){
                System.out.println("更新成功");
            }else{
                System.out.println("更新失败");
            }
        }else{
            System.out.println("未查到该作者");
        }

    }
}
