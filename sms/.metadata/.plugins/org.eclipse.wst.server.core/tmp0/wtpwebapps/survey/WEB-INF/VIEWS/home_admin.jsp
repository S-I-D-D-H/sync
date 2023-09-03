<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<c:url value="resources/css/style.css"/>" rel="stylesheet">
	<style>       
        body
        {
            height: 100vh;
            width: 100vw;
            display: flex;
            justify-content: center;
            flex-direction: column;
            align-items: center;
       		 background-image: url("<c:url value="resources/image/image4.jpg"/>");
            background-size: cover;
        }
        .container
        {
            /* border: 2px solid black; */
            height: 60vh;
            width:30vw;
            display: flex;
            flex-direction: column;
            justify-content: center;
        }
        .main
        {
            /* border: 2px solid black; */
            height: 30vh;
            width: 100vw;
            display: flex;
            flex-direction: column;
            align-items: center;
            font-size: larger;
        }
        .hel
        {
            font-weight: bold;
        }
    </style>
</head>
<body>
    <div class="main">
     
   
        <h1>CREATE A SURVEY</h1>
    </div>

    <div class="container">
        <form action="create">
           <button class="btn btn1" class="hel">CREATE</button>
        </form>
        <form action = "view">
          <button class="btn btn2" class="hel">VIEW</button>
        </form>
        <br>
        

        <form action="back">
            <button class="btn btn3" class="hel">BACK</button>
        </form>
    </div>
</body>
</html>