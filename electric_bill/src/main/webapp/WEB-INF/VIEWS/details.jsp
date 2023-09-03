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

<style type="text/css">
  body
  {
   background-image:url("<c:url value="resources/image/image2.jpg"/>");
  }
  @charset "UTF-8";
body
{
	width:100vw;
	height:100vh;
	display:flex;
}
#container
{
	display: flex;
	flex-direction: column;
}
#box_1
{
	width: 95vw;
	height: 90vh;
	font-size: 20px;
	display: flex;
	flex-direction: row;
	justify-content: space-between;
	color: white;
}
#box_2
{
	width:100vw;
	height:10vh;
	display: flex;
	align-items: center;
	justify-content:center;
}

        table {
            border-collapse: separate;
            border-spacing: 10px; /* Adjust this value to control spacing */
        }
        th, td {
            padding: 10px; /* Add padding to cells for better visual separation */
        }
  
</style>
</head>
<body id="bod">
           <form action="home" id="container">
           <div id = "box_1">
          <div id="c1">
          
            <% List<customer> result = (List<customer>) session.getAttribute("view");
           System.out.println("HI");
           %>
           <h2>Customer_Names</h2>
           
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
          <h2><% System.out.println("HI");
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
          <h2> <%out.println("Email");%></h2>
           
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
          <h2> <%out.println("Address");%></h2>
           
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
           <h2><%out.println("Meter_no");%></h2>
           
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
           <h2><%out.println("Total Bill/month");%></h2>
           
           <br>
           <%for(customer s: result)
	       {
	    	   out.println(s.getMvalue()); 
	    	%>
	    	 <br>
	    	 <br>
	       <%} %>
          </div>
          
           </div>
          <div id="box_2">
           <button type="submit" id="but">GO</button>
          </div>
           
           </form>
</body>
</html>