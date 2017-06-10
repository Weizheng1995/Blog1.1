package com.wz.pojo;

import com.wz.util.DateUtil;

import java.util.Date;

/**
 * Created by zheng on 2017/6/2.
 */
public class Article {
    private int articleId;
    private String articleTitle;
    private String articleContent;
    private Date articleCreatetime;
    private int articleViewcount;
    private int articleCategory;
    private int articleAuthor;
    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public Date getArticleCreatetime() {
        return articleCreatetime;
    }

    public void setArticleCreatetime(Date articleCreatetime) {
        this.articleCreatetime = articleCreatetime;
    }

    public int getArticleViewcount() {
        return articleViewcount;
    }

    public void setArticleViewcount(int articleViewcount) {
        this.articleViewcount = articleViewcount;
    }

    public int getArticleCategory() {
        return articleCategory;
    }

    public void setArticleCategory(int articleCategory) {
        this.articleCategory = articleCategory;
    }

    public int getArticleAuthor() {
        return articleAuthor;
    }

    public void setArticleAuthor(int articleAuthor) {
        this.articleAuthor = articleAuthor;
    }
    /*获取部分内容*/
    public String getSubString(int maxLength){
        String subStr="";
        if(articleContent.length()>maxLength){
            subStr=articleContent.substring(0,maxLength);
        }else{
            subStr=articleContent;
        }
        return subStr;
    }
    /*格式化时间*/
    public String getCurrentDate(){
        return DateUtil.getNowDate(getArticleCreatetime());
    }
    /*将内容显示为html格式*/
    public String showContent(){
        return getArticleContent().replaceAll("\n","<br/>");
    }
}
