/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-07-06 19:39:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_002dcoaches_002dprofiles_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/views/../common/navigation.jspf", Long.valueOf(1499369532321L));
    _jspx_dependants.put("/WEB-INF/views/../common/header.jspf", Long.valueOf(1499366188507L));
    _jspx_dependants.put("/WEB-INF/views/../common/footer.jspf", Long.valueOf(1498761914526L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
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
      out.write("<title>Workout Buddy</title>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=yes\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Raleway\">\r\n");
      out.write("\r\n");
      out.write("<link href=\"webjars/bootstrap/3.3.6/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("<style>\r\n");
      out.write("\t.footer {\r\n");
      out.write("\t\tbottom: 0;\r\n");
      out.write("\t\twidth: 100%;\r\n");
      out.write("\t\theight: 60px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.table-responsive{\r\n");
      out.write("\t\toverflow-y: hidden;\r\n");
      out.write("\t\tmargin-bottom: 60px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tbody {\r\n");
      out.write("    background-image: url('/resources/images/back2.jpg');\r\n");
      out.write("    background-repeat: no-repeat;\r\n");
      out.write("    background-position: center;\r\n");
      out.write("    background-attachment: fixed;\r\n");
      out.write("    background-size: cover;\r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body,h1 {font-family: \"Raleway\", sans-serif}\r\n");
      out.write("body, html {height: 100%}\r\n");
      out.write(".bgimg {\r\n");
      out.write("    background-image: url('/resources/images/fitness1.jpg');\r\n");
      out.write("    min-height: 100%;\r\n");
      out.write("    background-position: center;\r\n");
      out.write("    background-attachment: fixed;\r\n");
      out.write("    background-size: cover;\r\n");
      out.write("}\r\n");
      out.write("\t\r\n");
      out.write("\t.one{\r\n");
      out.write("\t\t\tfont-size: 20px;\r\n");
      out.write("\t\t\tcolor: rgb(255,255,255);\r\n");
      out.write("\t\t\tbackground-color: rgba(0,0,0,0.5);\r\n");
      out.write("\t\t\tpadding:5px;\r\n");
      out.write("\t\t\tborder-radius: 65px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("@media only screen and (max-width: 450px) {\r\n");
      out.write("\t.w3-jumbo{\r\n");
      out.write("\t\tfont-size: 10px;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write('\r');
      out.write('\n');
      out.write("<link href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-inverse navbar-fixed-top\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <div class=\"navbar-header\">\r\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>   \r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>                        \r\n");
      out.write("                             \r\n");
      out.write("      </button>\r\n");
      out.write("      <a class=\"navbar-brand\" href=\"/homeServlet\"> Workout Buddy</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\r\n");
      out.write("      <ul class=\"nav navbar-nav\">\r\n");
      out.write("        <li><a href=\"/list-workouts.do\"><span\r\n");
      out.write("\t\t\t\t\tclass=\"glyphicon glyphicon-asterisk\"></span> Explore</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"/list-personal.do\"><span\r\n");
      out.write("\t\t\t\t\tclass=\"glyphicon glyphicon-user\"></span> My zone</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"/list-coaches.do\"><span\r\n");
      out.write("\t\t\t\t\tclass=\"glyphicon glyphicon-fire\"></span> Coach-Corner</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"/list-advice.do\"><span\r\n");
      out.write("\t\t\t\t\tclass=\"glyphicon glyphicon-ice-lolly-tasted\"></span> 75%</a></li>\r\n");
      out.write("        <li>\r\n");
      out.write("\t\t\t\t<div class=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t<button class=\"dropbtn\"><span\r\n");
      out.write("\t\t\t\t\tclass=\"glyphicon glyphicon-search\"></span></button>\r\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-content\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/list-bodyworkouts.do?bodypart=Chest\">Chest</a> <a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"/list-bodyworkouts.do?bodypart=Arms\">Arms</a> <a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"/list-bodyworkouts.do?bodypart=Leg\">Legs</a> <a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"/list-bodyworkouts.do?bodypart=Abs\">Abs</a> <a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"/list-bodyworkouts.do?bodypart=Shoulders\">Shoulders</a> <a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"/list-bodyworkouts.do?bodypart=Back\">Back</a> <a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"/list-bodyworkouts.do?bodypart=Cardio\">Cardio</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("        <li><a href=\"/logout.do\"><span class=\"glyphicon glyphicon-log-in\"></span> Logout</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("@media only screen and (max-width: 500px) {\r\n");
      out.write("\t.col-xxs-12 {\r\n");
      out.write("\t\twidth: 100%;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<div class=\"container\" style=\"margin-bottom: 50px\">\r\n");
      out.write("\t<header class=\"w3-container w3-text-white w3-center\">\r\n");
      out.write("\t\t<h1>Choose A Coach</h1>\r\n");
      out.write("\t</header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t\t<div class=\"col-xxs-12 col-xs-4 col-sm-4 col-md-4 col-lg-4\">\r\n");
      out.write("\t\t\t<div class=\"thumbnail\">\r\n");
      out.write("\t\t\t\t<a href=\"/view-coaches-workouts.do?name=Toyin\" target=\"_self\"> <img\r\n");
      out.write("\t\t\t\t\tsrc=\"");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("\t\t\t\t\talt=\"Toyin's Profile\" class=\"img-responsive\" style=\"width: 100%\" />\r\n");
      out.write("\t\t\t\t\t<div class=\"caption\">\r\n");
      out.write("\t\t\t\t\t\t<p align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"mailto:tydcool@gmail.com\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"fa fa-envelope-square fa-3x social\"></i></a> <a\r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"https://www.instagram.com/coach.to/?hl=en\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"fa fa-instagram fa-3x social\"></i></a>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t<p>\"Toyin!!! Lorem ipsum dolor sit amet, consectetur\r\n");
      out.write("\t\t\t\t\t\t\tadipiscing elit, sed do eiusmod tempor incididunt ut labore et\r\n");
      out.write("\t\t\t\t\t\t\tdolore magna aliqua. Ut enim ad minim veniam, quis nostrud\r\n");
      out.write("\t\t\t\t\t\t\texercitation</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-xxs-12 col-xs-4 col-sm-4 col-md-4 col-lg-4\">\r\n");
      out.write("\t\t\t<div class=\"thumbnail\">\r\n");
      out.write("\t\t\t\t<a href=\"/view-coaches-workouts.do?name=Tobi\" target=\"_self\"> <img\r\n");
      out.write("\t\t\t\t\tsrc=\"");
      if (_jspx_meth_c_005furl_005f3(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("\t\t\t\t\talt=\"Tobi's Profile\" class=\"img-responsive\" style=\"width: 100%\" />\r\n");
      out.write("\t\t\t\t\t<div class=\"caption\">\r\n");
      out.write("\t\t\t\t\t\t<p align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"mailto:tobi@gmail.com\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"fa fa-envelope-square fa-3x social\"></i></a> <a\r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"https://www.instagram.com/tobi_tobe/\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"fa fa-instagram fa-3x social\"></i></a>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t<p>\"Tobi!!! Lorem ipsum dolor sit amet, consectetur adipiscing\r\n");
      out.write("\t\t\t\t\t\t\telit, sed do eiusmod tempor incididunt ut labore et dolore magna\r\n");
      out.write("\t\t\t\t\t\t\taliqua. Ut enim ad minim veniam, quis nostrud exercitation</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-xxs-12 col-xs-4 col-sm-4 col-md-4 col-lg-4\">\r\n");
      out.write("\t\t\t<div class=\"thumbnail\">\r\n");
      out.write("\t\t\t\t<a href=\"/view-coaches-workouts.do?name=Stefano\" target=\"_self\">\r\n");
      out.write("\t\t\t\t\t<img src=\"");
      if (_jspx_meth_c_005furl_005f4(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("\t\t\t\t\talt=\"Stefano's Profile\" class=\"img-responsive\" style=\"width: 100%\" />\r\n");
      out.write("\t\t\t\t\t<div class=\"caption\">\r\n");
      out.write("\t\t\t\t\t\t<p align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"mailto:stefano@gmail.com\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"fa fa-envelope-square fa-3x social\"></i></a> <a\r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"https://www.instagram.com/coach.to/?hl=en\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"fa fa-instagram fa-3x social\"></i></a>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t<p>\"Stefano!!! Lorem ipsum dolor sit amet, consectetur\r\n");
      out.write("\t\t\t\t\t\t\tadipiscing elit, sed do eiusmod tempor incididunt ut labore et\r\n");
      out.write("\t\t\t\t\t\t\tdolore magna aliqua. Ut enim ad minim veniam, quis nostrud\r\n");
      out.write("\t\t\t\t\t\t\texercitation</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\t\r\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_005furl_005f5(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"footerWrap\">\r\n");
      out.write("    <div class=\"footer\">\r\n");
      out.write("      <div class=\"footerContent\">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("\t\t\t\t<a href=\"https://www.instagram.com/coach.to/?hl=en\"><i class=\"fa fa-instagram fa-3x social\"></i></a>\r\n");
      out.write("\t\t\t\t<a href=\"#\"><i class=\"fa fa-facebook-square fa-3x social\"></i></a>\r\n");
      out.write("\t            <a href=\"https://twitter.com/jt7p\"><i class=\"fa fa-twitter-square fa-3x social\"></i></a>\r\n");
      out.write("\t            <a href=\"https://plus.google.com/+Bootsnipp-page\"><i class=\"fa fa-google-plus-square fa-3x social\"></i></a>\r\n");
      out.write("\t\t\t\t<a href=\"mailto:tydcool@gmail.com\"><i class=\"fa fa-envelope-square fa-3x social\"></i></a>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("      </div>     \r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script src=\"webjars/jquery/2.1.4/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"webjars/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/views/../common/navigation.jspf(1,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/resources/css/dropdown.css");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f1.setParent(null);
    // /WEB-INF/views/list-coaches-profiles.jsp(7,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue("/resources/css/mobileaid.css");
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f2.setParent(null);
    // /WEB-INF/views/list-coaches-profiles.jsp(28,10) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f2.setValue("/resources/images/avatar.png");
    int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
    if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f3.setParent(null);
    // /WEB-INF/views/list-coaches-profiles.jsp(49,10) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f3.setValue("/resources/images/avatar.png");
    int _jspx_eval_c_005furl_005f3 = _jspx_th_c_005furl_005f3.doStartTag();
    if (_jspx_th_c_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f4.setParent(null);
    // /WEB-INF/views/list-coaches-profiles.jsp(69,15) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f4.setValue("/resources/images/avatar.png");
    int _jspx_eval_c_005furl_005f4 = _jspx_th_c_005furl_005f4.doStartTag();
    if (_jspx_th_c_005furl_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f5(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f5.setParent(null);
    // /WEB-INF/views/../common/footer.jspf(2,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f5.setValue("/resources/css/footer.css");
    int _jspx_eval_c_005furl_005f5 = _jspx_th_c_005furl_005f5.doStartTag();
    if (_jspx_th_c_005furl_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
    return false;
  }
}
