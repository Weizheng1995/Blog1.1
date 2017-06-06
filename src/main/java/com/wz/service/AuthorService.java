package com.wz.service;

import com.wz.pojo.Author;

/**
 * Created by zheng on 2017/6/3.
 */
public interface AuthorService {
    /**
     * 根据登录名和密码验证登录信息
     * @param authorName  登录名
     * @param authorPwd  密码
     * @return 若为空则返回null,
     */
    public Author login(String authorName,String authorPwd);

    /**
     * 更新用户信息
     * @param author 用户信息
     * @return
     */
    public boolean updateInfo(Author author);

    /**
     * 通过id查询作者
     * @param authorId
     * @return
     */
    public Author queryById(int authorId);
}
