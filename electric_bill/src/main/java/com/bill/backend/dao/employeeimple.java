package com.bill.backend.dao;

import java.util.List;

import com.bill.backend.entities.employee;
import com.mysql.cj.jdbc.MysqlDataSource;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.AbstractDataSource;
import org.springframework.stereotype.Repository;

@Repository
public class employeeimple 
{
//	@Autowired
	private JdbcTemplate jb;
	
	
	
	public JdbcTemplate getJb() {
		return jb;
	}

    
//    @Autowired
	public employeeimple() 
    {
//    	this.jb = new JdbcTemplate();
		ApplicationContext as = new ClassPathXmlApplicationContext("com/bill/backend/hello.xml");
	     this.jb = as.getBean("jb1",JdbcTemplate.class);
	}



	public void setJb(JdbcTemplate jb) {
		this.jb = jb;
	}



	public int insert(employee st) 
	{
		System.out.print("HI");
		System.out.println(st);
		String s = st.getName();
		System.out.println(s);
		String query = "insert into data2(id,name,password,emailid) values(?,?,?,?)";
	    int r = this.jb.update(query, st.getId(), st.getName(), st.getPassword(), st.getEmailid());
		return r;
//		return 0;
	}
	

//	public int change(employee st) {
//		String query = "update employee set name=?, Emailid=?, password=? where id=?";
//		int r = this.jb.update(query, st.getName(), st.getEmailid(), st.getPassword(), st.getId());
//		return r;
//	}
//
//	public List<employee> get_all_student() 
//	{
//		String query="select * from employee";
//		RowMapper<employee> rm = new RowMapperImple();
//		List<employee> r = this.jb.query(query,rm);	
//		return r;
//	}
	
}
