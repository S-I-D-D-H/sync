package com.survey.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.survey.entities.ADMIN;

public class RowMapperImple implements RowMapper<ADMIN> 
{

	public ADMIN mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		
		ADMIN as = new ADMIN();
		as.setEmpid(rs.getInt(1));
		as.setPassword(rs.getString(2));
		as.setUsername(rs.getString(3));
		
		// TODO Auto-generated method stub
		return as;
	}
   
}
