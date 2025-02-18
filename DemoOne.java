import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

}

public class DemoOne{
    public static void main(String[] args){

        Comparator<Student> com=( i, j)-> i.age > j.age ? 1 : -1;
            
        

        List<Student> studs=new ArrayList<>();
        studs.add(new Student(24, "chika"));
        studs.add(new Student(25, "nuwan"));
        studs.add(new Student(30, "supun"));
        studs.add(new Student(28, "nalin"));

        Collections.sort(studs, com);
        for(Student s: studs)
            System.out.println(s);

    }
}