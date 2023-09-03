package com.bill.backend.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bill.backend.entities.employee;

@Repository
public interface inernface 
{
	 public int insert(employee st);
	 public int change(employee st);
	 public List<employee> get_all_student();
}
