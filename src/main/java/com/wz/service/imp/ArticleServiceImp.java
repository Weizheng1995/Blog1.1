package com.wz.service.imp;

import com.wz.dao.ArticleDao;
import com.wz.pojo.Article;
import com.wz.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by zheng on 2017/6/3.
 */
@Service("articleService")
public class ArticleServiceImp implements ArticleService {
    @Autowired
    private ArticleDao articleDao;
    /**
     * 添加文章
     *
     * @param article 文章信息
     * @return
     */
    @Override
    @Transactional(isolation= Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    public boolean create(Article article) {
        boolean flag=false;
        // 封装其他信息
        article.setArticleCreatetime(new Date());
        article.setArticleAuthor(1);
        if(articleDao.create(article)>0){
            flag=true;
        }
        return flag;
    }

    /**
     * 根据文章编号删除文章
     *
     * @param articleId 文章编号
     * @return
     */
    @Override
    @Transactional(isolation= Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    public boolean delete(int articleId) {
        boolean flag=false;
        if(articleDao.delete(articleId)>0){
            flag=true;
        }
        return flag;
    }

    /**
     * 对文章内容更新
     *
     * @param article 更新后的文章
     * @return
     */
    @Override
    @Transactional(isolation= Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    public boolean update(Article article) {
        boolean flag=false;
        if(articleDao.update(article)>0){
            flag=true;
        }
        return flag;
    }

    /**
     * 根据编号文章浏览数增1
     *
     * @param articleId 文章编号
     * @return
     */
    @Override
    @Transactional(isolation= Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    public boolean updateViewcount(int articleId) {
        boolean flag=false;
        Article article=articleDao.queryById(articleId);
        if(article!=null){
            if(articleDao.updateViewcount(article)>0){
                flag=true;
            }
        }
        return flag;
    }

    /**
     * 查询所有的文章信息
     *
     * @return
     */
    @Override
    @Transactional(isolation= Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    public List<Article> queryAll() {
        return articleDao.queryAll();
    }

    /**
     * 根据编号查询文章信息
     *
     * @param articleId 文章编号
     * @return
     */
    @Override
    @Transactional(isolation= Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    public Article queryById(int articleId) {
        return articleDao.queryById(articleId);
    }

    /**
     * 根据分类和关键字查找
     *
     * @param keyWord
     * @param category
     * @return
     */
    @Override
    @Transactional(isolation= Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    public List<Article> queryByCategoryaAndKeyWord(String keyWord, int category) {
       if(keyWord==null||keyWord.trim().length()==0){
           keyWord=null;
       }else{
           keyWord="%"+keyWord+"%";
       }
       return articleDao.queryByCategoryAndKeyWord(keyWord,category);
    }
}
