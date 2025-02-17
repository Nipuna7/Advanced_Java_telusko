
import java.util.HashSet;
import java.util.Set;

public class set{
    public static void main(String atgs[]){
        Set<Integer> nums=new HashSet<Integer>();
        nums.add(82);
        nums.add(54);
        nums.add(25);
        nums.add(62);
        
        for(int n:nums){
           
            System.out.println(n);  //set will not give you value in sorted format
        }
    }
}