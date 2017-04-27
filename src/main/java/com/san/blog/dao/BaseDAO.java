package com.san.blog.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.san.blog.common.ErrorCode;

/**
 * @author zombie
 * @version 创建时间：2017年4月12日 上午11:42:01 
 */
public class BaseDAO<T, PK extends Serializable>{
	
	private static final Logger logger = LogManager.getLogger(BaseDAO.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private Class<T> entityClass;
	
	public BaseDAO() {  
        Type genType = getClass().getGenericSuperclass();  
        Type[] params = ((ParameterizedType) genType).getActualTypeArguments();  
        entityClass = (Class) params[0];  
    }
	
	/**
	 * 添加实体
	 * 
	 * @param entity
	 * @return
	 */
	public String add(T entity) {
		try {
			//jdbcTemplate.save(entity);
			return ErrorCode.EC_OK;
		} catch (Exception e) {
			logger.error(e.toString());
			return ErrorCode.EC_FAILED;
		}
	}

	/**
	 * 更改实体
	 * 
	 * @param entity
	 * @return
	 */
	public String update(T entity) {
		try {
			//jdbcTemplate.update(entity);
			return ErrorCode.EC_OK;
		} catch (Exception e) {
			logger.error(e.toString());
			return ErrorCode.EC_FAILED;
		}
	}
	
	/**
	 * 更改实体
	 * 
	 * @param entity
	 * @return
	 */
	public String updateWithOpenSession(T entity) {
		try {
			//jdbcTemplate.updateWithOpenSession(entity);
			return ErrorCode.EC_OK;
		} catch (Exception e) {
			logger.error(e.toString());
			return ErrorCode.EC_FAILED;
		}
	}
	
	/**
	 * 查询所有实体
	 * 
	 * @return
	 */
	public List<T> queryAll() {
		List<T> ret  = null;//jdbcTemplate.findAll();
		return ret;
	}
	
	/**
	 * @param T
	 * @return
	 */
	public String delete(T entity) {
		try {
			//jdbcTemplate.delete(entity);
			return ErrorCode.EC_OK;
		} catch (Exception e) {
			logger.error(e.toString());
			return ErrorCode.EC_FAILED;
		}
	}
}
