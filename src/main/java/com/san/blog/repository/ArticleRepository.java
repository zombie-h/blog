package com.san.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.san.blog.model.Article;

/**
 * @author zombie
 * @version 创建时间：2016年12月20日 下午3:55:14 
 */
public interface ArticleRepository extends JpaRepository<Article, Integer>{
	
}
