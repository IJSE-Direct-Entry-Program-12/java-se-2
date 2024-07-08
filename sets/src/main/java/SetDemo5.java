import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo5 {

    public static void main(String[] args) {
        Student s1 = new Student(1, "Kasun", 93);
        Student s2 = new Student(2, "Nuwan", 83);
        Student s3 = new Student(3, "Ruwan", 65);
        Student s4 = new Student(4, "Supun", 20);
        Student s5 = new Student(5, "Kamal", 13);
        Student s6 = new Student(5, "Kamal", 13);
        Set<Student> studentSet = new TreeSet<>();
        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
        studentSet.add(s4);
        studentSet.add(s5);
        studentSet.add(s6);
        studentSet.forEach(System.out::println);
        System.out.println("Is s5 == s6? " + s5.equals(s6));
    }
}
