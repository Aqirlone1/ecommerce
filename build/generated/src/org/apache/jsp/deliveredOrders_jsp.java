package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import project.ConnectionProvider;
import java.sql.*;

public final class deliveredOrders_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/adminHeader.jsp");
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
      			"error.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"css/home-style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src='https://kit.fontawesome.com/a076d05399.js'></script>\n");
      out.write("    </head>\n");
      out.write("    <!--Header-->\n");
      out.write("    <br>\n");
      out.write("    <div class=\"topnav sticky\">\n");
      out.write("        ");

            
         String email = session.getAttribute("email").toString();
      out.write("\n");
      out.write("        <center><h2>Online Shopping (Aqir-Lone)</h2></center>\n");
      out.write("        <a href=\"addNewProduct.jsp\">Add New Product <i class='fas fa-plus-square'></i></a>\n");
      out.write("        <a href=\"allProductEditProduct.jsp\">All Products & Edit Products <i class='fab fa-elementor'></i></a>\n");
      out.write("        <a href=\"messagesReceived.jsp\">Messages Received <i class='fas fa-comment-alt'></i></a>\n");
      out.write("        <a href=\"ordersReceived.jsp\">Orders Received <i class=\"fas fa-archive\"></i></a>\n");
      out.write("        <a href=\"cancelOrders.jsp\">Canceled Orders <i class='fas fa-window-close'></i></a>\n");
      out.write("       <a href=\"deliveredOrders.jsp\">Delivered Orders <i class='fas fa-dolly'></i></a>\n");
      out.write("        <a href=\"logout.jsp\">Logout <i class='fas fa-share-square'></i></a>\n");
      out.write("    </div>\n");
      out.write("    <br> \n");
      out.write("    \n");
      out.write(" <!--table-->\n");
      out.write('\n');
      out.write(" <div class=\"footer\">\n");
      out.write("          <p>All Right Reserved @Aqir-Lone </p>\n");
      out.write("      </div>");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"css/ordersReceived-style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    \n");
      out.write("        <title>Home</title>\n");
      out.write("        <style>\n");
      out.write("            .th-style\n");
      out.write("            { width: 25%;}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
   

        
        
      out.write("\n");
      out.write("        <div style=\"color: white; text-align: center; font-size: 30px;\">Delivered Orders <i class='fas fa-dolly'></i></div>\n");
      out.write("\n");
      out.write("        <h3 class=\"alert\">Order Cancel Successfully!</h3>\n");
      out.write("\n");
      out.write("        <h3 class=\"alert\">Successfully Updated!</h3>\n");
      out.write("\n");
      out.write("        <h3 class=\"alert\">Some thing went wrong! Try Again!</h3>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <table id=\"customers\">\n");
      out.write("            <tr>\n");
      out.write("                <th>Mobile Number</th>\n");
      out.write("                <th scope=\"col\">Product Name</th>\n");
      out.write("                <th scope=\"col\">Quantity</th>\n");
      out.write("                <th scope=\"col\"><i class=\"fa fa-inr\"></i> Sub Total</th>\n");
      out.write("                <th>Address</th>\n");
      out.write("                <th>City</th>\n");
      out.write("                <th>State</th>\n");
      out.write("                <th>Country</th>\n");
      out.write("                <th scope=\"col\">Order Date</th>\n");
      out.write("                <th scope=\"col\">Expected Delivery Date</th>\n");
      out.write("                <th scope=\"col\">Payment Method</th>\n");
      out.write("                <th scope=\"col\">T-ID</th>\n");
      out.write("                <th scope=\"col\">Status</th>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td></td>\n");
      out.write("                <td></td>\n");
      out.write("                <td></td>\n");
      out.write("                <td><i class=\"fa fa-inr\"></i>  </td>\n");
      out.write("                <td></td>\n");
      out.write("                <td></td>\n");
      out.write("                <td></td>\n");
      out.write("                <td></td>\n");
      out.write("                <td></td>\n");
      out.write("                <td></td>\n");
      out.write("                <td></td>\n");
      out.write("                <td></td>\n");
      out.write("                <td></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("        </table>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
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
