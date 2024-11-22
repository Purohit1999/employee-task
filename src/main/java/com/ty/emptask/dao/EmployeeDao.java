package com.ty.emptask.dao;

import com.ty.emptask.dto.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class EmployeeDao {
    private final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
    private final EntityManager entityManager = entityManagerFactory.createEntityManager();

    // Existing saveEmployee method...
    public Employee saveEmployee(Employee employee) {
        entityManager.getTransaction().begin();
        entityManager.persist(employee);
        entityManager.getTransaction().commit();
        return employee;
    }

    // New method to find employee by email and password
    public Employee findEmployeeByEmailAndPassword(String email, String password) {
        String jpql = "SELECT e FROM Employee e WHERE e.email = :email AND e.password = :password";
        Query query = entityManager.createQuery(jpql);
        query.setParameter("email", email);
        query.setParameter("password", password);

        try {
            return (Employee) query.getSingleResult();
        } catch (Exception e) {
            return null; // No user found
        }
    }
}
