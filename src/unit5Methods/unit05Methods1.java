package unit5Methods;

import javax.swing.*;

public class unit05Methods1 {
    public static void main (String[] args){

        printWelcomeMessage();


    } //end of main

    public static void printWelcomeMessage(){
        String output = "Welcome!";

        JOptionPane.showMessageDialog(null, output, "",
                JOptionPane.INFORMATION_MESSAGE);
    }
} //end of class
