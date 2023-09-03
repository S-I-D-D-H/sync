<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<c:url value="resources/css/cust.css"/>" rel="stylesheet">
<style>
	body
{
    display: flex;
    justify-content: center;
    padding-top: 40px;
    /* background-image: url("abstract-technology-circuit-lines-diagram-background.zip"); */
    /* background-color: #2a9d8f;
     */
     background-image: url("<c:url value="resources/image/image4.jpg"/>");
     background-size: cover;
}
</style>
</head>
<body>
     <div id="box_1">
      <form action="sub1" class="form">
        <h2>ENTER THE NEW USER DETAILS</h2>
        
        <div class="input-group">
          <input type="text" name="Username" id="Username"  required>
          <label for="loginUser" class="ft">USERNAME</label>
        </div>

        <div class="input-group">
            <input type="password" name="pass" id="pass"  required>
            <label for="loginUser" class="ft">PASSWORD</label>
          </div>

          <div class="input-group">
            <input type="number" name="empid" id="empid"  required>
            <label for="loginUser" class="ft">EMP_ID</label>
          </div>
  
          <div >
            
            	<button type="submit" >submit</button>

          </div>      
       </form>

    </div>
</body>
</html>