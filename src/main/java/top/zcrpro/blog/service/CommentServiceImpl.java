package top.zcrpro.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zcrpro.blog.domain.Comment;
import top.zcrpro.blog.repository.CommentRepository;

import javax.transaction.Transactional;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentRepository commentRepository;

	@Override
	@Transactional
	public void removeComment(Long id) {
		commentRepository.delete(id);
	}
	@Override
	public Comment getCommentById(Long id) {
		return commentRepository.findOne(id);
	}

}
