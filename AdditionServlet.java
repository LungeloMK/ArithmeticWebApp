
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.ArithmeticManager;

public class AdditionServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      //retrieve the parameter values 
        int num1 =Integer.parseInt(request.getParameter("num1"));
        int num2 =Integer.parseInt(request.getParameter("num2"));
     // Perfom business logic
        ArithmeticManager am = new ArithmeticManager();
        int sum = am.add(num1, num2);
        
     //attach data to the request object
        request.setAttribute("num1", num1);
        request.setAttribute("num2", num2);
        request.setAttribute("sum", sum);
     
     //Forward the result to the JSP    
        RequestDispatcher disp = request.getRequestDispatcher("add_outcome.jsp");
        disp.forward(request, response);
    }



}
