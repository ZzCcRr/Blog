package top.zcrpro.blog.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import top.zcrpro.blog.domain.Vote;

public interface VoteRepository extends JpaRepository<Vote, Long> {
 
}
