<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  
  
 
  <%=session.getAttribute("num1") %>
  <%=session.getAttribute("num2")%>
  <%=session.getAttribute("num3")%>
  <%=session.getAttribute("num4")%>
  <br>
  <%
  List s = (ArrayList)session.getAttribute("LIST");
  %>

</body>
</html>