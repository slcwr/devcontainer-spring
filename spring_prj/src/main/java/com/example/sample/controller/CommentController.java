package com.example.sample.controller;

import com.example.sample.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@RestController
@RequestMapping("showcomment")
public class CommentController {
    @Autowired
    CommentService commentService;

    @RequestMapping(value = "/showcomment",method = RequestMethod.GET)
    public String viewHomePage(Model model) {
        model.addAttribute("listComments", commentService.getComment());
        return "comment";
    }
}


