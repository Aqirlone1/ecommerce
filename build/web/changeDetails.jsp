<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="changeDetailsHeader.jsp" %>
<%@include file="footer.jsp" %>
<%@page import="project.ConnectionProvider" %>
<%@page import="java.sql.*" %>
<html>
    <head>
        <link href="css/changeDetails.css" rel="stylesheet" type="text/css"/>
       
        <title>Change Details</title>
        <style>
            hr
            {width:70%;}</style>
    </head>
    <body>
        <% 
           
try {
        Connection con= ConnectionProvider.getCon();
        Statement st=con.createStatement();
        ResultSet rs= st.executeQuery("select * from users where email='"+email+"'");
        while (rs.next())
        {                
                
          
            %>
            <div>
               
            <h3>Name:<%=rs.getString(1)%> </h3>
            <hr>
        <h3>Email:<%=rs.getString(2)%> </h3>
         <hr>
        <h3>Mobile Number:<%=rs.getString(3)%> </h3>
      <hr>
        <h3>Security Question:<%=rs.getString(4)%> </h3>
         <hr>
                </div>
      
       
        <br>
        <br>
        <br>
      <%  }
    } catch (Exception e) {
        System.out.println(e);
    }
      %>
    </body>
</html>