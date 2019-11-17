package com.pyw.mapper;

        import com.pyw.pojo.NewsComment;
        import com.pyw.pojo.NewsDetail;
        import org.apache.ibatis.annotations.Param;

        import java.util.List;

public interface NewsCommentMapper {
    List<NewsComment> queryCommentsByNewsId(NewsDetail newsDetail);

    int add(NewsComment newsComment);
    void delete(@Param("newsId") Integer id);
}
