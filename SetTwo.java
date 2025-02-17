
import java.util.Set;
import java.util.TreeSet;

public class SetTwo{
    public static void main(String atgs[]){
        Set<Integer> nums=new TreeSet<Integer>();
        nums.add(82);
        nums.add(54);
        nums.add(25);
        nums.add(62);
        
        for(int n:nums){
           
            System.out.println(n);  //Treeset will give you value in sorted format
        }
    }
}