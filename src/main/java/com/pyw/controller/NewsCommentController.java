package com.pyw.controller;

import com.pyw.pojo.NewsComment;
import com.pyw.service.NewsCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/comments")
public class NewsCommentController {

    @Autowired
    private NewsCommentService newsCommentService;

    @RequestMapping("/query/newsid/{id}")
    public String queryCommentsByNewsId(@PathVariable("id")Integer newsId, Model model) {

        List<NewsComment> l = newsCommentService.queryCommentsByNewsId(newsId);
        model.addAttribute("comments",l);
        return "comments";

    }


    @RequestMapping("/addTo/{id}")
    public String addTo(@PathVariable("id")Integer newsId, Model model) {
        model.addAttribute("newsId",newsId);
        return "addcomment";
    }


    @RequestMapping("/add")
    public String add(NewsComment newsComment, Model model) {
       boolean suc = newsCommentService.add(newsComment);
        List<NewsComment> l = newsCommentService.queryCommentsByNewsId(newsComment.getNewsDetail().getId());
        model.addAttribute("comments",l);
        return "comments";
    }

}
