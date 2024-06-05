package week2Practice;

import javax.swing.*;
public class week2Question4 {
    public static void main (String[] args) {
        /*
        Develop a program that will calculate the pay for children who deliver newspapers.  The pay is calculated as follows:
        1 – 100 copies   10 pence per paper
        101 or more      15  pence per paper
        For example, if somebody delivers 105 papers then their pay would be
        (100 x 10) + (5 x 15) = 1075 pence or 10 pounds and 75 pence

        Write a program that asks for the number of papers delivered and calculates and displays the amount earned.

         */
        double pay;
        int numCopies = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of copies delivered"));
        String output;

        if (numCopies <= 100){
            pay = (numCopies * .10);
        }
        else
        {
            pay = (100 * .10) + ((numCopies - 100) * .15);
        }

        output = STR."Your pay is $\{pay}";
        JOptionPane.showMessageDialog(null, output, "",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
