package code;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class AddEmployee extends JFrame implements ActionListener {

    JLabel heading, labelname, labelfname, labeldob, labelsalary, labeladdress, labelphone, labelemail, labeleducation, labeldesignation, labelaadhar, labelempid, lblempid;
    JTextField tfname, tffname, tfsalary, tfaddress, tfphone, tfemail, tfdesignation, tfaadhar;
    JButton add, back;
    JDateChooser dcdob;
    JComboBox cbeducation;
    Random ran = new Random();
    int number = ran.nextInt(999999);

    AddEmployee() {

        setLayout(null);
        getContentPane().setBackground(Color.white);

        heading = new JLabel("Add Employee Detail");
        heading.setBounds(320,20,500,50);
        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
        add(heading);

        labelname = new JLabel("Name:");
        labelname.setBounds(50,150,150,30);
        labelname.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelname);

        tfname = new JTextField();
        tfname.setBounds(200, 150, 150, 30);
        add(tfname);

        labelfname = new JLabel("Father's Name:");
        labelfname.setBounds(400,150,150,30);
        labelfname.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelfname);

        tffname = new JTextField();
        tffname.setBounds(600, 150, 150, 30);
        add(tffname);

        labeldob = new JLabel("Date of Birth:");
        labeldob.setBounds(50,200,150,30);
        labeldob.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeldob);

        dcdob = new JDateChooser();
        dcdob.setBounds(200,200,150,30);
        add(dcdob);

        labelsalary = new JLabel("Salary:");
        labelsalary.setBounds(400,200,150,30);
        labelsalary.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelsalary);

        tfsalary = new JTextField();
        tfsalary.setBounds(600, 200, 150, 30);
        add(tfsalary);

        labeladdress = new JLabel("Address:");
        labeladdress.setBounds(50,250,150,30);
        labeladdress.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeladdress);

        tfaddress = new JTextField();
        tfaddress.setBounds(200, 250, 150, 30);
        add(tfaddress);

        labelphone = new JLabel("Phone:");
        labelphone.setBounds(400,250,150,30);
        labelphone.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelphone);

        tfphone = new JTextField();
        tfphone.setBounds(600, 250, 150, 30);
        add(tfphone);

        labelemail = new JLabel("Email:");
        labelemail.setBounds(50,300,150,30);
        labelemail.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelemail);

        tfemail = new JTextField();
        tfemail.setBounds(200, 300, 150, 30);
        add(tfemail);

        labeleducation = new JLabel("Highest Education:");
        labeleducation.setBounds(400,300,160,30);
        labeleducation.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeleducation);

        String course[] = {"BBA", "BCA", "BA","BSC", "B.COM", "B.Tech", "MBA", "MCA", "MA", "M.Tech", "MSC", "PHD"};

        cbeducation = new JComboBox(course);
        cbeducation.setBackground(Color.WHITE);
        cbeducation.setBounds(600,300,150,30);
        add(cbeducation);

        labeldesignation = new JLabel("Designation:");
        labeldesignation.setBounds(50,350,150,30);
        labeldesignation.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeldesignation);

        tfdesignation = new JTextField();
        tfdesignation.setBounds(200, 350, 150, 30);
        add(tfdesignation);

        labelaadhar = new JLabel("Aadhar Number:");
        labelaadhar.setBounds(400,350,160,30);
        labelaadhar.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelaadhar);

        tfaadhar = new JTextField();
        tfaadhar.setBounds(600, 350, 150, 30);
        add(tfaadhar);

        labelempid = new JLabel("Employee ID:");
        labelempid.setBounds(50,400,150,30);
        labelempid.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelempid);

        lblempid = new JLabel("" + number);
        lblempid.setBounds(200,400,150,30);
        lblempid.setFont(new Font("serif", Font.BOLD, 20));
        add(lblempid);

        add = new JButton("Add Details");
        add.setBounds(250, 550, 150, 40);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.white);
        add.addActionListener(this);
        add(add);

        back = new JButton("Back");
        back.setBounds(450, 550, 150, 40);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);

        setSize(900,700);
        setLocation(300,50);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == add) {
            String name = tfname.getText();
            String fname = tffname.getText();
            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String salary = tfsalary.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String education = (String) cbeducation.getSelectedItem();
            String designation = tfdesignation.getText();
            String aadhar = tfaadhar.getText();
            String empid = lblempid.getText();

            try {
                Conn conn = new Conn();
                String query = "insert into employee values('"+name+"', '"+fname+"', '"+dob+"', '"+salary+"', '"+address+"', '"+phone+"', '"+email+"', '"+education+"', '"+designation+"', '"+aadhar+"', '"+empid+"' )";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details added successfully");
                setVisible(false);
                new Home();
            } catch(Exception e) {
                System.out.println(e);
            }
        } else {
            setVisible(false);
            new Home();
        }
    }

    public static void main(String[] args) {
        new AddEmployee();
    }
}
