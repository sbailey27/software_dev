import javax.swing.JOptionPane;

public class Question01 {
    public static void main(String[] args) {

        /* Question 1 - 1.	Write a program that will read in two integers typed at the keyboard, subtract one
        from the other, and then display the result.
        */

        //Declare variables
        int num1;
        int num2;
        int question1Answer;

        //read in numbers
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number"));

        //calculation
        question1Answer = num1 - num2;

        //display results
        JOptionPane.showMessageDialog(null, question1Answer,"Question 1 Answer",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
