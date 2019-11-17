package com.pyw.service;

import com.pyw.pojo.NewsComment;

import java.util.List;

public interface NewsCommentService{

        List<NewsComment> queryCommentsByNewsId(Integer newsId);

    boolean add(NewsComment newsComment);
}
