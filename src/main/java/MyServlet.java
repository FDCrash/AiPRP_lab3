import service.WordsService;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends HttpServlet {

    public void init(ServletConfig servletConfig) {
        try {
            super.init(servletConfig);
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //req.setAttribute("trans",new WordsService().find(req.getParameter("text")));
        //String s= new WordsService().find(req.getParameter("text"));
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Перевод</title>");
        out.println("</head>");
        out.println("<body bgcolor='#aaccff'");
        out.println("<form>");
        out.println("<h2>" + new WordsService().find(req.getParameter("text")) + "</h2>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
        // req.getRequestDispatcher("/dictionary.jsp").forward(req,resp);
    }

}
