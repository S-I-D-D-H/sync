<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<c:url value="resources/css/update1.css"/>" rel="stylesheet">
<style type="text/css">

  .form 
  {
    font-size: 30px;
    width: 70vw;
    height: 60vh;
    /* position: relative; */
    /* width: 100%;
    max-width: 380px; */
    /* padding: 80px 40px 40px; */
   background-image:url("<c:url value="resources/image/image2.jpg"/>") ;
    border-radius: 20px;
    color: #fff;
    box-shadow: 0 15px 25px rgba(0,0,0,0.5);
  }
  
</style>
</head>
<body>
     <div id="box_1">
       <form action="upd2" class="form">
        <h2>ENTER THE NEW CUSTOMER DETAILS</h2>
        
        <div class="input-group">
            <input type="text" name="cust" id="cust" required>
            <label for="cust" class="ft">CUSTOMER NAME</label>
        </div>

       

        <div>
            <button type="confirm"required id="but">
            SUBMIT</button>
        </div>

       </form>

    </div>
</body>
</html>