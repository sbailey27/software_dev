package w02WhileLoop;

import javax.swing.JOptionPane;

public class w02WhileLoop {
    public static void main (String [] args){
        int counter = 0;
        String output = "";

        while (counter <= 10){
            output = output + counter + "\n";
            counter++;
        }

        //display
        JOptionPane.showMessageDialog(null, output, "",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
