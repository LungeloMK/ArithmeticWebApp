

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.ArithmeticManager;

public class MultiplyServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        
         ArithmeticManager an = new ArithmeticManager();
         int product = an.multiply(num1, num2);
         
         request.setAttribute("num1", num1);
         request.setAttribute("num2", num2);
         request.setAttribute("product", product);
         
         RequestDispatcher disp = request.getRequestDispatcher("multiply_outcome.jsp");
         disp.forward(request, response);
        }
    }

  


