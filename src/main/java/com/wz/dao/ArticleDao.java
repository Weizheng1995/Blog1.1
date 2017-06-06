package com.wz.dao;

import com.wz.pojo.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by zheng on 2017/6/2.
 */
public interface ArticleDao {
    /**
     * 查询所有的文章信息
     * @return
     */
    public List<Article> queryAll();

    /**
     * 根据文章编号查询文章信息
     * @param articleId  文章编号
     * @return
     */
    public Article queryById(@Param("articleId")int articleId);

    /**
     * 添加文章
     * @param article 文章信息
     * @return
     */
    public int create(@Param("article") Article article);

    /**
     * 根据编号删除文章
     * @param articleId  文章编号
     * @return
     */
    public int delete(@Param("articleId") int articleId);

    /**
     * 更新文章信息
     * @param article 更改的信息
     * @return
     */
    public int update(@Param("article") Article article);

    /**
     * 根更新浏览数增一
     * @param article
     * @return
     */
    public int updateViewcount(@Param("article") Article article);

    /**
     * 根据分类和关键字查询文章
     * @param keyWord
     * @param category
     * @return
     */
    public List<Article> queryByCategoryAndKeyWord(@Param("keyWord")String keyWord,@Param("category") int category);
}
