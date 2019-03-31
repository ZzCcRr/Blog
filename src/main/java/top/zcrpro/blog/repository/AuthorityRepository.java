package top.zcrpro.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.zcrpro.blog.domain.Authority;


public interface AuthorityRepository extends JpaRepository<Authority, Long>{
}
