<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="java.util.*" %>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link href="<c:url value="resources/css/form.css"/>" rel="stylesheet">
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

.content
{
  font-size:25px;
  margin:10px;
  
}
.header
{
 background-color: #429afd;
}
</style>
</head>
<body>
     <form action="go1" method="post">
     <div class="container">
     
     <div class="header">
     
     <div><h2 id="title">NAME OF SURVEY</h2><%=session.getAttribute("num4")%></div>      
           <br>
           <div><h2 id="title">DESCRIPTION</h2> <%=session.getAttribute("num3")%></div>
            <br>
             <div><h2 id="title">NAME OF CREATOR</h2><%=session.getAttribute("num2")%></div>
             <br>
             <div><h2 id="title">EMAIL ID</h2> <%=session.getAttribute("num1")%></div>
              <br>
     
     </div>
   
      <%
      int count=1;
      int a=0;
      int b=0;
      ArrayList result = (ArrayList)session.getAttribute("ques");
  
      int n = (Integer)session.getAttribute("num");
      if(result==null)
      {
    	  out.println("NO SURVEYS AVAILABLE: ");
      }
      else
      {
      for(int i=0; i<result.size(); i+=5)
      {
    	  a++;
    	  count=1;
    	 out.println("<html><body> <div class='content'>      </body></html>");
    	  out.println(result.get(i));
    	  out.println("<html><body> </div>      </body></html>");
    	  
    	  for(int j=i+1; j<result.size(); j++)
    	  {
    		  b++;
    		  if(count==5)
    		  {
    			  break;
    		  }%>
    		  <div class="form-group">
    		  <input type="radio" name = "select<%=a%>" value="<%=result.get(j) %>" required>  <%=result.get(j)%>  <br>
    		  </div>
    		 <% count++;
    	  }
    	 
      }
      }
      %>
      
      <button type="submit" id="submit" class="btn">
          SUBMIT
      </button>
     
      </div>
      </form>
</body>
</html>