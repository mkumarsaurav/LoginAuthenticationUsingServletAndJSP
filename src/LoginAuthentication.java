

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginAuthentication
 */
@WebServlet("/LoginAuthentication")
public class LoginAuthentication extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LoginAuthentication() {
        super();
        
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname= request.getParameter("uname");
		String pass= request.getParameter("pass");
		if(uname.equals("Saurav") && pass.equals("password")) {
			HttpSession session = request.getSession();
        	session.setAttribute("username", "uname");
			response.sendRedirect("success.jsp");
		}
		else
			response.sendRedirect("error.jsp");
	}

}
