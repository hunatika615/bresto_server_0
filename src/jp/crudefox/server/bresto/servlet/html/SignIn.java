package jp.crudefox.server.bresto.servlet.html;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.crudefox.server.bresto.Const;

/**
 * Servlet implementation class API
 */
@WebServlet(name = "signin.html", urlPatterns = { "/signin.html" })
public class SignIn extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignIn() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProc(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProc(request, response);
	}


	protected void doProc(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String disp = "/jsp/signin.jsp";
		RequestDispatcher dispatch = request.getRequestDispatcher(disp);

		request.setAttribute(Const.REQ_SELECT_PAGE, "signin");

		dispatch.forward(request, response);

	}

}
