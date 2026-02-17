<%-- 
    Document   : subtraction_outcome
    Created on : 17 Feb 2026, 11:29:06 AM
    Author     : CASH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Subtraction Outcome Page </title>
    </head>
    <body>
        <h1>Subtraction outcome</h1>
        <%
        int num1 = (Integer)request.getAttribute("num1");
        int num2 = (Integer)request.getAttribute("num2");
        int difference = (Integer)request.getAttribute("difference");
        
        %>
        <p>
            The difference of <b><%=num1%></b> and <b><%=num2%></b> is <b><%=difference%></b>.
            Click <a href="index.html">here</a> to go back to the main page.
        </p>
    </body>
</html>
