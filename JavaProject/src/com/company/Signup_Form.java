package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup_Form implements ActionListener {

    JFrame jfram;
    JFrame jf;

    JTextField textField;
    JTextField textField1;
    JTextField textField2;
    JTextField textField3;
    JTextField textField4;
    JTextField textField5;

    public void Create_form(){
        jfram = new JFrame("Signup Form");
        jfram.setSize(400,700);
        jfram.setVisible(true);
        jfram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfram.setResizable(false);
    }

    public void Create_textfield(){
        textField = new JTextField();
        textField.setBounds(60,40,260,40);
        jfram.add(textField);

        textField1 = new JTextField();
        textField1.setBounds(60,120,260,40);
        jfram.add(textField1);

        textField2 = new JTextField();
        textField2.setBounds(60,200,260,40);
        jfram.add(textField2);

        textField3 = new JTextField();
        textField3.setBounds(60,280,260,40);
        jfram.add(textField3);

        textField4 = new JTextField();
        textField4.setBounds(60,360,260,40);
        jfram.add(textField4);

        textField5 = new JTextField();
        textField5.setBounds(60,440,260,40);
        jfram.add(textField5);

    }

    public void Create_button(){
        JButton button = new JButton("ثبت نام");
        button.setBounds(120,520,130,40);
        jfram.add(button);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int counter = 0 ;
        String input;
        input = textField.getText();
        if (input.length() < 3){
            System.out.println("Error!, Your Name has less than three characters ");
            counter += 1;
        }

        String input1;
        String input2;
        input1 = textField1.getText();
        input2 = textField2.getText();
        if (input1.equals(input2)){
            System.out.println("Error!, The First and The second Address is the Same ");
            counter += 1;
        }

        String input3;
        input3 = textField3.getText();
        int i = Integer.parseInt(input3);
        if (i < 18){
            System.out.println("Error!, You're age is less than 18 year's old ");
            counter += 1;
        }


        String input4;
        input4 = textField4.getText();
        int j = Integer.parseInt(input4);
        if (j < 100){
            System.out.println("Error!, You're height is less than 100 ");
            counter += 1;
        }

        String input5;
        input5 = textField5.getText();
        int k = Integer.parseInt(input5);
        if (k < 40){
            System.out.println("Error!, You're weight is less than 40 ");
            counter += 1;
        }

        if(counter == 0){
            System.out.println("You're name is :  " + input);
            System.out.println("You're First address is :  " + input1);
            System.out.println("You're Second Address is :  " + input2);
            System.out.println("You're age is :  " + input3);
            System.out.println("You're height is :  " + input4);
            System.out.println("You're weight is :  " + input5);
        }
    }
}
