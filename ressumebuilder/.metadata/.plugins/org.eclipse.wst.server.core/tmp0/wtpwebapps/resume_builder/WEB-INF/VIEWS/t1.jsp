<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <script src="https://unpkg.com/feather-icons"></script>
<title>Insert title here</title>
<link href="<c:url value="resources/css/t1.css"/>" rel="stylesheet">
</head>
<body>
   <div class="container">
    <div class="profile">
      <div class="profile_container">
        
        <div>
          <h1 class="profile_name">
            <span class="profile_name_firstName"><%=session.getAttribute("name") %></span>
            <span class="profile_name_lastName"><%=session.getAttribute("surname") %></span>
          </h1>
          <p class="profile_title"><%=session.getAttribute("desig") %></p>
          <p class="description profile_description">
            <%=session.getAttribute("dec") %>
          </p>
          <a class="downloadBtn" href="./cv.pdf" download="Resume.pdf">Download Resume</a>
        </div>
      </div>
    </div>
    <div class="group-1">
      <div class="skills">
        <h3 class="title">Expertise</h3>
        <ul class="skills_list description">
          <%ArrayList<String> q1 = new ArrayList<String>();%>
          <%q1 = (ArrayList<String>)session.getAttribute("s1"); int f = (Integer)session.getAttribute("a");%>
          <%for(int i=0; i<f; i++)
             {
        	   out.println("<html><body><li>"+q1.get(i)+"</li></body></html>");
             }
          %>
        </ul>
      </div>
      <div class="ref">
        <h3 class="title">Reference</h3>
        <div class="ref_item">
          <h4 class="ref_name">Rashid Chy</h4>
          <p class="description">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Id, neque?</p>
        </div>
        <div class="ref_item">
          <h4 class="ref_name">Ayman Rahman</h4>
          <p class="description"> Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor
            incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, </p>
        </div>
      </div>

      <div class="edu">
        <h3 class="title">Education</h3>
        
         <%ArrayList<String> q3 = new ArrayList<String>();%>
          <%q3 = (ArrayList<String>)session.getAttribute("s3"); int f3 = (Integer)session.getAttribute("c"); int x=0;%>
          <%for(int i=0; i<f3; i++)
             {
        	   out.println("<html><body><div class='edu_item'> <p class='item_preTitle'>"+q3.get(x)+"</p></div></body></html>");
        	   x++;
        	   out.println("<html><body><div class='edu_item'> <h4 class='item_title'>"+q3.get(x)+"</h4></div></body></html>");
        	   x++;
        	   out.println("<html><body><div class='edu_item'> <p class='item_subtitle'>"+q3.get(x)+"</p></div></body></html>");
        	   x++;	
        	   out.println("<html><body><br></body></html>");
             }
          %>
        
      </div>

      <div class="certification">
        <h3 class="title">certification</h3>
        <div class="certification_item">
           <%ArrayList<String> q4 = new ArrayList<String>();%>
          <%q4 = (ArrayList<String>)session.getAttribute("s5"); int f4 = (Integer)session.getAttribute("e"); int x1=0;%>
          <%for(int i=0; i<f4; i++)
             {
        	   out.println("<html><body><div class='edu_item'> <p class='item_preTitle'>"+q4.get(x1)+"</p></div></body></html>");
        	   x1++;
        	   out.println("<html><body><div class='edu_item'> <h4 class='item_title'>"+q4.get(x1)+"</h4></div></body></html>");
        	   x1++;
        	   out.println("<html><body><br></body></html>");
             }
          %>
        </div>
      </div>
      </div>
    <div class="group-2">
      <div class="exp">
        <h3 class="title">Experience</h3>
       
         <%ArrayList<String> q5 = new ArrayList<String>();%>
          <%q5 = (ArrayList<String>)session.getAttribute("s4"); int f5 = (Integer)session.getAttribute("d"); int x2=0;%>
          <%for(int i=0; i<f5; i++)
             {
        	   out.println("<html><body><div class='exp_item'> <p class='item_preTitle'>"+q5.get(x2)+"</p></div></body></html>");
        	   x2++;
        	   out.println("<html><body><div class='exp_item'> <h4 class='item_title'>"+q5.get(x2)+"</h4></div></body></html>");
        	   x2++;
        	   out.println("<html><body><div class='exp_item'> <p class='item_subtitle'>"+q5.get(x2)+"</p></div></body></html>");
        	   x2++;
        	   out.println("<html><body><br></body></html>");
             }
          %>
      </div>
      <div class="awards">
        <h3 class="title">Awards</h3>
        <div class="awards_item">
          
          <%ArrayList<String> q6 = new ArrayList<String>();%>
          <%q6 = (ArrayList<String>)session.getAttribute("s6"); int f6 = (Integer)session.getAttribute("h"); int x3=0;%>
          <%for(int i=0; i<f6; i++)
             {
        	   out.println("<html><body><div class='awards_item'><p class='item_preTitle'>"+q6.get(x3)+"</p></div></body></html>");
        	   x3++;
        	   out.println("<html><body><div class='awards_item'><h4 class='item_title'>"+q6.get(x3)+"</h4></div></body></html>");
        	   x3++;
        	   out.println("<html><body><div class='awards_item'><p class='description'>"+q6.get(x3)+"</p></div></body></html>");
        	   x3++;
        	   out.println("<html><body><br></body></html>");
             }
          %>
        </div>
        
      </div>

      <div class="interest">
        <h3 class="title">Interest</h3>
        <div class="interest_items">
            <%ArrayList<String> q2 = new ArrayList<String>();%>
          <%q2 = (ArrayList<String>)session.getAttribute("s2"); int f1 = (Integer)session.getAttribute("f");%>
          <%for(int i=0; i<f1; i++)
             {
        	   out.println("<html><body><div class='interest_item'><span>"+q2.get(i)+"</span></div></body></html>");
             }
          %>
        </div>
        </div>
    <hr>
    <div class="group-3">
      <div class="contact">
        <h3 class="title">Contact</h3>
        <div class="contact_info">
          <p class="description">
            <%=session.getAttribute("state")%>,<%=session.getAttribute("city")%>
          </p>
          <p class="description">
            <%=session.getAttribute("num") %>
          </p>
          <p class="description">
            <%=session.getAttribute("mail") %>
          </p>
        </div>
      </div>
      <div class="social">
        <h3 class="title">Socials</h3>
        <div class="social_items">
          <a href="#" target="_b" class="social_item">
            <i data-feather="github"></i>
            <span><%=session.getAttribute("ur1")%></span>
          </a>
          <a href="#" target="_blank" class="social_item">
            <i data-feather="twitter"></i>
            <span><%=session.getAttribute("ur2") %></span>
          </a>
        </div>
      </div>
  <script>
    feather.replace()
  </script>
</body>
</html>