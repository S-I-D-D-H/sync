<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>resources/css/hello.css">
<link href="<c:url value="resources/css/hello.css"/>" rel="stylesheet">
<style>
body 
{
  background-image: url("<c:url value="resources/image/image1.jpg"/>");
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
</style>
</head>
<body>
      <div id="ct">
      <div class="login-wrapper">
    <form action="home1" class="form" method="post">
      <img src="img/avatar.png" alt="">
      <h2>Login</h2>
      <div class="input-group">
        <input type="email" name="lu" id="lu" required>
        <label for="lu">User Name</label>
      </div>
      <div class="input-group">
        <input type="password" name="lp" id="lp" required>
        <label for="lp">Password</label>
      </div>
       <div>
       <button type="submit" value="Login" class="submit-btn">
      <p class="forgot-pw">LOGIN</p>
      </button>
      </div>
    </form>	
    </div>
  </div>
</body>
</html>