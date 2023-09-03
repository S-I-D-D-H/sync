<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
      
    <%@ page import="java.util.List" %>
    <%@ page import="com.bill.backend.entities.customer" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<c:url value="resources/css/cust.css"/>" rel="stylesheet">
<style type="text/css">
.form {
    font-size: 30px;
    width: 70vw;
    height: 110vh;
    /* position: relative; */
    /* width: 100%;
    max-width: 380px; */
    /* padding: 80px 40px 40px; */
    background-color:black;
   
    border-radius: 20px;
    color: #fff;
    box-shadow: 0 15px 25px rgba(0,0,0,0.5);
  }
  #container
  {
    background-color:while;
    color:black;
  }
  .head
  {
    color: orange;
  }
  body
  {
   bakground-color: wheat;
  }
</style>
</head>
<body>
          <form action="bye" id="container">
           <div id = "box_1">
          <div id="c1">
          
          <h1 text-align="center">ELECTRIC BILLING SYSTEM</h1>
          <br>
          <br>
          <br>
            <% List<customer> result = (List<customer>)session.getAttribute("LIST");
           System.out.println("HI");
           %>
           <h2 class="head">Customer_Names</h2>
           
           <br>
           <%for(customer s: result)
	       {
	    	   out.println(s.getCname()); 
	    	%>
	    	 <br>
	    	 <br>
	       <%} %>
          </div>
          
           <div id="c2">
          <h2 class="head"><% System.out.println("HI");
           out.println("Phone number");%></h2>
           
           <br>
           <%for(customer s: result)
	       {
	    	   out.println(s.getPhone()); 
	    	%>
	    	 <br>
	    	 <br>
	       <%} %>
          </div>
          
          <div id="c3">
          <h2 class="head"> <%out.println("Email");%></h2>
           
           <br>
           <%for(customer s: result)
	       {
	    	   out.println(s.getCmail()); 
	    	%>
	    	 <br> 
	    	 <br>
	       <%} %>
          </div>
          
           <div id="c4">
          <h2 class="head"> <%out.println("Address");%></h2>
           
           <br>
           <%for(customer s: result)
	       {
	    	   out.println(s.getCadd()); 
	    	%>
	    	 <br>
	    	 <br>
	       <%} %>
          </div>
          
          <div id="c4">
           <h2 class="head"><%out.println("Meter_no");%></h2>
           
           <br>
           <%for(customer s: result)
	       {
	    	   out.println(s.getMno()); 
	    	%>
	    	 <br>
	    	 <br>
	       <%} %>
          </div>
          
          <div id="c3">
           <h2 class="head"><%out.println("Total Bill/month");%></h2>
           
           <br>
           <%for(customer s: result)
	       {
	    	   out.println(s.getMvalue()); 
	    	%>
	    	 <br>
	    	 <br>
	       <%} %>
	       
	       </div>
          <div id="box_2">
           <button type="submit" id="but">GO</button>
          </div>
          </div>
          
           
           
           </form>
</body>
</html>