package week2Practice;

import javax.swing.*;

public class week2Question3 {
    public static void main (String[] args){
        /*
        3.	Write a program that will test whether a character entered is a vowel or not and will display an appropriate
        message as a result.
         */

        String output;
        String charAsString;
        char theChar;

        charAsString = JOptionPane.showInputDialog("Please enter a character");
        theChar = charAsString.charAt(0);

        if(theChar == 'a' || theChar == 'e' || theChar == 'i' || theChar == 'o' || theChar == 'u'){
            output = "The character is a vowel";
        }
        else{
            output = "The character is a consonant";
        }

        JOptionPane.showMessageDialog(null, output, "",
                JOptionPane.INFORMATION_MESSAGE);

    }
}
