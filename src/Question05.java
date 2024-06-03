import javax.swing.*;

public class Question05 {
    public static void main(String[] args) {

        /*
            5.	Write a program that will read in a number, increase its value by 25% and display the result.
         */

        //declare variables
        float num1;
        double question5Answer;

        //read in input
        num1 = Float.parseFloat(JOptionPane.showInputDialog("Enter a number"));

        //calculation
        question5Answer = (num1 * 0.25) + num1;

        //display results
        JOptionPane.showMessageDialog(null, question5Answer, "Question 5 result is:",
                JOptionPane.INFORMATION_MESSAGE);

    }
}