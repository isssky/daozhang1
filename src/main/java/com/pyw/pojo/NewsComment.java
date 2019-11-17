package com.pyw.pojo;

import java.util.Date;
import java.util.List;

public class NewsComment {
    private Integer id;
    private String content;
    private String author;
    private Date createDate;
    private NewsDetail newsDetail;
    private List<NewsComment> newComments;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public NewsDetail getNewsDetail() {
        return newsDetail;
    }

    public void setNewsDetail(NewsDetail newsDetail) {
        this.newsDetail = newsDetail;
    }

    public List<NewsComment> getNewComments() {
        return newComments;
    }

    public void setNewComments(List<NewsComment> newComments) {
        this.newComments = newComments;
    }
}
