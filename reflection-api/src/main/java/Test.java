public class Test {

    public static void main(String[] args) {
        System.out.println(Demo.class == new Demo().getClass());
        System.out.println(Demo.class instanceof Class);
        System.out.println(Demo.class instanceof Object);

        System.out.println("-------------------------");

        System.out.println(Customer.class == new Customer().getClass());
        // System.out.println(Customer.class == Demo.class);
        // System.out.println(new Customer().getClass() == new Demo().getClass());

        System.out.println("---------------------------");
        System.out.println(Demo.class);
        System.out.println(new Demo().getClass());
    }
}
