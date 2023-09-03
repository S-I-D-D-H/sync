<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    background-image:url("<c:url value="resources/image/image2.jpg"/>") ;
    border-radius: 20px;
    color: #fff;
    box-shadow: 0 15px 25px rgba(0,0,0,0.5);
  }
</style>
</head>
<body>
      <div id="box_1">
       <form action="home" class="form">
        <h2>ENTER THE NEW CUSTOMER DETAILS</h2>
        
        <div class="input-group">
          <input type="text" name="cname" id="cname"  required>
          <label for="cname" class="ft">CUSTOMER NAME</label>
        </div>

        <div class="input-group">
            <input type="number" name="phone" id="phone"  required>
            <label for="phone" class="ft">CUSTOMER PHONE NUMBER</label>
          </div>

        <div class="input-group">
            <input type="email" name="cmail" id="cmail" required>
            <label for="cmail" class="ft">CUSTOMER EMAILID</label>
        </div>


        <div class="input-group">
            <input type="email" name="email_emp" id="loginPassword" placeholder="<%= session.getAttribute("qwer")%>" readonly>
            <label for="loginPassword" class="ft"></label>
        </div>

        <div class="input-group">
            <input type="number" name="mn" id="mn" required>
            <label for="mn" class="ft">Meter_Number</label>
        </div>
 
        <div class="input-group">
            <input type="number" name="mv" id="mv" required>
            <label for="mv" class="ft">Meter_Value</label>
        </div>

        <div class="input-group">
            <input type="text" name="cadd" id="cadd" required>
            <label for="cadd" class="ft">CUSTOMER ADDRESS</label>
        </div>

        <div>
            <button type="submit"required id="but">
            SUBMIT</button>
        </div>

       </form>

    </div>
</body>
</html>