/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.34
 * Generated at: 2019-06-23 16:54:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/login.jsp", Long.valueOf(1561308682280L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
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
      out.write("<title>首頁</title>\r\n");
      out.write("<link rel=stylesheet type=\"text/css\" href=\"skin/windows.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"bg\">\r\n");
      out.write("\r\n");
      out.write("<table width=100% align=\"center\" height=1080 class=\"bg\">\r\n");
      out.write("<tr height=20%>\r\n");
      out.write("<td align=\"center\" valign=\"top\" colspan=\"3\" class=\"ba\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "title/open.jsp", out, false);
      out.write("\r\n");
      out.write(" \r\n");
      out.write("<tr height=\"70%\">\r\n");
      out.write("<td width=20% align=\"center\" valign=\"top\">\r\n");
      out.write("側邊欄位\r\n");
      out.write("<br>\r\n");
      out.write("<input type=\"button\" value=\"新增\" onclick=\"location.href='login_error.jsp'\"><br>\r\n");
      out.write("<input type=\"button\" value=\"查詢\" onclick=\"location.href=''\"><br>\r\n");
      out.write("<input type=\"button\" value=\"刪除\" onclick=\"location.href=''\"><br>\r\n");
      out.write("<td width=55% align=\"center\" valign=\"top\">內容  廣告等等\r\n");
      out.write("\r\n");
      out.write("<td width=25% align=\"center\" valign=\"top\">");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>會員登入</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=stylesheet type=\"text/css\" href=\"skin/font.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/login_caeck.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/show_password.js\"></script>\r\n");
      out.write("<!--密碼眼睛的圖示-->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css\">  \r\n");
      out.write("<!--密碼眼睛的圖示-->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<form name=login method=\"post\" action=\"loginAction\" onsubmit=\"return checkAll()\">\r\n");
      out.write("\r\n");
      out.write("<table >\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td align=\"center\">\r\n");
      out.write("<div class=\"B-m\">會員登入</div>\r\n");
      out.write("<hr>\r\n");
      out.write("<tr><td>\r\n");
      out.write("<!-- 到時候判斷 是信箱 或是帳號 -->\r\n");
      out.write("<input \ttype=\"text\"\r\n");
      out.write("\t\tname=\"user_id\" \r\n");
      out.write("\t\trequired=\"required\"\r\n");
      out.write("\t\tplaceholder=\"輸入帳號 或 Email\"\r\n");
      out.write("\t\tstyle=\"padding:5px;\"\r\n");
      out.write("\t\tsize=25\r\n");
      out.write("\t\tclass=\"form-control\"\r\n");
      out.write("\t\tid=\"user_id\"\r\n");
      out.write("\t\tonblur=\"check_userID()\">\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td align=\"left\">\r\n");
      out.write("<span style=\"font-size:13px\" id=\"userID_show\"></span><br>\r\n");
      out.write("<tr>\r\n");
      out.write("<td align=\"center\">\r\n");
      out.write("<div class=\"input-group w-25\">\r\n");
      out.write("<input \ttype=\"password\"\r\n");
      out.write("\t\tname=\"user_password\"\r\n");
      out.write("\t\trequired=\"required\"\r\n");
      out.write("\t\tplaceholder=\"輸入密碼\"\r\n");
      out.write("\t\tstyle=\"padding:5px;\"\r\n");
      out.write("\t\tsize=25\r\n");
      out.write("\t\tclass=\"form-control\"\r\n");
      out.write("\t\tid=\"user_password\"\r\n");
      out.write("\t\tonblur=\"check_password()\">\r\n");
      out.write("<div class=\"input-group-btn\"> <!--控制 按鈕合併在 密碼欄位後面-->\r\n");
      out.write("\t<button class=\"btn btn-default\" type=\"button\" onclick=\"hideShowPsw()\">\r\n");
      out.write("\t\t<div class=\"glyphicon glyphicon-eye-open\" id=\"eye\"></div>\r\n");
      out.write("\t</button>\r\n");
      out.write("</div></div>\r\n");
      out.write("<tr>\r\n");
      out.write("<td align=\"left\">\r\n");
      out.write("<span style=\"font-size:13px\" id=\"password_show\"></span>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td align=\"center\">\r\n");
      out.write("<br>\r\n");
      out.write("<input type=\"submit\" name=\"Submit\" value=\"登入\" style=\"width:100px;height:40px;background-color:#008B8B;color:white\"><br>\r\n");
      out.write("<a href=\"join_1.jsp\">建立帳號</a>│\r\n");
      out.write("<a href=\"\">忘記密碼</a>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--判斷密碼  似乎無法使用掛入的方式...-->\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\tfunction check_password(){  \r\n");
      out.write("\t\t//讀取接收的值\r\n");
      out.write("\t    var password = document.getElementById(\"user_password\").value;  \r\n");
      out.write("\t\tvar pwcheck = document.getElementById(\"password_show\");  \r\n");
      out.write("\t    \r\n");
      out.write("\t\t//限制密碼的範圍\r\n");
      out.write("\t    var reg = /^([a-zA-Z0-9]){8,16}$/i;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//判斷式\r\n");
      out.write("\t    if(reg.test(password)){  \r\n");
      out.write("\t        pwcheck.innerHTML = \"格式正確\".fontcolor(\"green\");  \r\n");
      out.write("\t        document.getElementById(\"passwordclass\").className = \"icon ticker\";   \r\n");
      out.write("\t        return true;  \r\n");
      out.write("\t    }else{  \r\n");
      out.write("\t        pwcheck.innerHTML = \"密碼長度限於8-16位，<br>僅能輸入英文字母及數字\".fontcolor(\"red\");  \r\n");
      out.write("\t        document.getElementById(\"passwordclass\").className = \"icon into\";    \r\n");
      out.write("\t        return false;  \r\n");
      out.write("\t    }     \r\n");
      out.write("\t} \r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<td align=\"center\" colspan=\"3\"  class=\"ba2\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "title/end.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
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
