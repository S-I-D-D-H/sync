package com.bill.backend.dao;

import java.sql.ResultSet;


import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bill.backend.entities.customer;


public class RowMapperImple implements RowMapper<customer>
{

	public customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		customer as = new customer();
		
		as.setCname(rs.getString(1));
		as.setPhone(rs.getInt(2));
		as.setCmail(rs.getString(3));
		as.setMno(rs.getInt(4));
		as.setMvalue(rs.getInt(5));
		as.setCadd(rs.getString(6));
		
		
//		aq.setId(rs.getInt(1));
//		aq.setName(rs.getString(2));
//		aq.setPassword(rs.getString(3));
//		aq.setEmailid(rs.getString(4));
		return as;
	}

}
