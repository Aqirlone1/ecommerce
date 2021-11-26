package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("    \n");
      out.write("        <link href=\"css/singup-style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Login</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        <div id='container'>\n");
      out.write("           \n");
      out.write("            <div class='signup'>\n");
      out.write("                <form action=\"loginAction.jsp\" method=\"post\">\n");
      out.write("                    <input type=\"email\" name=\"email\" placeholder=\"Enter Email\" required>\n");
      out.write("                    <input type=\"password\" name=\"password\" placeholder=\"Enter Password\" required>\n");
      out.write("                    <input type=\"submit\" value=\"login\">\n");
      out.write("  \n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("                <h2><a href=\"signup.jsp\">SignUp</a></h2>\n");
      out.write("                <h2><a href=\"forgotPassword.jsp\">Forgot Password?</a></h2>\n");
      out.write("            </div>\n");
      out.write("            <div class='whysignLogin'>\n");
      out.write("                ");

                    String msg = request.getParameter("msg");
                    if ("notexist".equals(msg)) {
      out.write("\n");
      out.write("                    <h5>Incorrect Username or Password</h5>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("                ");

                    if ("notexist".equals(msg)) 
              {
      out.write("\n");
      out.write("                <h5>Some thing Went Wrong! Try Again !</h5>\n");
      out.write("                \n");
      out.write("        \n");
      out.write("    \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                ");
 }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <h1 class=\"h2\">Online Shopping </h1>\n");
      out.write("                <h1 class=\"h2\">Shop At Your Steps..!</h1>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
