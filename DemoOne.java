import java.util.HashMap;
import java.util.Map;

public class DemoOne {
    public static void main(String[] args) {
        Map<Integer,String> student=new HashMap<>();
        student.put(0, "nipuna");
        student.put(1, "chika");
        student.put(2, "kapila");
        student.put(3, "malindu");

        System.out.println(student);
        System.out.println(student.keySet());
        System.out.println(student.get(2));

        for(Integer key: student.keySet()){
            System.out.println(key +" : "+student.get(key));
        }
    }
}
