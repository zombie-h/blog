package com.san.blog.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author san
 * @version 创建时间：2016年12月13日 下午7:16:41
 */

@MappedSuperclass
public abstract class BaseModel {

	@Id
	@GeneratedValue
	private Integer id;// 数据库主键

	@Column(nullable = false)
	private Date addTime;// 创建时间

	@Column(nullable = false)
	private Date modifyTime;// 修改时间

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getAddTime() {
		return addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

}
