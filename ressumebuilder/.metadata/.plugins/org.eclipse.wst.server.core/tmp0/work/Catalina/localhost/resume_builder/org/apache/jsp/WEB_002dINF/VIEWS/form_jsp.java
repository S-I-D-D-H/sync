/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.71
 * Generated at: 2023-09-03 08:32:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.VIEWS;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class form_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("body\r\n");
      out.write("{\r\n");
      out.write("  margin:0px;\r\n");
      out.write("  padding:0px;\r\n");
      out.write("  background-color: #219ebc;\r\n");
      out.write("}\r\n");
      out.write("#container\r\n");
      out.write("{\r\n");
      out.write("  color: black;\r\n");
      out.write("  display: flex;\r\n");
      out.write("  justify-content:center;\r\n");
      out.write("}\r\n");
      out.write("#header\r\n");
      out.write("{\r\n");
      out.write("  background-color: #8ecae6;\r\n");
      out.write("}\r\n");
      out.write(".form-group\r\n");
      out.write("{\r\n");
      out.write("   \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("        <script language=\"javascript\" type=\"text/javascript\" >\r\n");
      out.write("       var mytext=0;\r\n");
      out.write("       var myhob=10;\r\n");
      out.write("       var myexp=0;\r\n");
      out.write("       var myexp1=0;\r\n");
      out.write("       var myexp2=0;\r\n");
      out.write("       var myedu=0;\r\n");
      out.write("       var mycer=0;\r\n");
      out.write("       var mtcer=0;\r\n");
      out.write("        function changeIt()\r\n");
      out.write("        {\r\n");
      out.write("        	\r\n");
      out.write("        createTextbox.innerHTML = createTextbox.innerHTML +`<input type='text' name='${mytext}'>`\r\n");
      out.write("        mytext++;\r\n");
      out.write("        		\r\n");
      out.write("        }\r\n");
      out.write("        function changeit()\r\n");
      out.write("        {\r\n");
      out.write("        createhob.innerHTML = createhob.innerHTML +`<input type='text' name='${myhob}'>`\r\n");
      out.write("        myhob++;\r\n");
      out.write("        }\r\n");
      out.write("        function changeitt()\r\n");
      out.write("        {\r\n");
      out.write("            createedu.innerHTML = createedu.innerHTML +`<input type='text' name='a${myexp}' placeholder='Year'>`\r\n");
      out.write("            createedu.innerHTML = createedu.innerHTML +`<input type='text' name='b${myexp1}' placeholder='Name of Institute'>`\r\n");
      out.write("            createedu.innerHTML = createedu.innerHTML +`<input type='text' name='c${myexp2}' placeholder='Degree'> <br>`\r\n");
      out.write("            myexp++;\r\n");
      out.write("            myexp1++;\r\n");
      out.write("            myexp2++;\r\n");
      out.write("        }\r\n");
      out.write("        function changeittt()\r\n");
      out.write("        {\r\n");
      out.write("            createexp.innerHTML = createexp.innerHTML +`<input type='text' name='d${myedu}' placeholder='Year'>`\r\n");
      out.write("            createexp.innerHTML = createexp.innerHTML +`<input type='text' name='e${myedu}' placeholder='Name of Institute'><br>`\r\n");
      out.write("            createexp.innerHTML = createexp.innerHTML +`<textarea type='text' name='f${myedu}' placeholder='description' row='1' cols='100'></textarea> <br>`\r\n");
      out.write("            myedu++;\r\n");
      out.write("        }\r\n");
      out.write("        function changeitttt()\r\n");
      out.write("        {\r\n");
      out.write("            createcer.innerHTML = createcer.innerHTML +`<input type='text' name='g${mycer}' placeholder='Year'>`\r\n");
      out.write("            createcer.innerHTML = createcer.innerHTML +`<input type='text' name='p${mycer}' placeholder='Name of Institute'>`\r\n");
      out.write("            mycer++;\r\n");
      out.write("        }\r\n");
      out.write("        function changeok()\r\n");
      out.write("        {\r\n");
      out.write("            cer.innerHTML = cer.innerHTML +`<input type='text' name='l${mtcer}' placeholder='Year'>`\r\n");
      out.write("            cer.innerHTML = cer.innerHTML +`<input type='text' name='m${mtcer}' placeholder='Name of Institute'>`\r\n");
      out.write("            cer.innerHTML = cer.innerHTML +`<input type='text' name='n${mtcer}' placeholder='description'>`\r\n");
      out.write("            mtcer++;\r\n");
      out.write("        }\r\n");
      out.write("        </script>\r\n");
      out.write("        \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("   <form action=\"go\" method=\"post\" id=\"container\">\r\n");
      out.write("   \r\n");
      out.write("       <div id=\"header\">\r\n");
      out.write("\r\n");
      out.write("       <div if=\"box0\" class=\"form-group\">\r\n");
      out.write("          <h1>ENTER THE INFORMATION</h1>\r\n");
      out.write("       </div>\r\n");
      out.write("\r\n");
      out.write("        <div id=\"box1\" class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("        <h2>PERSONAL DETAILS</h2>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <label for=\"name\">ENTER YOUR NAME</label>\r\n");
      out.write("            <input type=\"text\" name=\"name\", id=\"name\", placeholder=\"name\" required autofocus>\r\n");
      out.write("            </div>\r\n");
      out.write("           \r\n");
      out.write("          <div>\r\n");
      out.write("            <label for=\"surname\">ENTER YOUR SURNAME</label>\r\n");
      out.write("            <input type=\"text\" name=\"surname\", id=\"surname\", placeholder=\"surname\" required autofocus>\r\n");
      out.write("          </div>\r\n");
      out.write("           \r\n");
      out.write("            <div>\r\n");
      out.write("                <label for=\"designation\">DESIGNATION</label>\r\n");
      out.write("            <input type=\"text\" name=\"designation\", id=\"designation\", placeholder=\"profile\" required autofocus>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("       </div>\r\n");
      out.write("       \r\n");
      out.write("       <div id=\"box2\" class=\"form-group\">\r\n");
      out.write("       <h2>DESCRIPTION</h2>\r\n");
      out.write("      \r\n");
      out.write("       <label for=\"description\"></label>\r\n");
      out.write("       <!-- <input type=\"text\" name=\"designation\", id=\"designation\", placeholder=\"profile\" required autofocus> -->\r\n");
      out.write("       <textarea maxlength=\"90\" minlength=\"20\" required placeholder=\"Describe yourself in 90 words\" id=\"description\" name=\"description\" rows=\"6\" cols=\"150\" ></textarea>\r\n");
      out.write("       </div>\r\n");
      out.write("  \r\n");
      out.write("       <div id=\"box3\" class=\"form-group\">\r\n");
      out.write("       <h2>ENTER YOUR SKILLS</h2>\r\n");
      out.write("       <!-- <input type=\"text\"> -->\r\n");
      out.write("        \r\n");
      out.write("        <input type=\"text\" name=\"in1\">\r\n");
      out.write("        \r\n");
      out.write("        <input type=\"button\" value=\"clickHere\" onClick=\"changeIt()\">\r\n");
      out.write("        <div id=\"createTextbox\"></div>\r\n");
      out.write("\r\n");
      out.write("       </div> \r\n");
      out.write("\r\n");
      out.write("        <div id=\"box4\" class=\"form-group\">\r\n");
      out.write("        <h2>Hobbies</h2>\r\n");
      out.write("        <input type=\"text\" name=\"in2\">\r\n");
      out.write("        <input type=\"button\" value=\"clickHere\" onClick=\"changeit()\">\r\n");
      out.write("        <div id=\"createhob\"></div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("       <div id=\"box5\" class=\"form-group\">\r\n");
      out.write("        <h2>EDUCATION</h2>\r\n");
      out.write("        <input type=\"text\" name=\"in3\">\r\n");
      out.write("        <input type=\"button\" value=\"clickHere\" onClick=\"changeitt()\">\r\n");
      out.write("        <div id=\"createedu\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("       <div id=\"box6\" class=\"form-group\">\r\n");
      out.write("       <h2>CONTACTS</h2>\r\n");
      out.write("       \r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div>\r\n");
      out.write("            <label for=\"phone\">PHONE NUMBER</label>\r\n");
      out.write("        <input type=\"number\" name=\"phone\", id=\"phone\", placeholder=\"phone_number\" required autofocus>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div>\r\n");
      out.write("            <label for=\"mail\">E-MAIL</label>\r\n");
      out.write("        <input type=\"email\" name=\"mail\", id=\"mail\", placeholder=\"email\" required autofocus>\r\n");
      out.write("        </div>\r\n");
      out.write(" \r\n");
      out.write("        <div>\r\n");
      out.write("            <label for=\"City\">CITY</label>\r\n");
      out.write("        <input type=\"text\" name=\"City\", id=\"City\", placeholder=\"City\" required autofocus>\r\n");
      out.write(" \r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div>\r\n");
      out.write("            <label for=\"state\">STATE</label>\r\n");
      out.write("        <input type=\"text\" name=\"state\", id=\"state\", placeholder=\"state\" required autofocus>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("       </div>\r\n");
      out.write("\r\n");
      out.write("       <div id=\"box7\" class=\"form-group\">\r\n");
      out.write("        <h2>SOCIALS</h2>\r\n");
      out.write("        <div class=\"contain\">\r\n");
      out.write("          <div>\r\n");
      out.write("            <label for=\"Insta\">GITHUB</label>\r\n");
      out.write("            <input type=\"url\" name=\"Insta\", id=\"Insta\", placeholder=\"Insta\" required autofocus> \r\n");
      out.write("            </div>\r\n");
      out.write("            <div> \r\n");
      out.write("            <label for=\"Insta1\">LINKEDIN</label>\r\n");
      out.write("            <input type=\"url\" name=\"Insta1\", id=\"Instal\", placeholder=\"Instal\" required autofocus>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div> \r\n");
      out.write("       </div>\r\n");
      out.write("\r\n");
      out.write("       <div id=\"box8\" class=\"form-group\">\r\n");
      out.write("        <h2>EXPERIENCE</h2>\r\n");
      out.write("         <input type=\"text\" name=\"in4\">\r\n");
      out.write("        <input type=\"button\" value=\"clickHere\" onClick=\"changeittt()\">\r\n");
      out.write("        <div id=\"createexp\"></div>\r\n");
      out.write("       </div>\r\n");
      out.write("\r\n");
      out.write("      <div id=\"box9\" class=\"form-group\">\r\n");
      out.write("     \r\n");
      out.write("        <h2>CERTIFICATION</h2>\r\n");
      out.write("          <input type=\"text\" name=\"in5\">\r\n");
      out.write("        <input type=\"button\" value=\"clickHere\" onClick=\"changeitttt()\">\r\n");
      out.write("        <div id=\"createcer\"></div>\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("      <div id=\"box10\" class=\"form-group\">\r\n");
      out.write("     \r\n");
      out.write("        <h2>ACHIEVEMENTS</h2>\r\n");
      out.write("          <input type=\"text\" name=\"in6\">\r\n");
      out.write("        <input type=\"button\" value=\"clickHere\" onClick=\"changeok()\">\r\n");
      out.write("        <div id=\"cer\"></div>\r\n");
      out.write("      </div>\r\n");
      out.write("       <br>\r\n");
      out.write("       <br>\r\n");
      out.write("      <div id=\"footer\" class=\"form-group\">\r\n");
      out.write("        <button type=\"submit\">submit</button>\r\n");
      out.write("       </div>\r\n");
      out.write("</div>\r\n");
      out.write("       \r\n");
      out.write("      </form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
