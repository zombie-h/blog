package com.san.blog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author san
 * @version 创建时间：2016年12月13日 下午5:42:46 
 */

@Entity
@Table(name = "article")
public class Article extends BaseModel{
	
	@Column(length = 800, nullable = false)
	private String title;
	
	@Column(length = 65535, nullable = false)
	private String content;
	
	@Column(nullable = false)
	private int category;
	
	@Column(nullable = false)
	private int deleted;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public int getDeleted() {
		return deleted;
	}

	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}
	
}
