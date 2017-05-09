<%-- 
    Document   : Loginned
    Created on : May 7, 2017, 11:47:58 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String s = request.getParameter("urs");
    String pw = request.getParameter("en");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h1>Welcome to Indoor Maps <% out.print(pw); %></h1>
        <form name="form1" action="JIITS">
            Name of Faculty:<input type="text" name="fname"><br>
            Day of the class:<input type="text" name="day"><br>
            <button type="submit">Find</button>
            
        </form>
      
            <form name="form3" action="ClosedS">
            <input type="hidden" name="en" value=<%=pw%>>
            <button type="submit">
                Close Account
            </button>
        </form>
        
    </center>
    </body>
</html>
