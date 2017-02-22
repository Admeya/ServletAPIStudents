package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Ирина on 22.02.2017.
 */
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String input = req.getParameter("input");
//        PrintWriter pw = resp.getWriter();
//        pw.append(input);
//        getServletContext().getRequestDispatcher("/").include(req, resp);
        req.setAttribute("input", input);
       // req.getRequestDispatcher("/list").forward(req, resp);
        resp.sendRedirect("/list");
    }
}
