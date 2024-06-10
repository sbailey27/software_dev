package week3DoWhileGoAgain;

import javax.swing.*;

public class week03DoWhileGoAgain {
    public static void main (String[] args){

        String output;
        int anotherGo;

        do {
            //display message
            JOptionPane.showMessageDialog(null, "A message", "",
                    JOptionPane.INFORMATION_MESSAGE);

            output = "Do you want another go?";
            anotherGo = JOptionPane.showConfirmDialog(null, output, "Please answer",
                    JOptionPane.YES_NO_OPTION);
        }
        while (anotherGo == 0);
        }
}
