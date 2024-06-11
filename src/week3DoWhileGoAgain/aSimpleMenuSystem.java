package week3DoWhileGoAgain;
import javax.swing.*;

public class aSimpleMenuSystem {
    public static void main (String[] args){

        //declare variables
        int num = 0;
        String output;
        String usersNumber;

        do {
            //output
            output = "Select one of the menu options \n\n 1  - Start program \n 2 - View Details \n 3 - Exit \n";

            //prompt for input
            num = Integer.parseInt(JOptionPane.showInputDialog(output));

            if (num == 1){
                output = "Program started";
                JOptionPane.showMessageDialog(null, output, "",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            if (num == 2){
                output = "Deets";
                JOptionPane.showMessageDialog(null, output, "",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }while(num != 3);
    }
}
