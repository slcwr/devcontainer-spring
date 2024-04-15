package com.example.sample.controller;

import com.example.sample.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("showcomment")
@Controller
public class CommentController {
    @Autowired
    CommentService commentService;

    @RequestMapping(method = RequestMethod.GET)
    public String viewHomePage(Model model) {
        model.addAttribute("listComments", commentService.getComment());
        return "comment";
    }
}


