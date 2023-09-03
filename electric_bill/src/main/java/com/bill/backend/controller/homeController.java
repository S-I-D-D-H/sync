package com.bill.backend.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bill.backend.dao.RowMapperImple;
import com.bill.backend.dao.RowMapperImplee;
import com.bill.backend.entities.customer;
import com.bill.backend.entities.employee;

@Controller
public class homeController 
{	 
	@RequestMapping("")
   public String home()
   {
		System.out.println("HELLO");
	   return "main";
   }
	@RequestMapping("/up")
	 public ModelAndView showsignup(HttpServletRequest request, HttpServletResponse response)
	 {
         ModelAndView obj = new ModelAndView();
		 obj.setViewName("signup");
		 return obj;
	 }
	@RequestMapping("/log")
	 public ModelAndView login(HttpServletRequest request, HttpServletResponse response)
	 {
		 ModelAndView obj = new ModelAndView();
		 obj.setViewName("app1");
		 return obj;
	 }
	
	@RequestMapping("/go")
	 public ModelAndView goback(HttpServletRequest request, HttpServletResponse response)
	 {
		 int i = Integer.parseInt(request.getParameter("id"));
		 String a = request.getParameter("username").toString();
		 String b = request.getParameter("pass").toString();
		 String c = request.getParameter("email").toString();
		 ModelAndView obj1 = new ModelAndView();
//		 d.register(i, a, b, c);
		 
		 
		 ApplicationContext as = new ClassPathXmlApplicationContext("com/bill/backend/hello.xml");
		 JdbcTemplate temp = as.getBean("jdbcTemplate",JdbcTemplate.class);
		 
		 String query = "insert into data2(id,name,password,emailid) values(?,?,?,?)";
		 
		 int update = temp.update(query,i,a,b,c);
       System.out.println("numbers of record inserted...." + update);
        obj1.addObject(i);
        obj1.addObject(c);
        
        HttpSession session = request.getSession();
        session.setAttribute("id", i);
        session.setAttribute("email", c);
        
		 obj1.setViewName("main");
		 return obj1;
	 }
	
	@RequestMapping("/home1")
	public ModelAndView homeview(HttpServletRequest request, HttpServletResponse response)
	{
		 String s = request.getParameter("lu").toString();
		 String a = request.getParameter("lp").toString();	
		 
		 HttpSession session= request.getSession();
		 session.setAttribute("qwer", s);
		 
		 
		 ModelAndView obj = new ModelAndView();
			 System.out.println("ENTER");
			 ApplicationContext ac = new ClassPathXmlApplicationContext("com/bill/backend/hello.xml");
				JdbcTemplate temp = ac.getBean("jdbcTemplate",JdbcTemplate.class);
				String query="select * from data2";
				RowMapper<employee> rm = new RowMapperImplee();
				List<employee> result = temp.query(query,rm);
				 for(employee e: result)
			       {
					 String p = e.getEmailid();
					 String r = e.getPassword();
			    	   if(s.compareTo(p)==0 && a.compareTo(r)==0)
			    	   {
			    		   System.out.println("entered");
			    		   obj.setViewName("home");
			    		   return obj;
			    	   }
			    	  
			    	   p="";
			    	   r="";
//			    	   }
//					 System.out.println(e);
			       }
		
		 
		
		 obj.setViewName("app1");
		 return obj;
	}
	
	@RequestMapping("/home")
	public ModelAndView homepage(HttpServletRequest request, HttpServletResponse response)
	{
		String a = request.getParameter("cname").toString();
		int b = Integer.parseInt(request.getParameter("phone"));
		String c = request.getParameter("cmail").toString();
		String d = request.getParameter("mn").toString();
		String e = request.getParameter("mv").toString();
		String f = request.getParameter("cadd").toString();
		
		 ApplicationContext as1 = new ClassPathXmlApplicationContext("com/bill/backend/hello.xml");
		 JdbcTemplate temp = as1.getBean("jdbcTemplate",JdbcTemplate.class);
		 
		 String query = "insert into customer(cname,cphone,cemail,mno,mvalue,cadd) values(?,?,?,?,?,?)";
		 
		 int update = temp.update(query,a,b,c,d,e,f);
       System.out.println("numbers of record inserted in customer...." + update);
		
		 ModelAndView obj = new ModelAndView();
		 obj.setViewName("home");
		 return obj;
	}
	@RequestMapping("/his")
	public ModelAndView historypage(HttpServletRequest request, HttpServletResponse response)
	{
		 ModelAndView obj = new ModelAndView();
		 obj.setViewName("his");
		 return obj;
	}
	@RequestMapping("/update1")
	public ModelAndView aboutpage(HttpServletRequest request, HttpServletResponse response)
	{
		 ModelAndView obj = new ModelAndView();
		 obj.setViewName("update1");
		 return obj;
	}
	@RequestMapping("/col")
	public ModelAndView collectionpage(HttpServletRequest request, HttpServletResponse response)
	{
		 ModelAndView obj = new ModelAndView();
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/bill/backend/hello.xml");
		JdbcTemplate temp = ac.getBean("jdbcTemplate",JdbcTemplate.class);
		String query="select * from customer";
		RowMapper<customer> rm = new RowMapperImple();
		List<customer> result = temp.query(query,rm);	
		 HttpSession session = request.getSession();
		 session.setAttribute("view", result);
		 obj.setViewName("details");
		 return obj;	
	}
	@RequestMapping("/bill")
	public ModelAndView billpage(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView obj = new ModelAndView();
		obj.setViewName("cust");
		return obj;	
	}
	@RequestMapping("/upd2")
	public ModelAndView updatepage(HttpServletRequest request, HttpServletResponse response)
	{
		String s = request.getParameter("cust").toString();
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/bill/backend/hello.xml");
		JdbcTemplate temp = ac.getBean("jdbcTemplate",JdbcTemplate.class);
		String query="select * from customer where cname=?";
		RowMapper<customer> rm = new RowMapperImple();
		List<customer> result1 = temp.query(query,rm,s);
	    for(customer p: result1)
	    {
	    	System.out.println(p);
	    }
	    HttpSession session = request.getSession();
	    session.setAttribute("LIST", result1);
		ModelAndView obj = new ModelAndView();
		obj.setViewName("update2");
		return obj;	
	}
	@RequestMapping("/main")
	public ModelAndView mainpage(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView obj = new ModelAndView();
		obj.setViewName("main");
		return obj;	
	}
	@RequestMapping("/bye")
	public ModelAndView mainpage2(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView obj = new ModelAndView();
		obj.setViewName("home");
		return obj;	
	}
	
	
}
