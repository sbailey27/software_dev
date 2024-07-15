package w03Arrays;

import javax.swing.JOptionPane;
import java.util.Arrays;
public class w03CopyingArrays {
    public static void main (String [] args){
        String output = "";
        int [] myArray = {1, 2, 3, 4, 5, 6};
        int [] myArray2 = new int[myArray.length];

        //copy myArray into myArray2
        System.arraycopy(myArray, 0, myArray2, 0, myArray2.length);

        //increment myArray
        for(int loop = 0; loop < myArray.length; loop++){
            myArray[loop] = myArray[loop] + 1;
        }

        //print out myArray
        for(int printLoop = 0; printLoop < myArray.length; printLoop++){
            output = output + " " + myArray[printLoop];
        }

        //print out myArray2
//        for(int loop = 0; loop < myArray2.length; loop++){
//            output = output + " " + myArray2[loop];
//        }

        JOptionPane.showMessageDialog(null, output, "",
                JOptionPane.INFORMATION_MESSAGE);


    }
}
