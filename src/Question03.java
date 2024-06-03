import javax.swing.JOptionPane;

public class Question03 {
    public static void main(String[] args) {

        /*
        3.	Write a program that will read in a real number (i.e. one with a decimal point),
        divide it by two and display the result.
         */

        //declare variables
        float num1;
        float question3Answer;

        //read in input
        num1 = Float.parseFloat(JOptionPane.showInputDialog("Enter number"));

        //calculation
        question3Answer = num1 / 2;

        //display results
        JOptionPane.showMessageDialog(null, question3Answer, "Question 3 Answer is :",
                JOptionPane.INFORMATION_MESSAGE);
    }
}