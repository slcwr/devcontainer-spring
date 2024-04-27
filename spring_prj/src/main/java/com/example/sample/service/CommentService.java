package com.example.sample.service;

import com.example.sample.entity.Comment;
import com.example.sample.repository.CommentRepository;
import com.example.sample.form.CommentForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CommentService {

    Comment c = new Comment();

   
    @Autowired
    CommentRepository repository;

    public List<Comment> getComment() {
        return repository.findAll();
    }

    public void InsertComment(Comment c) {
		repository.InsertData(
            c.getId(), 
			c.getName(), 
			c.getText());
	}

    /**
     * データベースにデータを登録する
     * @return
     */

    //public String savecomment(Comment comment) {
         //データベースに登録する値を保持するインスタンス
        //Comment comment  = new Comment();

        // 画面から受け取った値をデータベースに保存するインスタンスに渡す
        //comment.setName(comment.name);
        //comment.setText(comment.text);

        // データベースに登録する
        //repository.save(comment);
    //}
}
