import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    private String name;
    private int age;
    
    public Student() {

    }
 
    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }  
     
    
}

public class ConstructorRef {
    public static void main(String[] args){
        List<String> names=Arrays.asList("navin","kumara","saman","anuradha");

        List<Student> student=new ArrayList<>();

        // for (String name: names){
        //     student.add(new Student(name));
        // } 

        // student=names.stream()
        //       .map(name->new Student(name))
        //       .collect(Collectors.toList());

        student=names.stream()
              .map(Student::new)                 //constructor reference
              .collect(Collectors.toList());


        System.out.println(student);
    }
}
