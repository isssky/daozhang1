package com.pyw.service.impl;

import com.pyw.mapper.NewsCommentMapper;
import com.pyw.mapper.NewsDetailMapper;
import com.pyw.pojo.NewsComment;
import com.pyw.pojo.NewsDetail;
import com.pyw.service.NewsDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("newsDetailService")

public class NewsDetailServiceImpl implements NewsDetailService {

    @Autowired
    private NewsCommentMapper newsCommentMapper;

    @Autowired
    private NewsDetailMapper newsDetailMapper;


    @Override
    public List<NewsDetail> queryAll() {
        return newsDetailMapper.queryAll();
    }

    @Override
    public List<NewsDetail> queryByTitle(String title) {
        return newsDetailMapper.queryByTitle( title);
    }

    @Override
    public boolean delete(Integer id) {
        //调用两个mapper的方法

        //1 删除所有评论
        newsCommentMapper.delete(id);

        //2 删除新闻
      int row = newsDetailMapper.delete(id);

        return row == 1 ? true:false;
    }


}
