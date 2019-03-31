package top.zcrpro.blog.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import top.zcrpro.blog.domain.Blog;
import top.zcrpro.blog.domain.Catalog;
import top.zcrpro.blog.domain.User;

public interface BlogRepository extends JpaRepository<Blog, Long>{

	Page<Blog> findByUserAndTitleLikeOrderByCreateTimeDesc(User user, String title, Pageable pageable);

	Page<Blog> findByUserAndTitleLike(User user, String title, Pageable pageable);

	Page<Blog> findByTitleLikeAndUserOrTagsLikeAndUserOrderByCreateTimeDesc(String title, User user, String tags, User user2, Pageable pageable);

	Page<Blog> findByCatalog(Catalog catalog, Pageable pageable);
}
