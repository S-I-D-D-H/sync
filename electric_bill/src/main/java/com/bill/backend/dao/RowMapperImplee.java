package com.bill.backend.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bill.backend.entities.customer;
import com.bill.backend.entities.employee;

public class RowMapperImplee implements RowMapper<employee>
{

	public employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		employee ae = new employee();
		
		
		
		ae.setId(rs.getInt(1));
		ae.setName(rs.getString(2));
		ae.setPassword(rs.getString(3));
		ae.setEmailid(rs.getString(4));
		
		return ae;
	}

}
