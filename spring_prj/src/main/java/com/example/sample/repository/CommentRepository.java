package com.example.sample.repository;

import com.example.sample.entity.Comment;
import com.example.sample.controller.CommentController;
import com.example.sample.service.CommentService;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {
    @Modifying
	@Query(value = "INSERT INTO comment VALUES(:id, :name, :text)")
	void InsertData(@Param("id") Integer id, 
			        @Param("name") String name, 
			        @Param("text") String text);
}