package com.pyw.service;

import com.pyw.pojo.NewsDetail;

import java.util.List;

public interface NewsDetailService {
    List<NewsDetail> queryAll();

    List<NewsDetail> queryByTitle(String title);

    boolean delete(Integer id);
}
