package com.pyw.controller;

import com.pyw.pojo.NewsDetail;
import com.pyw.service.NewsDetailService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/news")
public class NewsDetailController {
    @Autowired
    private NewsDetailService newsDetailService;

    //查询所有的新闻
    @RequestMapping("/main")
    public  String main(Model model){

//        System.out.println("main...");

        List<NewsDetail> list = newsDetailService.queryAll();
        model.addAttribute("news",list);
        return "main";

    }

    @RequestMapping("/query/title")
    public String queryByTitle(@RequestParam("title")String title,Model model ){
        model.addAttribute("title",title);
      List<NewsDetail> list = newsDetailService.queryByTitle(title);
      model.addAttribute("news",list);
        return "main";
    }
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id,Model model){
        //要删除所有评论，删除这条新闻
        boolean suc = newsDetailService.delete(id);
        model.addAttribute("deleteFlag",suc);
        List<NewsDetail> list = newsDetailService.queryAll();
        model.addAttribute("news",list);
        return "main";
    }
}
