/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latkuis;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author salmanfaris
 */
public class LoginPage extends JFrame implements ActionListener {

    JButton Login = new JButton("Login");
    JLabel username = new JLabel("Username");
    JLabel password = new JLabel("Password");
    JTextField user = new JTextField();
    JPasswordField pass = new JPasswordField();

    LoginPage() {
        setVisible(true);
        setSize(480, 360);
        setTitle("Halaman Login");
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        add(Login);
        add(username);
        add(password);
        add(pass);
        add(user);

        Login.setBounds(170, 250, 100, 30);
        username.setBounds(20, 30, 100, 30);
        password.setBounds(20, 80, 100, 30);
        user.setBounds(20, 50, 200, 35);
        pass.setBounds(20, 100, 200, 35);
        Login.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String User = user.getText();
            String Pass = new String(pass.getPassword());

            if (e.getSource() == Login) {
                if (User.equals("123230024") && Pass.equals("024")) {
                    new HomePage(User);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Salah Password Cik");
                }

            }

        } catch (Exception err) {
            JOptionPane.showMessageDialog(this, err);
        }

    }
}
