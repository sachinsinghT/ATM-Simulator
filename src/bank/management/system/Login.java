/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;

import javax.swing.*;

/**
 *
 * @author 91600
 */
public class Login extends JFrame {
    
    Login(){
        setTitle("Automated Teller Machine");
        
        
        // ImageIcon i1 = new ImageIcon(getClass().getResource("/bank/management/system/icons/logo.jpg"));
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        JLabel label = new JLabel(i1);
        add(label);
        
        
        setSize(800,480);
        setLocation(300,150);
        setVisible(true);
    }
    public static void main(String []args){
        
        new Login();
        
    }
}
