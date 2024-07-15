package unit5Methods;

import javax.swing.*;

public class unit05Methods5 {
    public static void main (String [] args){

        //declare variables
        int age;
        String name;

        name = JOptionPane.showInputDialog("What's your name?");
        age = Integer.parseInt(JOptionPane.showInputDialog("What's your age?"));

        yourDetails(name, age);
    }//end of main

    //yourDetails method
    public static void yourDetails (String yourName, int age){
        String output;
        output = "Your name is " + yourName + " and you are " + age;
        JOptionPane.showMessageDialog(null, output, "", JOptionPane.INFORMATION_MESSAGE);
    }//end of yourDetails method

}//end of class
