import java.lang.reflect.Field;

public class ReflectionDemo {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Field[] declaredFields = Student.class.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field);
        }

        Field addressField = Student.class.getDeclaredField("address");
        addressField.setAccessible(true);
        addressField.set(Student.class, "Panadura");
        Student.printAddress();
    }
}

class Student{
    private String id;
    private String name;
    private static String address;

    public static void printAddress(){
        System.out.println(address);
    }
}
