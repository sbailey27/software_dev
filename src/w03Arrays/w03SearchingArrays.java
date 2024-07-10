package w03Arrays;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class w03SearchingArrays {
    public static void main (String [] args){
        String output;
        String keyAsString;
        int[] myArray = {10, 37, 53, 101};
        int key;
        int search;

        //ask user enter a number
        keyAsString = JOptionPane.showInputDialog("Enter a number");
        key = Integer.parseInt(keyAsString);

        //first sort the array
        Arrays.sort(myArray);

        //search array. syntax = Arrays.binarySearch(Name_of_array, item_being_searched_for);
        //returns a positive number or 0 if value is found in array, or a negative if it is not found
        //Assign the integer "search" to the value of the returned result
        search = Arrays.binarySearch(myArray, key);

        //check if the key is found
        if (search >= 0){
            output = "Number found!";
        }else
            {
                output = "Number not found :(";
            }

        JOptionPane.showMessageDialog(null, output, "",
                JOptionPane.INFORMATION_MESSAGE);
    } //end main
} //end class
