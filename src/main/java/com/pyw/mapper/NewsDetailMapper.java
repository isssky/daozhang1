package com.pyw.mapper;

import com.pyw.pojo.NewsDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewsDetailMapper {



    List<NewsDetail> queryAll();

    List<NewsDetail> queryByTitle(@Param("title") String title);

    int delete(@Param("id") Integer id);
}
