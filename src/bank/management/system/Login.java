/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author 91600
 */
public class Login extends JFrame {
    
    Login(){
        setTitle("Automated Teller Machine");
        
        setLayout(null);
        
        
        // ImageIcon i1 = new ImageIcon(getClass().getResource("/bank/management/system/icons/logo.jpg"));
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
       Image i2 =i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
       
       ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);
        
        JLabel text = new JLabel("Welcome to ATM");
        text.setBounds(200,40,400,40);
        text.setFont(new Font("Osward",Font.BOLD,38));
        add(text);
        
         JLabel cardno = new JLabel("Card No:");
        cardno.setBounds(120,150,150,30);
        cardno.setFont(new Font("Raleway",Font.BOLD,28));
        add(cardno);
        
        
        JTextField cardTextField = new JTextField();
        cardTextField.setBounds(300,150,250,30);
        add(cardTextField);
        
         JLabel pin = new JLabel("Pin:");
        pin.setBounds(120,220,250,30);
        pin.setFont(new Font("Raleway",Font.BOLD,28));
        add(pin);
        
        
         JTextField pinTextField = new JTextField();
        pinTextField.setBounds(300,220,250,30);
        add(pinTextField);
        
        getContentPane().setBackground(Color.white);
        
        
        setSize(800,480);
        setLocation(300,150);
        setVisible(true);
    }
    public static void main(String []args){
        
        new Login();
        
    }
}
