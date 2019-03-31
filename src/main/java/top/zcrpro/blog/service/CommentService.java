package top.zcrpro.blog.service;


import top.zcrpro.blog.domain.Comment;

public interface CommentService {

	Comment getCommentById(Long id);

	void removeComment(Long id);
}
