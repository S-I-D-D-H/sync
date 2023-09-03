<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
        *
        {
            margin: 0px;
            padding: 0px;
        }
        body
        {
            height: 100vh;
            width: 100vw;
            display: flex;
            background-image: url("bgimage.jpg");
            flex-direction:column;
        }
        #box_1
        {
           
            height: 20vh;
            width: 99.7vw;
            
            display: flex;
            flex-direction: row;

            justify-content: center;
        }
        #box_2
        {
           
            height: 80vh;
            width: 100vw;
            display: flex;
            flex-direction: row;
            background: transparent;
        }
        #c1
        {
            height: 80vh;
            width: 49.8vw;
            /* border-right:5px solid #ef476f; */
            /* border: 1px solid black; */
            /* border-radius: 5px; */
        }
        #c2
        {
            height: 80vh;
            width: 51vw;
          
        }
        button
        {
            height: 80vh;
            width: 49.8vw;  
            border: 0px;
            background:transparent
        }
        #txt
        {
            padding-top: 50px;
        }
        .txt
        {
            font-size: 30px;
           font-weight: bold;
        }
        #b1:hover
        {
            background-color: #0096c7;
            transition: 2s;
            
            border-radius: 20px;
            cursor: pointer;
        }
        #b2:hover
        {
            background-color: #f77f00;
            transition: 2s;
          
            border-radius: 20px;
            cursor: pointer;
        }
    </style>
</head>
<body>
	 <div id="box_1">
        <h1 id="txt">ONLINE SURVEY MANAGEMENT SYSTEM</h1>
    </div>
    <div id="box_2">
        <div id="c1">
            <form action="admin">
            	<button type="submit" class="txt" id="b1">ADMIN</button>
            </form>
        </div>
        <div id="c2">
             <form action="user">
             	 <button type="submit" class="txt" id="b2">USER</button>
             </form>
        </div>
    </div>
</body>
</html>