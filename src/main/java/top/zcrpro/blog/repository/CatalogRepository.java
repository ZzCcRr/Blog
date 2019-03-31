package top.zcrpro.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import top.zcrpro.blog.domain.Catalog;
import top.zcrpro.blog.domain.User;

import java.util.List;

public interface CatalogRepository extends JpaRepository<Catalog, Long>{

	List<Catalog> findByUser(User user);

	List<Catalog> findByUserAndName(User user, String name);
}
