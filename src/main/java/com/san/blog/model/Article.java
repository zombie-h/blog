package com.san.blog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

/**
 * @author san
 * @version 创建时间：2016年12月13日 下午5:42:46 
 */

@Entity
public class Article extends BaseModel{
	
	@Column(length = 100, nullable = false)
	private String title;
	
	@Type(type="text")
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
