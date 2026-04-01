import beans.Person;

public class TestPerson {
    public static void main(String[] args) {

        Person p = new Person();
        p.setName("Sagar");

        System.out.println("Name: " + p.getName());
    }
}