package com.wz.pojo;

/**
 * Created by zheng on 2017/6/12.
 */
public class Course {
    private int courseId;
    private String courseName;
    private int courseScore;
    private int term;
    private String share;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseScore() {
        return courseScore;
    }

    public void setCourseScore(int courseScore) {
        this.courseScore = courseScore;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public String getShare() {
        return share;
    }

    public void setShare(String share) {
        this.share = share;
    }
}
