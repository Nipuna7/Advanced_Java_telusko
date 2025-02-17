import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public class DemoTwo{
    public static void main(String atgs[]){
        List<Integer> nums=new ArrayList<Integer>();
        nums.add(8);
        nums.add(5);
        nums.add(2);
        nums.add(6);

        System.out.println(nums.get(1));
        System.out.println(nums.indexOf(6));
        
        // for(int n:nums){
        //     System.out.println(n);
        // }
    }
}