package learning.gradle;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 */
@WebServlet(name="hello", urlPatterns={"/"})
public class AppServlet extends HttpServlet
{
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse res)
          throws ServletException, IOException
  {

    req.setAttribute("message","Hello World");
    /*res.setContentType("text");
    res.getWriter().write("Hello");
    res.getWriter().flush();*/
    req.getRequestDispatcher("/index.jsp").forward(req,res);
  }
}
