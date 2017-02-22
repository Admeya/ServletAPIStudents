package controller;

import model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Ирина on 22.02.2017.
 */
public class SpisokServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // req.setAttribute("myParam", "param");
        ArrayList<User> users = new ArrayList<User>();
        User user = new User("Irina", 3);

        users.add(user);
        users.add(new User("Dima", 3));
       // req.setAttribute("user", user);

        req.setAttribute("userlist", users);

        getServletContext().getRequestDispatcher("/spisok.jsp").forward(req, resp);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
