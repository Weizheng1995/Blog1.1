package com.wz.dao;

import com.wz.pojo.Author;
import org.apache.ibatis.annotations.Param;

/**
 * Created by zheng on 2017/6/2.
 */
public interface AuthorDao {
    /**
     *
     * @param authorName 用户名
     * @param authorPwd  密码
     * @return Author实体类
     */
    public Author login(@Param("authorName") String authorName,@Param("authorPwd") String authorPwd);

    /**
     *
     * @param author 作者的信息
     * @return 返回影响的行数
     */
    public int updateInfo(@Param("author") Author author);

    /**
     * 根据作者编号查询
     * @param authorId  作者编号
     * @return
     */
    public Author queryById(@Param("authorId") int authorId);
}
