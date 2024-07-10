package w03Arrays;

import javax.swing.JOptionPane;
import java.util.Arrays; //library for arrays

public class w03SortingArrays {
    public static void main (String[] args){
        String output;
        int[] myArray = {11, 23, 762, 4, 12};

        //sort array
        Arrays.sort(myArray);

        //iterate through array, listing each value at each position in the array
        output = "Array sorted: ";
        for (int loop =   0; loop < myArray.length; loop++){
            output = output + myArray[loop] + " ";
        }


        JOptionPane.showMessageDialog(null, output, "",
        JOptionPane.INFORMATION_MESSAGE);
    }
}
