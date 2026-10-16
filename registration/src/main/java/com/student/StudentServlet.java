package com.student;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registerStudent")
public class StudentServlet extends HttpServlet {

    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String age = request.getParameter("age");
        String course = request.getParameter("course");

        try {

            Connection con = DBConnection.getConnection();

            String sql =
                "INSERT INTO students(name,email,phone,age,course) "
                + "VALUES(?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, phone);
            ps.setInt(4, Integer.parseInt(age));
            ps.setString(5, course);

            ps.executeUpdate();

            con.close();

            response.getWriter().println(
                "<h2>Student Registered Successfully!</h2>"
            );

        } catch (Exception e) {

            e.printStackTrace();

            response.getWriter().println(
                "<h2>Registration Failed!</h2>"
            );
        }
    }
}