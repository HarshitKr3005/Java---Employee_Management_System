package code;

import net.proteanit.sql.DbUtils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;
import java.awt.*;

public class ViewEmployee extends JFrame implements ActionListener {

    JTable table;
    JLabel searchlbl;
    Choice cemployeeId;
    JButton search, print, update, back;


    ViewEmployee() {

        setSize(900,700);
        setLocation(300,100);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        searchlbl = new JLabel("Search by Employee ID");
        searchlbl.setBounds(20,20,150,20);
        add(searchlbl);

        cemployeeId = new Choice();
        cemployeeId.setBounds(180,20,150,20);
        add(cemployeeId);

        search = new JButton("Search");
        search.setBounds(20, 70, 80, 20);
        search.addActionListener(this);
        add(search);

        print = new JButton("Print");
        print.setBounds(120, 70, 80, 20);
        print.addActionListener(this);
        add(print);

        update = new JButton("Update");
        update.setBounds(220, 70, 80, 20);
        update.addActionListener(this);
        add(update);

        back = new JButton("Back");
        back.setBounds(320, 70, 80, 20);
        back.addActionListener(this);
        add(back);

        table = new JTable();

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from employee");

            while (rs.next()) {
                cemployeeId.add(rs.getString("empid"));
            }
        } catch(Exception e) {
            System.out.println(e);
        }
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from employee");
            table.setModel(DbUtils.resultSetToTableModel(rs));


        } catch(Exception e) {
            System.out.println(e);
        }

        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0,100,900,600);
        add(jsp);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == search) {
            String query = "select * from employee where empid = '"+cemployeeId.getSelectedItem()+"'";
            try {
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                System.out.println(e);
            }
        } else if(ae.getSource() == print) {
            try {
                table.print();
            } catch (Exception e) {
                System.out.println(e);
            }

        } else if(ae.getSource() == update) {
            setVisible(false);
            new UpdateEmployee(cemployeeId.getSelectedItem());
        } else {
            setVisible(false);
            new Home();
        }
    }

    public static void main(String[] args) {
        new ViewEmployee();
    }
}
