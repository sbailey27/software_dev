package unit5Methods;

import javax.swing.*;

public class unit05Methods4 {
    public static void main(String [] args){
        int age = getAge();
        calcAge(age);

    }

    public static int getAge(){
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        return age;
    } //end of getAge method

    public static void calcAge(int age){
        int ageNextYear = age + 1;
        String output = "You will be " + ageNextYear + " years old next year";
        JOptionPane.showMessageDialog(null, output, "", JOptionPane.INFORMATION_MESSAGE);
    }

}
