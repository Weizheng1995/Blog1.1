package com.wz.control;

import com.wz.pojo.Course;
import com.wz.pojo.Term;
import com.wz.pojo.University;
import com.wz.service.CourseService;
import com.wz.service.TermService;
import com.wz.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by zheng on 2017/6/13.
 */
@Controller
public class UniversityControl {
    @Autowired
    UniversityService universityService;
    @Autowired
    TermService termService;
    @Autowired
    CourseService courseService;
    @RequestMapping(value = "/myUniversity")
    public ModelAndView myUniversity(ModelAndView mv){
        // 进行跳转，加载各类信息
        mv.setViewName("forward:queryUniversity");
        return mv;
    }
    @RequestMapping(value = "/queryUniversity")
    public ModelAndView queryUniversity(ModelAndView mv, HttpSession session){
        // 进行学校信息查询,查询默认编号为1d额学校
        University university=universityService.queryById(1);
        // 存入session
        session.setAttribute("university",university);
        // 转发
        mv.setViewName("forward:queryTermAndCourse");
        return mv;
    }
    @RequestMapping(value = "/queryTermAndCourse")
    public ModelAndView queryTermAndCourse(ModelAndView mv,HttpSession session){
        University university=(University) session.getAttribute("university");
        List<Term> termList=null;
        List<Course> courses;
        Term term;
        if(university!=null){
            // 查询学期
            termList=termService.queryByUniversity(university.getUniversityId());
            // 遍历，设置课程
            if(termList!=null){
                for(int i=0;i<termList.size();i++){
                    term=termList.get(i);
                    courses=courseService.queryByTermId(term.getTermId());
                    term.setCourseList(courses);
                    termList.set(i,term);
                }
            }
        }
        // 设置session,termList
        session.setAttribute("termList",termList);
        // 设置viewName：myUniversity
        mv.setViewName("myUniversity");
        return mv;
    }
}
