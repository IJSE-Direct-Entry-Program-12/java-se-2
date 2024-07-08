import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo3 {

    public static void main(String[] args) {
        TreeSet<Integer> numberSet = new TreeSet<>();
        System.out.println(numberSet.add(10));
        System.out.println(numberSet.add(30));
        System.out.println(numberSet.add(10));
        System.out.println(numberSet.add(-5));
        System.out.println(numberSet.add(50));
        System.out.println(numberSet.add(20));
        System.out.println(numberSet.add(40));

        for (Integer i : numberSet) {
            System.out.println(i);
        }
    }
}
