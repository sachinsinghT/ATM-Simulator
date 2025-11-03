/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;


/**
 *
 * @author 91600
 */

public class SignUpOne extends JFrame{
    
    SignUpOne(){
        
        setLayout(null);// becuase by default setLayout is border
        
        Random ran  = new Random();
        
        JLabel formno = new JLabel("APPLICATION FORM NO. "+Math.abs(ran.nextLong()% 90L)+10L);
        formno.setBounds(140,20,600,40);// this wont work unitl setLayout is null
        formno.setFont(new Font("Raleyway",Font.BOLD,38));
        add(formno);
        
        
        JLabel personDetails = new JLabel("Page 1: Perosn Details");
        personDetails.setBounds(290,60,400,30);// this wont work unitl setLayout is null
        personDetails.setFont(new Font("Raleyway",Font.BOLD,22));
        add(personDetails);
        
        JLabel name = new JLabel("Name:");
        name.setBounds(100,140,100,30);// this wont work unitl setLayout is null
        name.setFont(new Font("Raleyway",Font.BOLD,20));
        add(name);
        
        JTextField nameTextField = new JTextField();
        nameTextField.setFont(new Font("RaleWay",Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
        
         JLabel fname = new JLabel("Fahther's Name:");
        fname.setBounds(100,190,200,30);// this wont work unitl setLayout is null
        fname.setFont(new Font("Raleyway",Font.BOLD,20));
        add(fname);
        
        JTextField fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("RaleWay",Font.BOLD,14));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);
        
        JLabel dob = new JLabel("Date of Birth:");
        dob.setBounds(100,240,200,30);// this wont work unitl setLayout is null
        dob.setFont(new Font("Raleyway",Font.BOLD,20));
        add(dob);
        
        
        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);
        
         JLabel gender = new JLabel("Gender:");
        gender.setBounds(100,290,200,30);// this wont work unitl setLayout is null
        gender.setFont(new Font("Raleyway",Font.BOLD,20));
        add(gender);
        
        JRadioButton male=new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.white);
        add(male);
        
        
        JRadioButton female=new JRadioButton("Female");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.white);
        add(female);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        
        
         JLabel email = new JLabel("Email Address:");
        email.setBounds(100,340,200,30);// this wont work unitl setLayout is null
        email.setFont(new Font("Raleyway",Font.BOLD,20));
        add(email);
        
        JTextField emailTextField = new JTextField();
        emailTextField.setFont(new Font("RaleWay",Font.BOLD,14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
        
        JLabel marital  = new JLabel("Marital Status:");
        marital.setBounds(100,390,200,30);// this wont work unitl setLayout is null
        marital.setFont(new Font("Raleyway",Font.BOLD,20));
        add(marital);
        
        
        JRadioButton married=new JRadioButton("married");
        married.setBounds(300,390,100,30);
        married.setBackground(Color.white);
        add(married);
      
        
        JRadioButton unmarried=new JRadioButton("unmarried");
        unmarried.setBounds(450,390,100,30);
        unmarried.setBackground(Color.white);
        add(unmarried);
        
        JRadioButton other=new JRadioButton("Other");
        other.setBounds(630,390,100,30);
        other.setBackground(Color.white);
        add(other);
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);
        
        
        
        JLabel address = new JLabel("Address:");
        address.setBounds(100,440,200,30);// this wont work unitl setLayout is null
        address.setFont(new Font("Raleyway",Font.BOLD,20));
        add(address);
        
        JTextField addressTextField = new JTextField();
        addressTextField.setFont(new Font("RaleWay",Font.BOLD,14));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);
        
        JLabel city = new JLabel("City:");
        city.setBounds(100,490,200,30);// this wont work unitl setLayout is null
        city.setFont(new Font("Raleyway",Font.BOLD,20));
        add(city);
        
        JTextField cityTextField = new JTextField();
        cityTextField.setFont(new Font("RaleWay",Font.BOLD,14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);
        
         JLabel state= new JLabel("State:");
        state.setBounds(100,540,200,30);// this wont work unitl setLayout is null
        state.setFont(new Font("Raleyway",Font.BOLD,20));
        add(state);
        
        JTextField stateTextField = new JTextField();
        stateTextField.setFont(new Font("RaleWay",Font.BOLD,14));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);
        
        JLabel pincode= new JLabel("Pin Code:");
        pincode.setBounds(100,590,200,30);// this wont work unitl setLayout is null
        pincode.setFont(new Font("Raleyway",Font.BOLD,20));
        add(pincode);
        
        
        JTextField pinTextField = new JTextField();
        pinTextField.setFont(new Font("RaleWay",Font.BOLD,14));
        pinTextField.setBounds(300,590,400,30);
        add(pinTextField);
        
        JButton next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(700,620,80,30);
        add(next);
        
        
        getContentPane().setBackground(Color.white);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        
    }
    
    public static void  main(String[]args){
        new SignUpOne();
    }
    
}
