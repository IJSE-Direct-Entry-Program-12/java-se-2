import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class InvokePrivateConstructorDemo {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // Constructor<?> noArgConstructor = Demo3.class.getDeclaredConstructors()[0];
        Constructor<Demo3> noArgConstructor = Demo3.class.getDeclaredConstructor();
        noArgConstructor.setAccessible(true);
        Demo3 demo3 = noArgConstructor.newInstance();
        System.out.println(demo3);
    }
}

class Demo3 {
    private Demo3(){
        System.out.println("No one can invoke me");
    }
}
