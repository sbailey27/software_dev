import javax.swing.JOptionPane;

public class Question02 {
    public static void main(String[] args) {

            /*
            2.	Write a program that will read in an integer, divide it by two, and display the result.
             */

        //declare variables
        int num1;
        int question2Result;

        //read in input
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter number"));

        //calculation
        question2Result = num1 / 2;

        //display result
        JOptionPane.showMessageDialog(null, question2Result, "Question 2 result:",
        JOptionPane.INFORMATION_MESSAGE);
    }
}