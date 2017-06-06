package com.wz.util;

import com.wz.pojo.Article;

import java.util.List;

/**
 * Created by zheng on 2017/6/5.
 * 分页
 */
public class DivPage {
    // 总的数据列表
    public  List<Article> articles;
    // 当前页数据列表
    private List<Article> subList;
    // 总的记录数
    private int totalArticles;
    // 每页的记录数
    private int pageSize;
    // 总的页数
    private int totalPages;
    // 当前页数
    private int currentPage;

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
        // 设置总记录数
        this.totalArticles=articles.size();
    }

    public List<Article> getSubList() {
        return subList;
    }

    public void setSubList(List<Article> subList) {
        this.subList = subList;
    }

    public int getTotalArticles() {
        return totalArticles;
    }

//    public void setTotalArticles(int totalArticles) {
//        this.totalArticles = totalArticles;
//    }

    public int getPageSize() {
        return pageSize>0?pageSize:10;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalPages() {
        this.totalPages=(totalArticles+getPageSize()-1)/getPageSize();
        return this.totalPages;
    }

//    public void setTotalPages(int totalPages) {
//        this.totalPages = totalPages;
//    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        // 进行简单验证
        if(currentPage<1)
            currentPage=1;
        if(currentPage>getTotalPages())
            currentPage=getTotalPages();
        this.currentPage = currentPage;
        // 设置当前列表集合
        int fromIndex=(currentPage-1)*getPageSize();
        int toIndex=fromIndex+getPageSize();
        if(currentPage>=getTotalPages()){
            toIndex=getTotalArticles();
        }
        this.subList=articles.subList(fromIndex,toIndex);
    }
}
