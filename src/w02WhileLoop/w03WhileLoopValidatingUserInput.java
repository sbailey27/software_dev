package w02WhileLoop;

import javax.swing.*;

public class w03WhileLoopValidatingUserInput {
    public static void main (String[] args){
        // declare variables
        int minNumber = 1;
        int maxNumber = 10;
        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number between " + minNumber + " and " + maxNumber));
        String output;

        //validate user input
        while (number < minNumber || number > maxNumber){
            number = Integer.parseInt(JOptionPane.showInputDialog("You entered an invalid number"));
        }

        //display output
        output = "You entered " + number;
        JOptionPane.showMessageDialog(null, output, "",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
