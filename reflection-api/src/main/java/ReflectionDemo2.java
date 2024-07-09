import java.lang.reflect.Field;

public class ReflectionDemo2 {
    public static void main(String[] args) {
        //Field[] fields = Child.class.getFields();
        Field[] fields = Child.class.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
    }
}

class Parent{
    private int x;
    public int y;
}

class Child extends Parent{
    private int k;
    public int m;
}
