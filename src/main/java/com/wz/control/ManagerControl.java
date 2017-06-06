package com.wz.control;

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

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by zheng on 2017/6/5.
 */
@Controller
public class ManagerControl {
    @Autowired
    AuthorService authorService;
    @Autowired
    ArticleService articleService;
    @Autowired
    CategoryService categoryService;
    /**
     * 打开控制台管理界面
     * @param mv
     * @return
     */
    @RequestMapping(value = "/managerConsole")
    public ModelAndView managerControl(ModelAndView mv){
        mv.setViewName("manager");
        return mv;
    }
    /**
     * 打开更新个人信息
     * @param mv
     * @return
     */
    @RequestMapping(value="/managerConsole/editPersonInfo")
    public ModelAndView updateAuthorInfo(ModelAndView mv){
        mv.setViewName("../editInfo");
        // 默认查询编号为1的作者的信息
        Author author=authorService.queryById(1);
        mv.addObject("author",author);
        return mv;
    }

    /**
     * 打开添加文章
     * @param mv
     * @return
     */
    @RequestMapping(value="/managerConsole/mAddArticle")
    public ModelAndView createArticle(ModelAndView mv){
        List<Category> categoryList=categoryService.queryAll();
        mv.addObject("categoryList",categoryList);
        mv.setViewName("../createArticle");
        return mv;
    }

    /**
     * 根据文章编号删除文章
     * @param articleId
     * @param mv
     * @return
     */
    @RequestMapping(value = "/managerConsole/deleteArticle")
    public ModelAndView deleteArticle(int articleId,ModelAndView mv){
        String message="";
        if(articleService.delete(articleId)){
            message="删除成功";
        }else{
            message="删除失败";
        }
        mv.addObject("message",message);
        mv.setViewName("forward:/managerConsole/viewArticle");
        return mv;
    }
    /**
     * 打开浏览文章界面
     * @param mv
     * @return
     */
    @RequestMapping(value="/managerConsole/viewArticle")
    public ModelAndView viewArticle(ModelAndView mv, HttpSession session){
        // 提示信息
        String message="您还没有添加文章呢。。";
        List<Article> lists= articleService.queryAll();
        List<Category> categoryList=categoryService.queryAll();
        mv.setViewName("forward:/managerConsole/divPages?pageIndex=1");
        session.setAttribute("categoryList",categoryList);
        session.setAttribute("articleLists",lists);
        if(lists.size()==0){
            mv.addObject("message",message);
        }
        return mv;
    }

    /**
     * 根据相关条件查询文章
     * @param keyWord
     * @param category
     * @param mv
     * @param session
     * @return
     */
    @RequestMapping(value = "/managerConsole/searchArticle")
    public ModelAndView queryArticleByCategory(String keyWord,int category,ModelAndView mv,HttpSession session){
        String message="未查到包含相关信息文章";
        // 查询文章按分类查找
        List<Article> lists=articleService.queryByCategoryaAndKeyWord(keyWord,category);
        session.setAttribute("articleLists",lists);
        mv.setViewName("forward:/managerConsole/divPages?pageIndex=1");
        if(lists.size()==0){
            mv.addObject("message",message);
        }
        return mv;
    }
    /**
     * 实现分页功能
     * @param pageIndex 当前页
     * @param mv
     * @param session
     * @return
     */
    @RequestMapping(value = "/managerConsole/divPages")
    public ModelAndView subArticle(int pageIndex,ModelAndView mv,HttpSession session){
        // 分页包装类
        DivPage divPage=new DivPage();
        List<Article> lists=(List<Article>) session.getAttribute("articleLists");
//        List<Article> subList;
        divPage.setArticles(lists);
        if(lists.size()>0){
            divPage.setCurrentPage(pageIndex);
//            subList=divPage.getSubList();
            //  session.setAttribute("subList",subList);
            // 这步有意义也没意义
            divPage.articles=null;
        }
        session.setAttribute("divPage",divPage);
        mv.setViewName("../viewArticle");
        return mv;
    }
}
