import java.util.HashSet;

public class SetDemo1 {

    public static void main(String[] args) {
        HashSet<Integer> numberSet = new HashSet<>();
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
