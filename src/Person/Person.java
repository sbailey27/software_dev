package Person;

import javax.swing.*;

public class Person {
    private String name;
    private String address;
    private int age;

    public Person(){}

    public Person(String name, String address, int age){
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public Person(String name, int age){
        this(name, "unknown:", age);
    }

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

    public void setName(String name){
        this.name = name;
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address){
        this.address = address;
    }
}
