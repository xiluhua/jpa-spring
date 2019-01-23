

package com.jpa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jpa.dao.CustomerDao;
import com.jpa.entity.Customer;
import com.jpa.service.CustomerService;

@Service
public class CustomerImpl implements CustomerService{
	
	@Autowired
	private CustomerDao customerDao;
	
	@Transactional
	@Override
	public void save(Customer entity){
		customerDao.save(entity);
		
		// 测试 rollback
//		int i = 10/0;
//		System.out.println(i);
	}
}
