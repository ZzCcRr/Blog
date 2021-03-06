package top.zcrpro.blog.service;


import top.zcrpro.blog.domain.Catalog;
import top.zcrpro.blog.domain.User;

import java.util.List;


public interface CatalogService {

	Catalog saveCatalog(Catalog catalog);
	

	void removeCatalog(Long id);


	Catalog getCatalogById(Long id);

	List<Catalog> listCatalogs(User user);
}
