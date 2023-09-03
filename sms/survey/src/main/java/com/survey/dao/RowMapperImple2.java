package com.survey.dao;

import java.sql.ResultSet;
import java.sql.SQLException;


import org.springframework.jdbc.core.RowMapper;

import com.survey.entities.USER;

public class RowMapperImple2 implements RowMapper<USER>  
{

	public USER mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		USER u1 = new USER();
		u1.setUserid(rs.getInt(1));
		u1.setPassword(rs.getString(2));
		u1.setUsername(rs.getString(3));
		
		
		return u1;
	}

}
