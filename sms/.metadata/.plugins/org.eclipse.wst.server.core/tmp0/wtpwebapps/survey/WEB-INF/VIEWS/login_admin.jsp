<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="<c:url value="resources/css/login.css"/>" rel="stylesheet">
 <script
      src="https://kit.fontawesome.com/64d58efce2.js"
      crossorigin="anonymous"
    ></script>
    <link rel="stylesheet" href="login.css" />
    <title>Sign in & Sign up Form</title>
</head>
<body>
	    <div class="container">
      <div class="forms-container">
        <div class="signin-signup">
          <form action="home_a" class="sign-in-form" method="post">
            <h2 class="title">Sign in</h2>
            <div class="input-field">
              <i class="fas fa-user"></i>
              <input type="text" placeholder="Username" name="user1"required/>
            </div>
            <div class="input-field">
              <i class="fas fa-lock"></i>
              <input type="password" placeholder="Password" name="pass1" required/>
            </div>
            <button type="submit" value="Login" class="btn solid">Login</button>
           
          </form>
          <form action="admin" class="sign-up-form">
            <h2 class="title">Sign up</h2>
            <div class="input-field">
              <i class="fas fa-user"></i>
              <input type="text" placeholder="Username" />
            </div>
            <div class="input-field">
              <i class="fas fa-envelope"></i>
              <input type="email" placeholder="Email" />
            </div>
            <div class="input-field">
              <i class="fas fa-lock"></i>
              <input type="password" placeholder="Password" />
            </div>
            <input type="submit" class="btn" value="Sign upp" />           
          </form>
        </div>
      </div>
      <div class="panels-container">
        <div class="panel left-panel">
          <div class="content">
            <h3>New here ?</h3>
            <p>
              Lorem ipsum, dolor sit amet consectetur adipisicing elit. Debitis,
              ex ratione. Aliquid!
            </p>
           <form action="admin_register">
              <button class="btn transparent" id="sign-up-btn">
              Sign up
            </button>
           </form>
          </div>
          <img src="img/log.svg" class="image" alt="" />
        </div>
        <div class="panel right-panel">
          <div class="content">
            <h3>One of us ?</h3>
            <p>
              Lorem ipsum dolor sit amet consectetur adipisicing elit. Nostrum
              laboriosam ad deleniti.
            </p>
            
            	<button class="btn transparent" id="sign-in-btn">
              Sign innn
            </button>
        
          </div>
          <img src="img/register.svg" class="image" alt="" />
        </div>
      </div>
    </div>	
</body>
</html>