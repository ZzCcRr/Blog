package top.zcrpro.blog.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import top.zcrpro.blog.domain.User;

import java.util.Collection;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long>{

	Page<User> findByNameLike(String name, Pageable pageable);

	User findByUsername(String username);

	List<User> findByUsernameIn(Collection<String> usernames);
}
