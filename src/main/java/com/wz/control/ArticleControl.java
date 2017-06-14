package com.wz.control;

import com.alibaba.fastjson.JSON;
import com.wz.pojo.Article;
import com.wz.pojo.Author;
import com.wz.pojo.Category;
import com.wz.service.ArticleService;
import com.wz.service.AuthorService;
import com.wz.service.CategoryService;
import com.wz.util.DivPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

/**
 * Created by zheng on 2017/6/3.
 */
@Controller
public class ArticleControl {
    @Autowired
    private ArticleService articleService;
    @Autowired
    private AuthorService authorService;
    @Autowired
    private CategoryService categoryService;
    @RequestMapping(value="/queryAllArticle")
    public ModelAndView queryAll(ModelAndView mv, HttpSession session){
        List<Article> lists=articleService.queryAll();
        session.setAttribute("articleList",lists);
        // 查询作者信息，默认为1
        Author author=authorService.queryById(1);
        session.setAttribute("author",author);
        // 查询所有分类

        // 返回全部展示文章界面
        mv.setViewName("articles");
        return mv;
    }
    @RequestMapping(value = "/loadArticles")
    public void subList(int pageIndex, HttpServletResponse response, HttpSession session ){
        // 分页包装类
        DivPage divPage=new DivPage();
        List<Article> lists=(List<Article>) session.getAttribute("articleList");
        if(lists==null){
            lists=articleService.queryAll();
        }
//        List<Article> subList;
        divPage.setArticles(lists);
        if(lists.size()>0){
            divPage.setCurrentPage(pageIndex);
//            subList=divPage.getSubList();
            //  session.setAttribute("subList",subList);
            // 这步有意义也没意义
            divPage.articles=null;
        }

        // 传输数据
        response.setHeader("Cache-Control", "no-cache");
        response.setHeader("Pragma", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setContentType("text/html;charset=utf-8");
        String responseStr = JSON.toJSONString(divPage);
        try{
            Writer writer = response.getWriter();
            writer.write(responseStr);
            writer.flush();
        }catch(IOException e){
            new RuntimeException("loadArticles-writer:",e);
        }
    }
    @RequestMapping(value="/articleDetail")
    public ModelAndView queryById(int articleId,ModelAndView mv){
        Article article=articleService.queryById(articleId);
        if(article==null){
            mv.addObject("message","对不起,未查到该文章");
        }else{
            // 浏览数增1
            articleService.updateViewcount(article.getArticleId());
            Category category=categoryService.queryById(article.getArticleCategory());
            mv.addObject("category",category);
        }
        mv.addObject("article",article);
        // 跳转到文章详细界面
        mv.setViewName("article");
        return mv;
    }
    @RequestMapping(value = "/managerConsole/addArticle")
    public ModelAndView addArticle(Article article,ModelAndView mv){
        String message="";
        // 简单验证
        if(article.getArticleTitle().trim().length()==0||article.getArticleContent().trim().length()==0){
            message="亲，请输入完整的文章信息";
        }else{
            if(articleService.create(article)){
                message="添加文章成功";
            }else{
                message="添加文章失败";
            }
        }
        mv.addObject("message",message);
        mv.setViewName("forward:/managerConsole/mAddArticle");
        return mv;
    }
}
