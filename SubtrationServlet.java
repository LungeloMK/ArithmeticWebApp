/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.ArithmeticManager;

/**
 *
 * @author CASH
 */
public class SubtrationServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        
        ArithmeticManager sb = new ArithmeticManager();
        int difference = sb.subtraction(num1, num2);
        
        request.setAttribute("num1", num1);
        request.setAttribute("num2", num2);
        request.setAttribute("difference", difference);
        
        RequestDispatcher disp = request.getRequestDispatcher("subtraction_outcome.jsp");
        disp.forward(request, response);
        }
    }

    


