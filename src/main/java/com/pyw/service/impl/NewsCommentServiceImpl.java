package com.pyw.service.impl;

import com.pyw.mapper.NewsCommentMapper;
import com.pyw.pojo.NewsComment;
import com.pyw.pojo.NewsDetail;
import com.pyw.service.NewsCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("newsCommentService")
public class NewsCommentServiceImpl implements NewsCommentService {
    @Autowired
    private NewsCommentMapper newsCommentMapper;



    @Override
    public List<NewsComment> queryCommentsByNewsId(Integer newsId) {
        NewsDetail newsDetail = new NewsDetail();
        newsDetail.setId(newsId);

        return newsCommentMapper.queryCommentsByNewsId(newsDetail);
    }

    @Override
    public boolean add(NewsComment newsComment) {
        newsComment.setCreateDate(new Date());
       int row = newsCommentMapper.add(newsComment);
        return row == 1 ? true:false;
    }
}
