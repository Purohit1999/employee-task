

---

# 🧑‍💼 Employee Task Management System

A robust **Java-based web application** designed to manage employees and their assigned tasks efficiently. This project demonstrates the integration of **Java Servlets**, **JSP**, and **Hibernate** for data persistence.

---

## 🚀 Features

- 🏢 **Employee Management**: 
  - Register new employees with details like name, email, salary, and phone number.
  - Authenticate employees with a secure login system.
- 📋 **Task Management**:
  - Assign tasks to employees with details like task name, duration, and status.
  - Manage task statuses (e.g., Assigned, Completed).
- 📂 **Database Integration**: 
  - Uses MySQL to store employee and task details.
- 🔒 **Secure Validation**:
  - Protect against invalid input with proper form validation.
- 🛠️ **User-Friendly Design**:
  - Clean and functional HTML forms for data entry.

---

## 📋 How to Use

### Employee Registration
1. Navigate to the `/register` endpoint.
2. Fill in employee details in the registration form.
3. Submit the form to add a new employee to the database.

### Employee Login
1. Navigate to the `/login` endpoint.
2. Enter the registered email and password.
3. Submit the form to log in.

### Task Management
1. Assign tasks to employees via the `/task` endpoint.
2. Provide task details like name, duration, and status.

---

## 🛠️ Project Setup

### Prerequisites:
- Java 8 or higher installed on your system.
- Apache Tomcat 9 or higher for deployment.
- MySQL installed and running locally.
- IntelliJ IDEA or any other Java IDE for development.

### Setting Up the Database:
1. Create a database named `employee-task` in MySQL.
2. Use the following SQL commands to create tables:
   ```sql
   CREATE TABLE Employee (
       id INT AUTO_INCREMENT PRIMARY KEY,
       name VARCHAR(50),
       age INT,
       salary DOUBLE,
       email VARCHAR(100) UNIQUE,
       password VARCHAR(50),
       phoneNumber BIGINT
   );

   CREATE TABLE Task (
       taskId INT AUTO_INCREMENT PRIMARY KEY,
       taskName VARCHAR(100),
       duration INT,
       taskStatus ENUM('ASSIGNED', 'COMPLETED'),
       employee_id INT,
       FOREIGN KEY (employee_id) REFERENCES Employee(id)
   );
   ```

### Configure the Application:
1. Update `persistence.xml` with your database credentials:
   ```xml
   <property name="javax.persistence.jdbc.driver" value="com.mysql.cj.jdbc.Driver"/>
   <property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/employee-task"/>
   <property name="javax.persistence.jdbc.user" value="root"/>
   <property name="javax.persistence.jdbc.password" value="yourpassword"/>
   ```

2. Add necessary environment variables to avoid exposing credentials.

---

## 🌟 Technologies Used

- **Backend**:
  - Java Servlets
  - JSP (Java Server Pages)
  - Hibernate ORM
- **Frontend**:
  - HTML, CSS
- **Database**:
  - MySQL
- **Tools**:
  - IntelliJ IDEA
  - Maven for dependency management

---

## ✨ Example Workflow

### Employee Registration:
1. Fill out the employee registration form:
   ```
   Name: John Doe
   Age: 30
   Email: john.doe@example.com
   Salary: 50000
   Phone: 9876543210
   ```
2. Submit the form.
3. The data will be saved in the `Employee` table.

### Task Assignment:
1. Navigate to the task assignment form.
2. Fill out the task details:
   ```
   Task Name: Develop Feature A
   Duration: 5 hours
   Status: ASSIGNED
   ```
3. Submit the form.
4. The task is saved in the `Task` table and linked to the assigned employee.

---

## 📂 Folder Structure

```plaintext
src/
├── main/
│   ├── java/
│   │   ├── com/ty/emptask/
│   │   │   ├── dao/      # Data Access Objects
│   │   │   ├── dto/      # Data Transfer Objects
│   │   │   ├── view/     # Servlets
│   ├── resources/
│   │   ├── META-INF/     # persistence.xml
│   │   ├── webapp/       # HTML files (login.html, register.html)
├── target/               # Compiled classes and artifacts
```

---

## 💻 Run the Application

### Using IntelliJ IDEA:
1. Open the project in IntelliJ IDEA.
2. Configure Tomcat:
   - Go to **Run → Edit Configurations**.
   - Add a new **Tomcat Server** configuration.
   - Deploy the project WAR or exploded WAR.
3. Run the server and access the application via:
   ```
   http://localhost:8080/EmployeeTask
   ```

### Using Maven:
1. Build the project:
   ```bash
   mvn clean install
   ```
2. Deploy the WAR file to a running Tomcat server.

---

## 🔄 Example Endpoints

| Endpoint         | Method | Description                   |
|------------------|--------|-------------------------------|
| `/register`      | POST   | Register a new employee       |
| `/login`         | POST   | Log in as an employee         |
| `/task`          | POST   | Assign a new task to employee |

---

## 🤝 Contributing

Contributions are welcome! Here's how to get started:
1. Fork the repository.
2. Create a new branch:
   ```bash
   git checkout -b feature-name
   ```
3. Commit your changes:
   ```bash
   git commit -m "Added new feature"
   ```
4. Push the branch:
   ```bash
   git push origin feature-name
   ```
5. Open a Pull Request.

---

## 📜 License

This project is licensed under the **MIT License**. See the [LICENSE](LICENSE) file for details.

---

## 👤 Author

**[Purohit1999](https://github.com/Purohit1999)**  

--- 

