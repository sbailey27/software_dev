package w03Arrays;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class w03ComparingArrays {
    public static void main (String [] args){
        String output;

        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 3, 4};

        //compare arrays
        if (Arrays.equals(array1, array2)){
            output = "Arrays are the same";
        }else{
            output = "Arrays are not the same";
        }

        JOptionPane.showMessageDialog(null, output, "",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
