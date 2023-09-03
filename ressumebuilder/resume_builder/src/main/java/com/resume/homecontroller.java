package com.resume;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homecontroller 
{

	
  @RequestMapping("")
  public ModelAndView view(HttpServletRequest request, HttpServletResponse response)
  {
	  ModelAndView mv = new ModelAndView();
	  mv.setViewName("home");
	  return mv;
  }
  
  @RequestMapping("/ind")
  public ModelAndView viewindex(HttpServletRequest request, HttpServletResponse response)
  {
	  ModelAndView mv = new ModelAndView();
	  mv.setViewName("form");
	  return mv;
  } 
  
  @RequestMapping("/go")
  public ModelAndView homeindex(HttpServletRequest request, HttpServletResponse response)
  {
	 HttpSession session = request.getSession();  
	  ArrayList<String> s1 = new ArrayList<String>();
	  ArrayList<String> s2 = new ArrayList<String>();
	  ArrayList<String> s3 = new ArrayList<String>();
	  ArrayList<String> s4 = new ArrayList<String>();
	  ArrayList<String> s5 = new ArrayList<String>();
	  ArrayList<String> s6 = new ArrayList<String>();
	  int a = Integer.parseInt(request.getParameter("in1"));
	  session.setAttribute("a", a);
	  int f = Integer.parseInt(request.getParameter("in2"));
	  session.setAttribute("f", f);
	  int c = Integer.parseInt(request.getParameter("in3"));
	  session.setAttribute("c", c);
	  int d = Integer.parseInt(request.getParameter("in4"));
	  session.setAttribute("d", d);
	  int e = Integer.parseInt(request.getParameter("in5"));
	  session.setAttribute("e", e);
	  int h = Integer.parseInt(request.getParameter("in6"));
	  session.setAttribute("h", h);
	  int b=0;
	  for(int i = 0; i<a; i++)
	  {
		  s1.add(request.getParameter(""+b).toString());
		  b++;
	  }
	  int m1 = 10;
	  for(int i = 0; i<f; i++)
	  {
		  s2.add(request.getParameter(""+m1).toString());
		  m1++;
	  }
	  int m2 =0;
	  for(int i = 0; i<c; i++)
	  {
		  s3.add(request.getParameter("a"+m2).toString());
		  s3.add(request.getParameter("b"+m2).toString());
		  s3.add(request.getParameter("c"+m2).toString());
		  m2++;
	  }
      int m3=0;
	  for(int i = 0; i<d; i++)
	  {
		  s4.add(request.getParameter("d"+m3).toString());
		  s4.add(request.getParameter("e"+m3).toString());
		  s4.add(request.getParameter("f"+m3).toString());
		  m3++;
	  }
	  int m4=0;
	  for(int i = 0; i<e; i++)
	  {
		  s5.add(request.getParameter("g"+m4).toString());
		  s5.add(request.getParameter("p"+m4).toString());
		  m4++;
	  }
	  int m5=0;
	  for(int i = 0; i<h; i++)
	  {
		  s6.add(request.getParameter("l"+m5).toString());
		  s6.add(request.getParameter("m"+m5).toString());
		  s6.add(request.getParameter("n"+m5).toString());
		  m5++;
	  }
	  session.setAttribute("s1", s1);
	  session.setAttribute("s2", s2);
	  session.setAttribute("s3", s3);
	  session.setAttribute("s4", s4);
	  session.setAttribute("s5", s5);
	  session.setAttribute("s6", s6);
	  
	  
	  System.out.println(s1);
	  System.out.println(s2);
	  System.out.println(s3);
	  System.out.println(s4);
	  System.out.println(s5);
	  
	  String name = request.getParameter("name").toString();
	  session.setAttribute("name", name);
	  String surname = request.getParameter("surname").toString();
	  session.setAttribute("surname", surname);
	  String des = request.getParameter("designation").toString();
	  session.setAttribute("desig", des);
	  
	  String description = request.getParameter("description").toString();
	  session.setAttribute("dec", description);
	  String mail = request.getParameter("mail").toString();
	  session.setAttribute("mail", mail);
	  String city = request.getParameter("City").toString();
	  session.setAttribute("city", city);
	  String state = request.getParameter("state").toString();
	  session.setAttribute("state", state);
	  
	  String Insta = request.getParameter("Insta").toString();
	  session.setAttribute("ur1", Insta);
	  String hub = request.getParameter("Insta1").toString();
	  session.setAttribute("ur2", hub);
	  	
	  long numb=Long.parseLong(request.getParameter("phone"));
	  session.setAttribute("num", numb);
	  System.out.println(city);
	  ModelAndView mv = new ModelAndView();
	  mv.setViewName("home2");
	  return mv;
  } 
  
  @RequestMapping("/t1")
  public ModelAndView viewt1(HttpServletRequest request, HttpServletResponse response)
  {
	  ModelAndView mv = new ModelAndView();
	  mv.setViewName("t1");
	  return mv;
  } 
  
  @RequestMapping("/t2")
  public ModelAndView viewt2(HttpServletRequest request, HttpServletResponse response)
  {
	  ModelAndView mv = new ModelAndView();
	  mv.setViewName("t2");
	  return mv;
  } 
  
  @RequestMapping("/t3")
  public ModelAndView viewt3(HttpServletRequest request, HttpServletResponse response)
  {
	  ModelAndView mv = new ModelAndView();
	  mv.setViewName("t3");
	  return mv;
  } 
   
}
