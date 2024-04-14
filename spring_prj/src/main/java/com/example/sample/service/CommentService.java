package com.example.sample.service;

import com.example.sample.entity.CommentEntity;
import com.example.sample.repository.CommentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CommentService {
    @Autowired
    CommentRepository commentRepository;

    public List<CommentEntity> getComment() {
        return commentRepository.findAll();
    }

    //public List<CommentEntity> postComment() {
        //return commentRepository.save();
    //}
}
