package com.ty.emptask.view;

import com.ty.emptask.dao.EmployeeDao;
import com.ty.emptask.dto.Employee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Get parameters from the request
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        // Initialize DAO to validate user
        EmployeeDao employeeDao = new EmployeeDao();
        Employee employee = employeeDao.findEmployeeByEmailAndPassword(email, password);

        if (employee != null) {
            // Login successful
            resp.getWriter().println("Login successful! Welcome, " + employee.getName());
        } else {
            // Login failed
            resp.getWriter().println("Invalid email or password. Please try again.");
        }
    }
}
