
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		var un = request.getParameter("username");
		var pass = request.getParameter("pass");
		var email = request.getParameter("email");
		var gender = request.getParameter("gender");
		var pl = request.getParameter("prog_lang");
		var terms = request.getParameter("terms");

		PrintWriter out = response.getWriter();

		if (isChecked(terms)) {
			out.append("Welcome! " + un).append("\nusername: " + un).append("\npassword: " + pass)
					.append("\nemail: " + email).append("\ncourse: " + pl);

		} else
			out.append("Terms and conditions not accepted.");

	}

	private boolean isChecked(String terms) {
		// TODO Auto-generated method stub
		return terms != null;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
