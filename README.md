# 🧑‍💼 Employee Management System

A simple Java-based Employee Management System with a graphical user interface (GUI) built using **Swing**. This project allows users to add, view, update, and delete employee records with ease.

## 💡 Features

- Add new employee with detailed information
- View existing employee records
- Update employee details
- Delete employee entries
- Search for employees by name or ID
- User-friendly GUI using Java Swing
- Integrated calendar (JDateChooser) for date selection
- Basic form validation

## 🛠️ Technologies Used

- Java (JDK 8+)
- Java Swing (for GUI)
- AWT (for additional UI components)
- JDBC (for database connectivity)
- MySQL (as the database)
- IntelliJ IDEA (Recommended IDEs)

## 📁 Project Structure
```
Java---Employee_Management_System/
├── src/
│ └── code/
│ ├── AddEmployee.java
│ ├── ViewEmployee.java
│ ├── UpdateEmployee.java
│ ├── RemoveEmployee.java
│ ├── Home.java
│ ├── Splash.java
│ └── Login.java
└── images/
└── (image assets used in GUI)
```


## 🧾 Database Schema

Create a table in your MySQL database with the following structure:

```sql
CREATE TABLE employee (
    name VARCHAR(20),
    fname VARCHAR(20),
    dob VARCHAR(30),
    salary VARCHAR(20),
    address VARCHAR(100),
    phone VARCHAR(20),
    email VARCHAR(40),
    education VARCHAR(30),
    designation VARCHAR(30),
    aadhar VARCHAR(20),
    empid VARCHAR(15)
);
```

## 🖼️ Screenshots

### 📝 Splash Page
![image alt](https://github.com/HarshitKr3005/Java---Employee_Management_System/blob/58e47f67e306531e259c31f4ff87e8cb48af6912/Screenshots/Splash%20Page.png)

### 📝 Login Page 
![image alt](https://github.com/HarshitKr3005/Java---Employee_Management_System/blob/58e47f67e306531e259c31f4ff87e8cb48af6912/Screenshots/Login%20Page.png)

### 📝 Home Page
![image alt](https://github.com/HarshitKr3005/Java---Employee_Management_System/blob/58e47f67e306531e259c31f4ff87e8cb48af6912/Screenshots/Home%20Page.png)

### 📝 Add Employee Page
![image alt](https://github.com/HarshitKr3005/Java---Employee_Management_System/blob/58e47f67e306531e259c31f4ff87e8cb48af6912/Screenshots/Add%20Employee%20Page.png)

### 📝 View Employee Page
![image alt](https://github.com/HarshitKr3005/Java---Employee_Management_System/blob/58e47f67e306531e259c31f4ff87e8cb48af6912/Screenshots/View%20Employee%20Page.png)

### 📝 Update Employee Page
![image alt](https://github.com/HarshitKr3005/Java---Employee_Management_System/blob/58e47f67e306531e259c31f4ff87e8cb48af6912/Screenshots/Update%20Employee%20Page.png)

### 📝 Remove Employee Page
![image alt](https://github.com/HarshitKr3005/Java---Employee_Management_System/blob/58e47f67e306531e259c31f4ff87e8cb48af6912/Screenshots/Remove%20Employee%20Page.png)

## 🙋‍♂️ Author

**Harshit Kumar**  
📧 Email: harshitkr3002@gmail.com  
🌐 GitHub: [HarshitKr3005](https://github.com/HarshitKr3005)
