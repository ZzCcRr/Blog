package top.zcrpro.blog.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import top.zcrpro.blog.domain.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>{
 
}
