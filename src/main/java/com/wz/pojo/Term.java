package com.wz.pojo;

import java.util.Date;
import java.util.List;

/**
 * Created by zheng on 2017/6/12.
 */
public class Term {
    private int termId;
    private String termName;
    private String termTime;
    private String pic;
    private String termDescription;
    private int university;
    private List<Course> courseList;

    public int getTermId() {
        return termId;
    }

    public void setTermId(int termId) {
        this.termId = termId;
    }

    public String getTermName() {
        return termName;
    }

    public void setTermName(String termName) {
        this.termName = termName;
    }

    public String getTermTime() {
        return termTime;
    }

    public void setTermTime(String termTime) {
        this.termTime = termTime;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getTermDescription() {
        return termDescription;
    }

    public void setTermDescription(String termDescription) {
        this.termDescription = termDescription;
    }

    public int getUniversity() {
        return university;
    }

    public void setUniversity(int university) {
        this.university = university;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }
}
