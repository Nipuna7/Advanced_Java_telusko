import java.util.Collection;
import java.util.ArrayList;

public class DemoOne{
    public static void main(String atgs[]){
        Collection<Integer> nums=new ArrayList<Integer>();
        nums.add(8);
        nums.add(5);
        nums.add(2);
        nums.add(6);
        
        for(int n:nums){
            System.out.println(n);
        }
    }
}