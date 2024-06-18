package w03SwitchStatements;

import javax.swing.*;

public class w03SwitchStatements {
    public static void main (String[] args){
        String usersGrade;
        String output = "";
        char grade;

        usersGrade = JOptionPane.showInputDialog("Please enter your grade (a-f)");
        grade = usersGrade.charAt(0);

        switch (grade){
            case 'a':
                output = "Fantastic result";
                break;
            case 'b':
                output = "Great result";
                break;
            case 'c':
                output = "Very good";
                break;
            case 'd':
                output = "Must do better";
                break;
            case 'e':
                output = "Poor";
                break;
            case 'f':
                output = "Fail";
                break;
            default:
                output = "I did not recognise your entry";
        }

        JOptionPane.showMessageDialog(null, output, "",
                JOptionPane.INFORMATION_MESSAGE);


    }
}
