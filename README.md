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

### 📝 Login Page
![image alt](https://github.com/HarshitKr3005/Java---Bank_Management_System/blob/afaf9ea96dc82ff4cf40309a20f621da580085bb/Screenshots/Login%20Page.png)

### 📝 Signup Page 1
![image alt](https://github.com/HarshitKr3005/Java---Bank_Management_System/blob/bcff654ad90659ba69529a77c9d33cefa98bbab8/Screenshots/Signup%20Page%201.png)

### 📝 Signup Page 2
![image alt](https://github.com/HarshitKr3005/Java---Bank_Management_System/blob/1452741ecf60b44a7c670fd1d60847314e5bfcd0/Screenshots/Signup%20Page%202.png)

### 📝 Signup Page 3
![image alt](https://github.com/HarshitKr3005/Java---Bank_Management_System/blob/1452741ecf60b44a7c670fd1d60847314e5bfcd0/Screenshots/Signup%20Page%203.png)

### 📝 ATM Page
![image alt](https://github.com/HarshitKr3005/Java---Bank_Management_System/blob/1452741ecf60b44a7c670fd1d60847314e5bfcd0/Screenshots/ATM%20Page.png)

### 📝 Deposit Page
![image alt](https://github.com/HarshitKr3005/Java---Bank_Management_System/blob/1452741ecf60b44a7c670fd1d60847314e5bfcd0/Screenshots/Deposit%20Page.png)

### 📝 Withdrawal Page
![image alt](https://github.com/HarshitKr3005/Java---Bank_Management_System/blob/1452741ecf60b44a7c670fd1d60847314e5bfcd0/Screenshots/Withdraw%20Page.png)

### 📝 Fast Cash Page
![image alt](https://github.com/HarshitKr3005/Java---Bank_Management_System/blob/1452741ecf60b44a7c670fd1d60847314e5bfcd0/Screenshots/Fast%20Cash.png)

### 📝 Mini Statement Page
![image alt](https://github.com/HarshitKr3005/Java---Bank_Management_System/blob/1452741ecf60b44a7c670fd1d60847314e5bfcd0/Screenshots/Mini%20Statement.png)

### 📝 PIN Change Page
![image alt](https://github.com/HarshitKr3005/Java---Bank_Management_System/blob/1452741ecf60b44a7c670fd1d60847314e5bfcd0/Screenshots/PIN%20Change.png)

### 📝 Balance Enquiry Page
![image alt](https://github.com/HarshitKr3005/Java---Bank_Management_System/blob/1452741ecf60b44a7c670fd1d60847314e5bfcd0/Screenshots/Balance%20Enquiry.png)

## 🙋‍♂️ Author

**Harshit Kumar**  
📧 Email: harshitkr3005@gmail.com  
🌐 GitHub: [HarshitKr3005](https://github.com/HarshitKr3005)
