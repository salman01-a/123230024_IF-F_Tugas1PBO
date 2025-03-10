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
public class PaymentPage extends JFrame implements ActionListener {

    JLabel labelPembelian = new JLabel("Halaman Pembelian");
    JLabel labelKategori = new JLabel("Kategori");
    JLabel labelHarga = new JLabel("Harga");
    JLabel labelJumlah = new JLabel("Jumlah");
    JTextField Jumlah = new JTextField();
    JButton beli = new JButton("Beli");
    JLabel labelTotal = new JLabel("Total Pembelian");
    JLabel hargaSatuan = new JLabel("Harga Satuan");
    JLabel jumlahPcs = new JLabel("Jumlah");
    JLabel jumlahBeli = new JLabel();

    JLabel ppn = new JLabel("PPN 11%");
    JLabel ppnBeli = new JLabel();
    JLabel totalHarga = new JLabel("Total Harga");
    JLabel HargaBeli = new JLabel();
    JLabel nameDvd = new JLabel();
    JButton kembali = new JButton("Kembali");
    JLabel hargaDvd2 = new JLabel();
    JLabel hargaDvd = new JLabel();
    int Harga;
    String User;
    PaymentPage(String user, String dvdName, int harga) {
        this.Harga = harga;
        this.User = user;
        setVisible(true);
        setSize(360, 480);
        setTitle("Halaman Pembelian");
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        add(labelPembelian);
        add(labelKategori);
        add(labelHarga);
        add(labelJumlah);
        add(Jumlah);
        add(beli);
        add(labelTotal);
        add(hargaSatuan);
        add(jumlahPcs);
        add(jumlahBeli);
        add(ppn);
        add(ppnBeli);
        add(totalHarga);
        add(HargaBeli);
        add(nameDvd);
        add(hargaDvd);
        add(hargaDvd2);
        add(kembali);
        labelPembelian.setBounds(20, 10, 200, 30);
        labelKategori.setBounds(20, 40, 200, 30);
        labelHarga.setBounds(20, 70, 200, 30);
        labelJumlah.setBounds(20, 100, 100, 30);
        Jumlah.setBounds(140, 100, 180, 30);
        beli.setBounds(20, 140, 200, 40);
        labelTotal.setBounds(20, 190, 200, 40);
        hargaSatuan.setBounds(20, 230, 200, 30);
        jumlahPcs.setBounds(20, 255, 200, 20);
        jumlahBeli.setBounds(140, 255, 200, 20);
        ppn.setBounds(20, 275, 200, 20);
        ppnBeli.setBounds(140, 275, 200, 20);
        totalHarga.setBounds(20, 295, 200, 20);
        HargaBeli.setBounds(140, 295, 200, 20);
        kembali.setBounds(20, 323, 200, 40);
        nameDvd.setBounds(140, 40, 200, 20);
        hargaDvd.setBounds(140, 70, 200, 20);
        hargaDvd2.setBounds(140, 234, 200, 20);

        jumlahBeli.setText("0 pcs");
        HargaBeli.setText("Rp.0");
        ppnBeli.setText("Rp. 0");
        nameDvd.setText(dvdName);
        hargaDvd.setText("Rp. " + Integer.toString(harga) + " / pcs");
        hargaDvd2.setText("Rp. " + Integer.toString(harga));

        beli.addActionListener(this);
        kembali.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == beli) {
                jumlahBeli.setText(Integer.parseInt(Jumlah.getText()) + " pcs");
                ppnBeli.setText("Rp. " + Integer.toString(Harga * Integer.parseInt(Jumlah.getText()) * 11/100));
                HargaBeli.setText("Rp. "+ Integer.toString(((Harga * Integer.parseInt(Jumlah.getText()))) + (Harga * Integer.parseInt(Jumlah.getText()) * 11/100)) );
            }else if(e.getSource()== kembali){
                new HomePage(User);
                dispose();  
            }
            
        } catch (Exception err) {
            JOptionPane.showMessageDialog(this, "Input angka banh jangan huruf");
        }
    }
}
