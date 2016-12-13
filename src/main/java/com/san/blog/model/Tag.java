package com.san.blog.model;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author san
 * @version 创建时间：2016年12月13日 下午8:21:51 
 */
@Entity
public class Tag extends BaseModel{
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = true)
	private String description;
}
