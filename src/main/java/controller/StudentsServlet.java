package controller;

import model.Students;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ирина on 22.02.2017.
 */
public class StudentsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url = "jdbc:postgresql://localhost:5432/Students";
        String login = "postgres";
        String password = "root";

        String tableStudent = "student";

        OperationsWithBD obd = new OperationsWithBD(url, login, password);

        List<Students> students = obd.selectDbAll(tableStudent);
//        for (Students stud: students){
//            System.out.println(stud);
//        }

        req.setAttribute("studentList", students);

        getServletContext().getRequestDispatcher("/students.jsp").forward(req, resp);

    }
}
