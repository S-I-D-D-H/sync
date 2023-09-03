<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HOME PAGE</title>
<link href="<c:url value="resources/css/home.css"/>" rel="stylesheet">
</head>
<body>
  <header class="header">
    <nav class="navbar">
      <a href="#" class="logo">RESUME BUILDER</a>
      <ul class="nav-links">
        <li><form><button>About</button></form></li>
      </ul>
    </nav>
  </header>
  
  <section class="hero">
    <div class="hero-content">
      <h1 class="col">Welcome to Your Website</h1>
      <p class="col">LET US CREATE YOUR RESUME!!!</p>
      <br>
      <br>
      <form action="ind">
        <button class="btn">ADD INFORMATION</button>
      </form>
    </div>
  </section>
  
  <section class="features">
    <form action="t1">
    <button class="feature">
        <h2>TEMPLATE 1</h2>
        <p>Description of Feature 2.</p>
    </button>
    </form>
    
    <form action="t2">
    <button class="feature">
      <h2>TEMPLATE 2</h2>
      <p>Description of Feature 2.</p>
    </button>
    </form>
    
    <form action="t3">
    <button class="feature">
      <h2>TEMPLATE 3</h2>
      <p>Description of Feature 3.</p>
    </button>
    </form>
    
  </section>
  
  <footer class="footer">
    <p>&copy; 2023 Your Company. All rights reserved.</p>
  </footer>
</body>
</html>