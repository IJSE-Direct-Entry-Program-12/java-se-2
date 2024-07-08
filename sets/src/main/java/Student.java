import lombok.*;

import java.util.Objects;

@Data
//@EqualsAndHashCode
//@Getter
//@Setter
//@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Comparable<Student>{
    private int id;
    private String name;
    private int totalMarks;

    @Override
    public int compareTo(Student o) {
        if (this.totalMarks == o.totalMarks) return 0;
        else if (this.totalMarks > o.totalMarks) return -1;
        else return 1;
    }

    //    @Override
//    public int hashCode() {
//        System.out.println("Hashcode()");
//        return Objects.hash(id, name, totalMarks);
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        System.out.println("Equals()");
//        if (obj instanceof Student s) {
//            return s.getId() == getId() && s.getName().equals(getName()) &&
//                   s.getTotalMarks() == getTotalMarks();
//        } else {
//            throw new ClassCastException();
//        }
//    }
}

//public class Student{
//    private int id;
//    private String name;
//    private int totalMarks;
//
//    public Student() {
//    }
//
//    public Student(int id, String name, int totalMarks) {
//        this.id = id;
//        this.name = name;
//        this.totalMarks = totalMarks;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getTotalMarks() {
//        return totalMarks;
//    }
//
//    public void setTotalMarks(int totalMarks) {
//        this.totalMarks = totalMarks;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//               "id=" + id +
//               ", name='" + name + '\'' +
//               ", totalMarks=" + totalMarks +
//               '}';
//    }
//}