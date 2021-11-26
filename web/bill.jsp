<%@include file="footer.jsp" %>
<%@page import="project.ConnectionProvider" %>
<%@page import="java.sql.*" %>
<html>
    <head>
      
        <link href="css/bill.css" rel="stylesheet" type="text/css"/>
        <title>Bill</title>
    </head>
    <body>
     <%String email=session.getAttribute("email").toString();
     try {
            int total=0;
            int sno=0;
            Connection con= ConnectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select sum(total) from cart where email='"+email+"' and status='processing'");
            while (rs.next())
            {                    
              total=rs.getInt(1);              
                }
            Statement st1=con.createStatement();
            ResultSet rs1=st1.executeQuery("select *from users inner join cart where cart.email='"+email+"' and cart.status='processing'");
            while (rs1.next())
            {                      
     %>
        <h3>Online shopping Bill (Aqir-Lone)</h3>
        <hr>
        <%
            Statement st2=con.createStatement();
            ResultSet rs2=st2.executeQuery("select *from users where email='"+email+"'");
            while (rs2.next())
            {                 %>
        <div class="left-div"><h3>Name:<%=rs2.getString(1)%>  </h3></div>
        <%}%>
        <div class="right-div-right"><h3>Email: <%out.println(email);%>   </h3></div>
        <div class="right-div"><h3>Mobile Number: <%=rs1.getString(20)%>   </h3></div>  

        <div class="left-div"><h3>Order Date: <%=rs1.getString(21)%>   </h3></div>
        <div class="right-div-right"><h3>Payment Method: <%=rs1.getString(23)%>   </h3></div>
        <div class="right-div"><h3>Expected Delivery: <%=rs1.getString(22)%>   </h3></div> 

        <div class="left-div"><h3>Transaction Id:  <%=rs1.getString(24)%>   </h3></div>
        <div class="right-div-right"><h3>City: <%=rs1.getString(17)%>   </h3></div> 
        <div class="right-div"><h3>Address:  <%=rs1.getString(16)%>  </h3></div> 

        <div class="left-div"><h3>State:  <%=rs1.getString(18)%>  </h3></div>
        <div class="right-div-right"><h3>Country: <%=rs1.getString(19)%>   </h3></div>  

        <hr>
<%break;}%>


        <br>

        <table id="customers">
            <h3>Product Details</h3>
            <tr>
                <th>S.No</th>
                <th>Product Name</th>
                <th>category</th>
                <th>Price</th>
                <th>Quantity</th>
                <th>Sub Total</th>
            </tr>
            <%
                 Statement st2=con.createStatement();
                 ResultSet rs3=st2.executeQuery("select *from cart inner join product where cart.product_id=product.id and cart.email='"+email+"' and cart.status='processing'");
                while(rs3.next())
                {
                    sno=sno+1;
                
                %>
            <tr>
                <td><%out.println(sno);%></td>
                <td><%=rs3.getString(17) %></td>
                <td><%=rs3.getString(18)%></td>
                <td><%=rs3.getString(19)%></td>
                <td><%=rs3.getString(3)%></td>
                <td><%=rs3.getString(5)%></td>
            </tr>
            <tr>
<%}%>
        </table>
        <h3>Total:<% out.println(total);%> </h3>
        <a onclick="window.print();" href="home.jsp?msg=success"><button class="button right-button">Place Order And print Bill</button></a>
        <a href="continueShopping.jsp"><button class="button left-button">Continue Shopping</button></a>
 
        
        <br><br><br><br>
   <%     
            
         } catch (Exception e) 
         {
System.out.println(e);

}
         %>
    </body>
</html>