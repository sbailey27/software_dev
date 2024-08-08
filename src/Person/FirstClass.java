package Person;

public class FirstClass {
    public static void main(String[] args){
        Person p1 = new Person();

        p1.setName("John");
        p1.setAge(21);
        p1.setAddress("Lazytown");
        p1.printDetails();
    }
}
