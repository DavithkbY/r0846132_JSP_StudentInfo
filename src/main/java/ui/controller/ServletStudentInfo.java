package ui.controller;


import domain.db.StudentDB;
import domain.model.Student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/StudentInfo")
public class ServletStudentInfo extends HttpServlet {
    private StudentDB database = new StudentDB();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


            String voornaam = request.getParameter("voornaam");
            String naam = request.getParameter("naam");
            Student result = database.FindStudent(voornaam,naam);

            request.setAttribute("result", result);
            RequestDispatcher view;
            if(result != null){
                view = request.getRequestDispatcher("gevonden.jsp");
            }
            else{
                view = request.getRequestDispatcher("nietgevonden.jsp");
            }
            view.forward(request,response);
        }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
