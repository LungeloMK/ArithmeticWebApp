<%-- 
    Document   : division_outcome
    Created on : 17 Feb 2026, 10:30:47 PM
    Author     : CASH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Division Outcome Page</title>
    </head>
    <body>
        <h1>Division outcome </h1>
        <%
        double num1 =(Double)request.getAttribute("num1");
        double num2 = (Double)request.getAttribute("num2");
        double quotient = (Double)request.getAttribute("quotient");      
        %>
        
        <p>
           The quotient of <b><%=num1%></b> and <b><%=num2%></b> is <b><%=quotient%></b>.
            Click <a href="index.html">here</a> to go back to the main page.
        </p>
    </body>
</html>
