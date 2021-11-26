package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import project.ConnectionProvider;
import java.sql.*;

public final class bill_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/footer.jsp");
  }

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

      out.write(" <div class=\"footer\">\n");
      out.write("          <p>All Right Reserved @Aqir-Lone </p>\n");
      out.write("      </div>");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bill.css\">\n");
      out.write("        <title>Bill</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <h3>Online shopping Bill (Aqir-Lone)</h3>\n");
      out.write("        <hr>\n");
      out.write("        <div class=\"left-div\"><h3>Name:  </h3></div>\n");
      out.write("        <div class=\"right-div-right\"><h3>Email:  </h3></div>\n");
      out.write("        <div class=\"right-div\"><h3>Mobile Number:  </h3></div>  \n");
      out.write("\n");
      out.write("        <div class=\"left-div\"><h3>Order Date:  </h3></div>\n");
      out.write("        <div class=\"right-div-right\"><h3>Payment Method:  </h3></div>\n");
      out.write("        <div class=\"right-div\"><h3>Expected Delivery:  </h3></div> \n");
      out.write("\n");
      out.write("        <div class=\"left-div\"><h3>Transaction Id:  </h3></div>\n");
      out.write("        <div class=\"right-div-right\"><h3>City:  </h3></div> \n");
      out.write("        <div class=\"right-div\"><h3>Address:  </h3></div> \n");
      out.write("\n");
      out.write("        <div class=\"left-div\"><h3>State:  </h3></div>\n");
      out.write("        <div class=\"right-div-right\"><h3>Country:  </h3></div>  \n");
      out.write("\n");
      out.write("        <hr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("        <table id=\"customers\">\n");
      out.write("            <h3>Product Details</h3>\n");
      out.write("            <tr>\n");
      out.write("                <th>S.No</th>\n");
      out.write("                <th>Product Name</th>\n");
      out.write("                <th>category</th>\n");
      out.write("                <th>Price</th>\n");
      out.write("                <th>Quantity</th>\n");
      out.write("                <th>Sub Total</th>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td></td>\n");
      out.write("                <td></td>\n");
      out.write("                <td></td>\n");
      out.write("                <td></td>\n");
      out.write("                <td></td>\n");
      out.write("                <td></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("\n");
      out.write("        </table>\n");
      out.write("        <h3>Total: </h3>\n");
      out.write("        <a href=\"continueShopping.jsp\"><button class=\"button left-button\">Continue Shopping</button></a>\n");
      out.write("        <a onclick=\"window.print();\"><button class=\"button right-button\">Print</button></a>\n");
      out.write("        <br><br><br><br>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
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
