<%-- 
    Document   : Edit
    Created on : May 9, 2017, 11:02:31 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form name="form1" action="EditOneS">
            New Full Name: <input type="text" name="fn"><br>
            New Username : <input type="text" name="un"><br>
            New Enrolment: <input type="text" name="enr"><br>
            New Password : <input type="pasword" name="pw"><br>
            <input type="hidden" name="en" value=<%=request.getParameter("en")%>>
            <br>
            <button type="submit">Edit </button>
        </form>
    </body>
</html>
