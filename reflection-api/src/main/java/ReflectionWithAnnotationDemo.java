import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Dep12(startingDate = "2025-01-01")
public class ReflectionWithAnnotationDemo {

    @Dep12(startingDate = "2024-01-23")
    static String startingDate;

    @Dep12(duration = 8, startingDate = "2024-01-24")
    static void printDep12Details(int duration, String startingDate) {
        System.out.println("Duration: " + duration);
        System.out.println("Starting Date: " + startingDate);
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Dep12 clzAnnotation = ReflectionWithAnnotationDemo.class.getDeclaredAnnotation(Dep12.class);
        System.out.println(clzAnnotation.startingDate());
        System.out.println(clzAnnotation.duration());
        System.out.println("--------------------------");
        System.out.println(startingDate);
        Field dateField = ReflectionWithAnnotationDemo.class.getDeclaredField("startingDate");
        Dep12 dateFieldAnnotation = dateField.getDeclaredAnnotation(Dep12.class);
        dateField.set(ReflectionWithAnnotationDemo.class, dateFieldAnnotation.startingDate());
        System.out.println(startingDate);
        System.out.println("--------------------------");
        Method method = ReflectionWithAnnotationDemo.class.getDeclaredMethod("printDep12Details",
                int.class, String.class);
        Dep12 methodAnnotation = method.getDeclaredAnnotation(Dep12.class);
        method.invoke(ReflectionWithAnnotationDemo.class, methodAnnotation.duration(),
                methodAnnotation.startingDate());
    }
}
