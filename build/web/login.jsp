<!DOCTYPE html>
<html>
    <head>

    
        <link href="css/singup-style.css" rel="stylesheet" type="text/css"/>
        <title>Login</title>
    </head>
    <body>
       
        <div id='container'>
           
            <div class='signup'>
                <form action="loginAction.jsp" method="post">
                    <input type="email" name="email" placeholder="Enter Email" required>
                    <input type="password" name="password" placeholder="Enter Password" required>
                    <input type="submit" value="login">
  

                </form>
                <h2><a href="signup.jsp">SignUp</a></h2>
                <h2><a href="forgotPassword.jsp">Forgot Password?</a></h2>
            </div>
            <div class='whysignLogin'>
                <%
                    String msg = request.getParameter("msg");
                    if ("notexist".equals(msg)) {%>
                    <h5>Incorrect Username or Password</h5>
                <%}%>
                <%
                    if ("notexist".equals(msg)) 
              {%>
                <h5>Some thing Went Wrong! Try Again !</h5>
                
        
    
                
                
                <% }%>


                <h1 class="h2">Online Shopping </h1>
                <h1 class="h2">Shop At Your Steps..!</h1>
            </div>
        </div>

    </body>
</html>
