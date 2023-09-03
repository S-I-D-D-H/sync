<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HOME PAGE</title>
<link href="<c:url value="resources/css/home.css"/>" rel="stylesheet">
<style>
    .header
{
    min-height: 100vh;
    width: 100%;
    background-image: linear-gradient(rgba(4,9,30,0.7),rgba(4,9,30,0.7)), url("<c:url value="resources/image/image3.jpg"/>");
    background-position: center;
    background-size: cover;

    /* what ? */
    position: relative; 

}
  		.butt
  {
  
     display: inline-block;
    text-decoration: none;
    color: white;
    border: 1px solid white;
    padding: 12px 34px;
    font-size: 13px;
    background: transparent;
    cursor: pointer;
  }
  .butt:hover
{
    border: 1px solid #f44336;
    background-color: #f44336;
    transition: 1s;
}
  
</style>
</head>
<body>
       <section class="header">
        <nav>
            <!-- <a href="index.html"><img src="logo.png"></a> -->
            <div class="nav-links" id="navLinks">
                <!-- <i class="fa fa-times"></i> -->
                <!-- <i class="fa-regular fa-xmark"></i> -->
                <i class="fa fa-times" onclick="hidemenu()"></i>

                <ul>
                    
                    <form action="col">
                        <li class = "fta"><button type="submit" id="one">CUSTOMER DETAILS</button></li>
                    </form>
                   <form action="update1">
                     <li class = "fta"><button TYPE="submit" id="two">GENERATE BILL</button></li>
                   </form>
                    <!-- <li><a href="">BLOG</a></li> -->
                    <!-- <li><a href="">CONTACT</a></li> -->

                </ul>

            </div>
            <i class="fa fa-bars" onclick="showmenu()"></i>            
        </nav>
    <div class="text-box">
        <h1>ELECTRIC BILLING SYSTEM</h1>
        <p>
           PREPARED BY :- SIDDH KOTHARI
        </p>
        			<form action="bill">
                     <li class = "fta"><button TYPE="submit" class="butt">NEW CUSTOMER</button></li>
                   </form>
                   <br>
                   <br>
                   <br>
                   <form action="main">
                     <li class = "fta"><button TYPE="submit" class="butt">BACK</button></li>
                   </form>
    </div>
    </section>
    <script>
        var navLinks=documnet.getElementById("navLinks");
        function showmenu()
        {
            navLinks.style.right="0";
        }
        function hidemenu()
        {
            navLinks.style.right="-200px";
        }
    </script>
</body>
</html>