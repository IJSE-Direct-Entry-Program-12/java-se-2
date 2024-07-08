import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo4 {

    public static void main(String[] args) {
        HashSet<String> nameSet1 = new HashSet<>();
        nameSet1.add("Kasun");
        nameSet1.add("Nuwan");
        nameSet1.add("Ruwan");
        nameSet1.add("Supun");
        nameSet1.add("Achintha");
        nameSet1.forEach(System.out::println);

        System.out.println("---------------------------------");

        LinkedHashSet<String> nameSet2 = new LinkedHashSet<>();
        nameSet2.add("Kasun");
        nameSet2.add("Nuwan");
        nameSet2.add("Ruwan");
        nameSet2.add("Supun");
        nameSet2.add("Achintha");
        nameSet2.forEach(System.out::println);

        System.out.println("---------------------------------");

        TreeSet<String> nameSet3 = new TreeSet<>();
        nameSet3.add("Kasun");
        nameSet3.add("Nuwan");
        nameSet3.add("Ruwan");
        nameSet3.add("Supun");
        nameSet3.add("Achintha");
        nameSet3.add("Chamal");
        nameSet3.forEach(System.out::println);
    }
}
