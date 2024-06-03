package week02ifstatement;

import javax.swing.*;

public class week02NestedIfStatement {
    public static void main(String[] args) {
        //declare variables
        int mark;
        int passMark = 50;
        int distinctionMark = 70;

        //read in mark
        mark = Integer.parseInt(JOptionPane.showInputDialog("Enter your grade"));

        //see if user passed or failed
        if (mark >= passMark)
            {
                if (mark >= distinctionMark)
                {
                    System.out.println("Distinction!");
                }
                else
                {
                    System.out.println("You passed!");
                }
            }
        else
            {
                System.out.println("You failed :(");
            }

        }
    }
