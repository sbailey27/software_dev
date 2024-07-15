package unit5Methods;

import javax.swing.*;

public class unit05Methods2 {
    public static void main(String [] args){

        int age = readAge();
        output(age);
    }//end of main

    //Define method to read in age
    public static int readAge(){
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter you age"));
        return age;
    }//end of readAge method

    public static void output(int age1){
        String yourAge = "You are" + " " + age1 + " " + "years old";
        JOptionPane.showMessageDialog(null, yourAge, " ",
                JOptionPane.INFORMATION_MESSAGE);
    }
}//end of class
