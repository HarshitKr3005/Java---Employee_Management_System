package code;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    JLabel lblusernmae, lblpassword, image1;
    JTextField tfusername, tfpassword;
    JButton login;

    Login() {

        setLayout(null);
        getContentPane().setBackground(Color.white);

        lblusernmae = new JLabel("Username:");
        lblusernmae.setBounds(40,20,100,30);
        add(lblusernmae);

        tfusername = new JTextField();
        tfusername.setBounds(150, 20, 150,30);
        add(tfusername);

        lblpassword = new JLabel("Password:");
        lblpassword.setBounds(40,70,100,30);
        add(lblpassword);

        tfpassword = new JTextField();
        tfpassword.setBounds(150, 70, 150,30);
        add(tfpassword);

        login = new JButton("LOGIN");
        login.setBounds(150,140,150,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        add(login);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        image1 = new JLabel(i3);
        image1.setBounds(350,0,200,200);
        add(image1);

        setSize(600, 300);
        setLocation(450,200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            Conn c = new Conn();
            String username = tfusername.getText();
            String password = tfpassword.getText();

            String query = "select * from login where username =  '"+username+"' and password = '"+password+"'";
            ResultSet rs = c.s.executeQuery(query);
        } catch(Exception e) {

        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
