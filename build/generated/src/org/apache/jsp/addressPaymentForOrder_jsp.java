package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import project.ConnectionProvider;
import java.sql.*;

public final class addressPaymentForOrder_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write(" <div class=\"footer\">\n");
      out.write("          <p>All Right Reserved @Aqir-Lone </p>\n");
      out.write("      </div>");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <link href=\"css/addressPaymentForOrder-style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src='https://kit.fontawesome.com/a076d05399.js'></script>\n");
      out.write("        <title>Home</title>\n");
      out.write("        <script>\n");
      out.write("            if (window.history.forward(1) != null)\n");
      out.write("                window.history.forward(1);\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <br>\n");
      out.write("        <table>\n");
      out.write("            <thead>\n");
      out.write("                ");
String email = session.getAttribute("email").toString();
                    int total = 0;
                    int sno = 0;
                    try {
                        Connection con = ConnectionProvider.getCon();
                        Statement st = con.createStatement();
                        ResultSet rs1 = st.executeQuery("select sum(total) from cart where email='" + email + "' and address is NULL");
                        while (rs1.next()) {
                            total = rs1.getInt(1);

                
      out.write("\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <th scope=\"col\"><a href=\"myCart.jsp\"><i class='fas fa-arrow-circle-left'> Back</i></a></th>\n");
      out.write("                    <th scope=\"col\" style=\"background-color: yellow;\">Total: <i class=\"fa fa-inr\"></i> ");
out.println(total);
      out.write("</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th scope=\"col\">S.No</th>\n");
      out.write("                    <th scope=\"col\">Product Name</th>\n");
      out.write("                    <th scope=\"col\">Category</th>\n");
      out.write("                    <th scope=\"col\"><i class=\"fa fa-inr\"></i> price </th>\n");
      out.write("                    <th scope=\"col\">Quantity</th>\n");
      out.write("                    <th scope=\"col\">Sub Total</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("\n");
      out.write("\n");
      out.write("                ");

                    Statement st1 = con.createStatement();
                    ResultSet rs = st1.executeQuery("select *from product inner join cart on product.id=cart.product_id and cart.email='" + email + "' and cart.address is NULL");
                     while (rs.next()) { 
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    ");
sno = sno + 1;
      out.write("\n");
      out.write("                    <td>");
out.println(sno);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                    <td><i class=\"fa fa-inr\"></i> ");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString(8));
      out.write(" </td>\n");
      out.write("                    <td><i class=\"fa fa-inr\"></i> ");
      out.print(rs.getString(10));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                ");
}
                    Statement st2 = con.createStatement();
                    ResultSet rs2 = st2.executeQuery("select *from users where email='" + email + "'");
                    while (rs2.next()) {

                
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("        <hr style=\"width: 100%\">\n");
      out.write("        <form action=\"addressPaymentForOrderAction.jsp\"method=\"post\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"left-div\">\n");
      out.write("                <h3>Enter Address</h3>\n");
      out.write("                <input class=\"input-style\" type=\"text\" name=\"address\" value=\"");
rs2.getString(7);
      out.write("\" placeholder=\"Enter Address\" required>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"right-div\">\n");
      out.write("                <h3>Enter city</h3>\n");
      out.write("                <input class=\"input-style\" type=\"text\" name=\"city\" value=\"");
rs2.getString(8);
      out.write("\" placeholder=\"Enter City\" required>\n");
      out.write("            </div> \n");
      out.write("\n");
      out.write("            <div class=\"left-div\">\n");
      out.write("                <h3>Enter State</h3>\n");
      out.write("                <input class=\"input-style\" type=\"text\" name=\"state\" value=\"");
rs2.getString(9);
      out.write("\" placeholder=\"Enter State\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"right-div\">\n");
      out.write("                <h3>Enter country</h3>\n");
      out.write("                <input class=\"input-style\" type=\"text\" name=\"country\" value=\"");
rs2.getString(10);
      out.write("\" placeholder=\"Enter Country\" required>\n");
      out.write("            </div>\n");
      out.write("            <h3 style=\"color: red\">*If there is no address its mean that you did not set your address!</h3>\n");
      out.write("            <h3 style=\"color: red\">*This address will also updated to your profile</h3>\n");
      out.write("            <hr style=\"width: 100%\">\n");
      out.write("            <div class=\"left-div\">\n");
      out.write("                <h3>Select way of Payment</h3>\n");
      out.write("                <select class=\"input-style\" name=\"paymentMethod\">\n");
      out.write("                    <option value=\"Cash on delivery(COD)\">Cash on delivery(COD)</option>\n");
      out.write("                    <option value=\"Online Payment\">Online Payment</option>\n");
      out.write("                </select>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"right-div\">\n");
      out.write("                <h3>Pay online on this aqirlone@pay.com</h3>\n");
      out.write("                <h3>Google Pay on : 990656****</h3>\n");
      out.write("                <input class=\"input-style\" type=\"text\" name=\"transactionId\" placeholder=\"Enter Transaction ID\">\n");
      out.write("                <h3 style=\"color: red\">*If you select online Payment then enter you transaction ID here otherwise leave this blank</h3>\n");
      out.write("            </div>\n");
      out.write("            <hr style=\"width: 100%\">\n");
      out.write("\n");
      out.write("            <div class=\"left-div\">\n");
      out.write("                <input class=\"input-style\" type=\"number\" name=\"mobileNumber\" value=\"");
rs2.getString(3);
      out.write("\" placeholder=\"Enter Mobile Number\" required>\n");
      out.write("                <h3>Mobile Number</h3>\n");
      out.write("\n");
      out.write("                <h3 style=\"color: red\">*This mobile number will be also updated to your profile</h3>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"right-div\">\n");
      out.write("                <h3 style=\"color: red\">*If you enter wrong transaction id then your order will be can canceled!</h3>\n");
      out.write("                <button class=\"button \" type=\"submit\"> Proceed to generate Bill <i class='far fa-arrow-alt-circle-right'></i></button>\n");
      out.write("                <h3 style=\"color: red\">*Fill form correctly</h3>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        ");
}
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        
      out.write("\n");
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
