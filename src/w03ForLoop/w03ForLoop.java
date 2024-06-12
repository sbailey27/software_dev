package w03ForLoop;

import javax.swing.*;

public class w03ForLoop {
    public static void main (String[] args){
        String output = "";

        for (int counter = 0; counter <= 10; counter++){
            output = output + counter + "\n";

        }
        JOptionPane.showMessageDialog(null, output, "",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
