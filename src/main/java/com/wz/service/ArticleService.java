package com.wz.service;

import com.wz.pojo.Article;

import java.util.List;

/**
 * Created by zheng on 2017/6/3.
 */
public interface ArticleService {
    /**
     * 添加文章
     * @param article  文章信息
     * @return
     */
    public boolean create(Article article);

    /**
     * 根据文章编号删除文章
     * @param articleId  文章编号
     * @return
     */
    public boolean delete(int articleId);

    /**
     * 对文章内容更新
     * @param article  更新后的文章
     * @return
     */
    public boolean update(Article article);

    /**
     * 根据编号文章浏览数增1
     * @param articleId  文章编号
     * @return
     */
    public boolean updateViewcount(int articleId);

    /**
     * 查询所有的文章信息
     * @return
     */
    public List<Article> queryAll();

    /**
     * 根据编号查询文章信息
     * @param articleId  文章编号
     * @return
     */
    public Article queryById(int articleId);

    /**
     * 根据分类和关键字查找
     * @param keyWord
     * @param category
     * @return
     */
    public List<Article> queryByCategoryaAndKeyWord(String keyWord,int category);
}
