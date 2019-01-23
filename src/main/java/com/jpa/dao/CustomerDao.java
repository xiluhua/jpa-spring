package com.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.jpa.entity.Customer;

@Repository
public class CustomerDao {

	// 获取和当前事务相关联的 EntityManager
	@PersistenceContext
	private EntityManager entityManager;
	
	public void save(Customer entity){
		entityManager.persist(entity);
	}
}
