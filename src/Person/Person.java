package Person;

import javax.swing.*;

public class Person {
    private String name;
    private String address;
    private int age;

    public Person(){}
    public String toString() {
        String output;

        output = "My name is " + this.name + ". I live at " + this.address + "\n";
        output = output + " and I am " + this.age + " years old";

        return output;
    }

    public void printDetails(){
        String output;

        output = toString();

        JOptionPane.showMessageDialog(null, output, "Details of person", JOptionPane.INFORMATION_MESSAGE);
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
        }

    public String getName() {
        return this.name;
    }

    public void setName(){
        this.name = name;
    }

    public String address(){
        return this.address;
    }

    public void setAddress(){
        this.address = address;
    }
}
