package com.ty.emptask.view;

import com.ty.emptask.dao.EmployeeDao;
import com.ty.emptask.dto.Employee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("employeeName");
        long phoneNumber = Long.parseLong(req.getParameter("employeePhoneNumber"));
        int age = Integer.parseInt(req.getParameter("employeeAge"));
        String email = req.getParameter("employeeEmail");
        String password = req.getParameter("employeePassword");
        double salary = Double.parseDouble(req.getParameter("employeeSalary"));

        Employee employee = new Employee();
        employee.setAge(age);
        employee.setName(name);
        employee.setEmail(email);
        employee.setPassword(password);
        employee.setPhoneNumber(phoneNumber);
        employee.setSalary(salary);

        EmployeeDao employeeDao = new EmployeeDao();
        employeeDao.saveEmployee(employee);

        resp.getWriter().println("Employee registered successfully!");
    }
}
