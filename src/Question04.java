import javax.swing.*;

public class Question04 {
    public static void main(String[] args) {

        /*
        4.	Write a program that reads in a users name and age and displays a message telling them how old they
        will be this time next year.
         */

        //declare variables
        String name;
        int age;
        int ageNextYear;
        String output;

        //read in input
        name = JOptionPane.showInputDialog("Enter you name");
        age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));

        //calculation
        ageNextYear = age + 1;
        output = STR."Hey \{name}, you will be \{ageNextYear} years old this time next year";


        //display results
        JOptionPane.showMessageDialog(null, output, "Question 4 Answer:",
                JOptionPane.INFORMATION_MESSAGE);


    }
}