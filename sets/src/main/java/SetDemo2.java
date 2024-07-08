import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo2 {

    public static void main(String[] args) {
        LinkedHashSet<Integer> numberSet = new LinkedHashSet<>();
        System.out.println(numberSet.add(10));
        System.out.println(numberSet.add(30));
        System.out.println(numberSet.add(10));
        System.out.println(numberSet.add(40));
        System.out.println(numberSet.add(50));

        for (Integer i : numberSet) {
            System.out.println(i);
        }
    }
}
