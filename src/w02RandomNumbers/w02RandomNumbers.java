package w02RandomNumbers;

import javax.swing.JOptionPane;
import java.util.Random;

public class w02RandomNumbers {
    public static void main (String[] args){
        String output;
        int num;
        Random numGenerator = new Random();

        for (int count = 0; count < 10; count++){
            num = numGenerator.nextInt(10);

            output = STR."Your number is \{num}";

            JOptionPane.showMessageDialog(null, output, "",
                    JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
