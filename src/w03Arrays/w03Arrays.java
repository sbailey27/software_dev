package w03Arrays;

import javax.swing.*;

public class w03Arrays {
    public static void main (String [] args){
        String output;
        String aNum;
        int num;
        final int ARRAY_SIZE = 3;
        int[] userNumbers = new int[ARRAY_SIZE];
        int counter = 0;

        //ask user to enter numbers
//        while(counter < 3){
//            aNum = JOptionPane.showInputDialog("Enter a number");
//            userNumbers[] = Integer.parseInt(aNum);
//            counter++;
        //loop
        for (int loop = 0; loop < userNumbers.length; loop++){
            aNum = JOptionPane.showInputDialog("Enter number");
            num = Integer.parseInt(aNum);

            //store int in array
            userNumbers[loop] = num;
        }
        //construct output
        output = "You entered ";
        for (int loop = 0; loop < userNumbers.length; loop++){
            output = output + userNumbers[loop] + " ";

        }

        //print output
        JOptionPane.showMessageDialog(null, output, "",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
