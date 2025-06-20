package code;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;


public class UpdateEmployee extends JFrame implements ActionListener {

    JLabel heading, labelname, labelfname, labeldob, labelsalary, labeladdress, labelphone, labelemail, labeleducation, labeldesignation, labelaadhar, labelempid, lblempid;
    JTextField tfeducation, tffname, tfsalary, tfaddress, tfphone, tfemail, tfdesignation, tfaadhar;
    JButton add, back;
    String empid;

    UpdateEmployee(String empid) {
        this.empid = empid;

        setLayout(null);
        getContentPane().setBackground(Color.white);

        heading = new JLabel("Update Employee Detail");
        heading.setBounds(320,20,500,50);
        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
        add(heading);

        labelname = new JLabel("Name:");
        labelname.setBounds(50,150,150,30);
        labelname.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelname);

        JLabel lblname = new JLabel();
        lblname.setBounds(200, 150, 150, 30);
        add(lblname);

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

        JLabel lbldob = new JLabel();
        lbldob.setBounds(200,200,150,30);
        add(lbldob);

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

        tfeducation = new JTextField();
        tfeducation.setBounds(600,300,150,30);
        add(tfeducation);

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

        JLabel lblaadhar = new JLabel();
        lblaadhar.setBounds(600, 350, 150, 30);
        add(lblaadhar);

        labelempid = new JLabel("Employee ID:");
        labelempid.setBounds(50,400,150,30);
        labelempid.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelempid);

        lblempid = new JLabel();
        lblempid.setBounds(200,400,150,30);
        lblempid.setFont(new Font("serif", Font.BOLD, 20));
        add(lblempid);

        try {
            Conn c = new Conn();
            String query = "select * from employee where empid = '"+empid+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()) {
                lblname.setText(rs.getString("name"));
                tffname.setText(rs.getString("fname"));
                lbldob.setText(rs.getString("dob"));
                tfaddress.setText(rs.getString("address"));
                tfsalary.setText(rs.getString("salary"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
                tfeducation.setText(rs.getString("education"));
                lblaadhar.setText(rs.getString("aadhar"));
                lblempid.setText(rs.getString("empid"));
                tfdesignation.setText(rs.getString("designation"));


            }
        } catch (Exception e) {
            System.out.println(e);
        }

        add = new JButton("Update Details");
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
            String fname = tffname.getText();
            String salary = tfsalary.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String education = tfeducation.getText();
            String designation = tfdesignation.getText();

            try {
                Conn conn = new Conn();
                String query = "update employee set fname = '"+fname+"', salary = '"+salary+"', address =  '"+address+"', phone = '"+phone+"', email = '"+email+"', education = '"+education+"', designation = '"+designation+"' where empid = '"+empid+"'";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details updated successfully");
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
        new UpdateEmployee("");
    }
}
