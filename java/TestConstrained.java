import constrained.ConstrainedExample;

public class TestConstrained {
    public static void main(String[] args) {

        ConstrainedExample c = new ConstrainedExample();

        try {
            c.setAge(20);
            System.out.println("Age set successfully");

            c.setAge(15); // will give error
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}