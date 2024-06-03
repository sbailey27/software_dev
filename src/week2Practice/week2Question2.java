package week2Practice;

import javax.swing.*;

public class week2Question2 {
    public static void main(String[] args){
        /*
        2.	Write a program that reads in an integer then determines and prints whether it is odd or even.
         */

        //declare variables
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
        String oddEven;

        //determine if number is odd or even
        if (num1 % 2 == 0){
            oddEven = "Number is even";
        }
        else{
            oddEven = "Number is odd";
        }

        //display if number is odd or even
        JOptionPane.showMessageDialog(null, oddEven, "",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
