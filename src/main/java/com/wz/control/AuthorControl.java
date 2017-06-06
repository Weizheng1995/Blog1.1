package com.wz.control;

import com.wz.pojo.Article;
import com.wz.pojo.Author;
import com.wz.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * Created by zheng on 2017/6/3.
 */
@Controller
public class AuthorControl {
    @Autowired
    private AuthorService authorService;

    /**
     * 作者的登录验证
     * @param authorName 作者登录名
     * @param authorPwd  登录密码
     * @param mv 模型视图对象
     * @param session  会话对象
     * @return 返回视图模型
     */
    @RequestMapping(value="/login")
    public ModelAndView login(String authorName, String authorPwd, ModelAndView mv, HttpSession session){
        //简单验证传入的参数
        if(authorName==null||authorName.trim().length()==0||authorPwd==null||authorPwd.trim().length()==0){
            mv.addObject("message","请输入完整的登录信息");
            // 跳转登录界面 mv.setviewName

        }else{
            // 开始验证
            Author author=authorService.login(authorName,authorPwd);
            if(author!=null){
                // 验证成功
                session.setAttribute("author",author);
                // 跳转到文章管理界面

            }else{
                // 验证失败
                mv.addObject("message","用户名和密码验证失败,请仔细填写");
                // 跳转回登录界面

            }
        }
        return  mv;
    }

    /**
     * 更新用户信息
     * @param author  更新的信息
     * @param mv  视图模型对象
     * @param session  会话对象
     * @return
     */
    @RequestMapping(value="/updateInfo")
    public ModelAndView updateInfo(Author author,ModelAndView mv,HttpSession session){
        if(author!=null){
            Author author1=(Author) session.getAttribute("author");
            author.setAuthorId(author1.getAuthorId());
            if(authorService.updateInfo(author)){
                // 更新成功
                mv.addObject("message","更新成功");
            }else{
                // 更新失败
                mv.addObject("message","更新失败");
            }
        }else{
            mv.addObject("message","请输入相应信息");
        }
        // 跳转回作者信息修改界面
        return mv;
    }

    /**
     * 查询作者信息
     * @param mv
     * @param session
     * @return
     */
    @RequestMapping(value="/aboutMe")
    public ModelAndView queryAuthor(ModelAndView mv,HttpSession session){
        // 默认查询编号为1的作者信息
        Author author=authorService.queryById(1);
        session.setAttribute("author",author);
        mv.setViewName("aboutMe");
        return mv;
    }
}
