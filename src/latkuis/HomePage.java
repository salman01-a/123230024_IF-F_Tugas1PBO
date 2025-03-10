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
public class HomePage extends JFrame implements ActionListener {

    JLabel welkam = new JLabel();
    JLabel info = new JLabel("Silahkan Pilih menu di Bawah untuk membeli DVD");
    JButton anak = new JButton("DVD Anak");
    JButton dewasa = new JButton("DVD Dewasa");
    JButton lansia = new JButton("DVD Lansia");
    JButton logout = new JButton("Log Out");

    String User;

    HomePage(String user) {
        this.User = user;
        setVisible(true);
        setSize(720, 480);
        setTitle("Halaman Utama");
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        add(welkam);
        add(info);
        add(anak);
        add(dewasa);
        add(lansia);
        add(logout);

        welkam.setText("Selamat Datang " + user);
        welkam.setBounds(20, 20, 680, 40);  
        info.setBounds(20, 70, 680, 30);
        
        
        anak.setBounds(95, 150, 150, 50);
        dewasa.setBounds(285, 150, 150, 50);  
        lansia.setBounds(475, 150, 150, 50);   
        
        
        logout.setBounds(260, 380, 200, 50);
        anak.addActionListener(this);
        dewasa.addActionListener(this);
        lansia.addActionListener(this);
        logout.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == anak) {
                new PaymentPage(User, "DVD Anak", 27891);
                dispose();
            } else if (e.getSource() == dewasa) {
                new PaymentPage(User, "DVD Dewasa", 35396);
                dispose();
            } else if (e.getSource() == lansia) {
                new PaymentPage(User, "DVD Lansia", 38550);
                dispose();
            } else if (e.getSource() == logout) {
                new LoginPage();
                dispose();
            }
        } catch (Exception err) {
            JOptionPane.showMessageDialog(this, err);
        }

    }

}
