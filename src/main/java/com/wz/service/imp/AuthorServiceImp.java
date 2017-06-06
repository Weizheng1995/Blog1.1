package com.wz.service.imp;

import com.wz.dao.AuthorDao;
import com.wz.pojo.Author;
import com.wz.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by zheng on 2017/6/3.
 */
@Service("authorService")
public class AuthorServiceImp implements AuthorService{
    @Autowired
    private AuthorDao authorDao;
    /**
     * 根据登录名和密码验证登录信息
     *
     * @param authorName 登录名
     * @param authorPwd  密码
     * @return 若为空则返回null,
     */
    @Override
    @Transactional(isolation= Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    public Author login(String authorName, String authorPwd) {
        return authorDao.login(authorName,authorPwd);
    }

    /**
     * 更新用户信息
     *
     * @param author 用户信息
     * @return
     */
    @Override
    @Transactional(isolation= Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    public boolean updateInfo(Author author) {
        boolean flag=false;
        if(authorDao.updateInfo(author)>0){
            flag=true;
        }
        return flag;
    }

    /**
     * 通过id查询作者
     *
     * @param authorId
     * @return
     */
    @Override
    public Author queryById(int authorId) {
        return authorDao.queryById(authorId);
    }
}
