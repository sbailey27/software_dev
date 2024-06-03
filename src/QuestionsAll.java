import javax.swing.JOptionPane;

public class QuestionsAll {
    public static void main(String[] args) {

        //Question 1 - 1.	Write a program that will read in two integers typed at the keyboard, subtract one
        // from the other, and then display the result.

        //Declare variables
        String num1;
        String num2;
        int num1Int;
        int num2Int;
        int question1Answer;

        //read in numbers
        num1 = JOptionPane.showInputDialog("Enter the first number");
        num2 = JOptionPane.showInputDialog("Enter the second number");

        //convert to integers
        num1Int = Integer.parseInt(num1);
        num2Int = Integer.parseInt(num2);

        //calculation
        question1Answer = num1Int - num2Int;

        //display results
        JOptionPane.showMessageDialog(null, question1Answer,"Question 1 Answer",
         JOptionPane.INFORMATION_MESSAGE);
    }
}