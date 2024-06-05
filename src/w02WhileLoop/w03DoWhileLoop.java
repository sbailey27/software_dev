package w02WhileLoop;

import javax.swing.JOptionPane;

public class w03DoWhileLoop {
    public static void main (String[] args){

        String output = "";
        int counter = 0;

        do{
            output = output + counter + "\n";
            counter++;
        }
        while(counter <= 10);

        JOptionPane.showMessageDialog(null, output, "",
                JOptionPane.INFORMATION_MESSAGE);
    };



}
