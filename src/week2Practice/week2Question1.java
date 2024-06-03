package week2Practice;

import javax.swing.JOptionPane;

public class week2Question1 {
    public static void main(String[] args){
        /*

        1.	Write a program that reads in two integers from the keyboard and displays:
        •	the value of them added together
        •	the value of them multiplied together.
        The program should also print a message saying which of the numbers is the largest. Make sure that your program
        can handle the numbers if they are equal.
         */

        //declare variables
        int num1;
        int num2;
        int sum;
        int valueMultiplied;
        int largerValue = 0;
        String output;
        String finalAnswer;

        //read in numbers
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number"));

        //calculations
        sum = num1 + num2;
        valueMultiplied = num1 * num2;

        //determine which is larger
        if (num1 != num2){
            if (num1 > num2)
            {
                largerValue = num1;
                finalAnswer = STR."The sum is: \{sum}.\n The numbers multiplied is: \{valueMultiplied}. \n The larger number is: \{largerValue}";
            }
            else
            {
                largerValue = num2;
                finalAnswer = STR."The sum is: \{sum}.\n The numbers multiplied is: \{valueMultiplied}. \n The larger number is: \{largerValue}";
            }
        }
        else
        {
            output = STR."Numbers are equal";
            finalAnswer = STR."The sum is: \{sum}.\n The numbers multiplied is: \{valueMultiplied}. \n The larger number is: \{output}";
        }



        JOptionPane.showMessageDialog(null, finalAnswer, "",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
