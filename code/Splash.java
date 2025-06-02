package code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Splash extends JFrame implements ActionListener {
    JLabel heading, image;
    JButton continueButton;

    Splash() {

        setLayout(null);
        getContentPane().setBackground(Color.white);

        heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(80, 30, 1200, 60);
        heading.setFont(new Font("serif", Font.PLAIN, 60));
        heading.setForeground(Color.RED);
        add(heading);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        image = new JLabel(i3);
        image.setBounds(50,100,1050,500);
        add(image);

        continueButton = new JButton("CLICK HERE TO CONTINUE");
        continueButton.setBounds(400,400,300,70);
        continueButton.setBackground(Color.BLACK);
        continueButton.setForeground(Color.WHITE);
        continueButton.addActionListener(this);
        image.add(continueButton);

        setSize(1170, 650);
        setLocation(200,50);
        setVisible(true);

        while(true) {
            heading.setVisible(false);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            heading.setVisible(true);

            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
        new Splash();
    }
}
