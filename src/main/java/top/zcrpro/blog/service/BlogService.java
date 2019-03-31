package top.zcrpro.blog.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import top.zcrpro.blog.domain.Blog;
import top.zcrpro.blog.domain.Catalog;
import top.zcrpro.blog.domain.User;

public interface BlogService {

	Blog saveBlog(Blog blog);

	void removeBlog(Long id);

	Blog getBlogById(Long id);

	Page<Blog> listBlogsByTitleVote(User user, String title, Pageable pageable);

	Page<Blog> listBlogsByTitleVoteAndSort(User suser, String title, Pageable pageable);

	Page<Blog> listBlogsByCatalog(Catalog catalog, Pageable pageable);

	void readingIncrease(Long id);

	Blog createComment(Long blogId, String commentContent);

	void removeComment(Long blogId, Long commentId);

	Blog createVote(Long blogId);

	void removeVote(Long blogId, Long voteId);
}
