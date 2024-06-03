package week02ifstatement;

import javax.swing.*;

public class week02ifstatement {
    public static void main (String[] args){
        //declare variables
        int mark;
        int passMark = 50;

        //read in mark
        mark = Integer.parseInt(JOptionPane.showInputDialog("Enter your grade"));

        //see if user passed or failed
        if (mark >= passMark){
            System.out.println("You passed!");
        }
        else{
            System.out.println("You failed :(");
        }
    }
}
