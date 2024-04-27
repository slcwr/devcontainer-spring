package com.example.sample.controller;

import com.example.sample.service.CommentService;
import com.example.sample.form.*;

import java.util.ArrayList;

//import lombok.launch.PatchFixesHider.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.example.sample.service.CommentService;
import com.example.sample.entity.Comment;
import com.example.sample.repository.CommentRepository;


@Controller
public class CommentController {
    @Autowired
    CommentService commentService;
    @Autowired
    CommentRepository repository;
  

    @RequestMapping(value = "/showcomment",method = RequestMethod.GET)
    public String comment(Model model) {
        model.addAttribute("listComments", commentService.getComment());
        return "comment";
    }

    @RequestMapping(value = "/createcomment",method = RequestMethod.GET)
    public String createcomment(Model model) {
      model.addAttribute("message", "test");
      return "createcomment";
    }

    //@RequestMapping(value="/addcomment", method=RequestMethod.POST)
    //public ModelAndView commentAdd(
    //    @RequestParam("name")String name,
    //    @RequestParam("text")String text,
    //    ModelAndView mav) {
 
    //  Comment c  = new Comment();
    //  c.setName(name);
    //  c.setText(text);
      
    //  repository.save(c);	// データベース保存
      
    //  mav.setViewName("comment");
 
    //  return mav;
//}
  //
	 //@RequestMapping(value = "/addcomment",method = RequestMethod.GET)
	 //public String addcomment(@RequestParam (name = "name")String name,@RequestParam(name = "text") String text,Model model) {	
   
   //Comment c  = new Comment();
   //c.setName(name);
   //c.setText(text);
   //repository.saveAndFlush(c);	// データベース保存
   
   //model.addAttribute("comment.name", commentService.saveComment());
   //model.addAttribute("comment.text", commentService.saveComment());
   //model.addAttribute("listComments", commentService.getComment());
	 //return "comment";
    //  return ${comment.name} + ${comment.text};
   //}

  @RequestMapping(value = "/addcomment",method = RequestMethod.GET)
  public String addcomment(@RequestParam (name = "id")String id,@RequestParam (name = "name")String name,@RequestParam(name = "text") String text, Model model){
    model.addAttribute("id", id);
    model.addAttribute("name", name);
    model.addAttribute("text", text);
    Comment c = new Comment();
		c.setId(c.getId());
		c.setName(c.getName());
		c.setText(c.getText());
   commentService.InsertComment(c);
    return "result";
  } 
}

 



