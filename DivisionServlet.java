

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.ArithmeticManager;


public class DivisionServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        double num1 = Double.parseDouble(request.getParameter("num1"));
        double num2 = Double.parseDouble(request.getParameter("num2"));
        
        ArithmeticManager am = new ArithmeticManager();
        double quotient = am.division(num1, num2);
        
        request.setAttribute("num1", num1);
        request.setAttribute("num2", num2);
        request.setAttribute("quotient", quotient);
        
        RequestDispatcher disp = request.getRequestDispatcher("division_outcome.jsp");
        disp.forward(request, response);
    }

  

}
