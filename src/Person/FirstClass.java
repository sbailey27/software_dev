package Person;

public class FirstClass {
    public static void main(String[] args){
        Person p1 = new Person("Robbie", "Lazytown", 21);
        Person p2=  new Person("Steph", 22);


        p1.printDetails();
        p2.printDetails();
    }
}
