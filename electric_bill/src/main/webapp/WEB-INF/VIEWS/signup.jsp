<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<c:url value="resources/css/signup.css"/>" rel="stylesheet">
<style>
#box_1
{
  background-image: url("<c:url value="resources/image/image2.jpg"/>");
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
</style>
</head>
<body>
       <div id="box_1">
       <form action="go" class="form" modalAttribute="user">
        <h2>FILL THE INFORMATION ACCORDINGLY</h2>
        
        <div class="input-group">
          <input type="text" name="username" id="username"  required>
          <label for="username" class="ft">name(employee)</label>
        </div>
        
        <div class="input-group">
          <input type="text" name="pass" id="pass"  required>
          <label for="pass" class="ft">set-password</label>
        </div>

        <div class="input-group">
            <input type="email" name="email" id="email" required>
            <label for="email" class="ft">email_id</label>
        </div>

        <div class="input-group">
            <input type="number" name="id" id="id"  required>
            <label for="id" class="ft">EMP-ID</label>
        </div>

        <div>
            <button type="submit"required id="but">
            SUBMIT</button>
        </div>

       </form>

    </div>
      
</body>
</html>