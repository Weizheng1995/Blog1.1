package com.wz.control;

import com.wz.pojo.Category;
import com.wz.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by zheng on 2017/6/3.
 */
@Controller
public class CategoryControl {
    @Autowired
    private CategoryService categoryService;

    /**
     * 查询所有的分类
     * @param mv
     * @param session
     * @return
     */
    @RequestMapping(value="/queryAllCategory")
    public ModelAndView queryAll(ModelAndView mv, HttpSession session){
        List<Category> lists=categoryService.queryAll();
        session.setAttribute("categoryList",lists);
        // 转发跳转

        return mv;
    }

    /**
     * 根据分类编号查询分类名称
     * @param categoryId  分类编号
     * @return 分类名称
     */
    @RequestMapping("/queryByIdCategory")
    @ResponseBody
    public String  queryById(int categoryId){
        String categoryName=categoryService.queryById(categoryId).getCategoryName();
        if(categoryName==null||categoryName.trim().length()==0){
            categoryName="暂查到该分类标题";
        }
        return categoryName;
    }
}
