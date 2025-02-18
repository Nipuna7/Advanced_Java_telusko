import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Arrays;

//example with forEach---------------------------------------------------------------------------------------------------------

public class DemoOne{
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(4,5,7,2,3,6);

        // Consumer<Integer> con= n ->System.out.println(n);
        // nums.forEach(con);

        nums.forEach(n->System.out.println(n));

        // for(int i=0;i<nums.size();i++){
        //     System.out.println(nums.get(i));
        // }

        // for(int n : nums){
        //     System.out.println(n);
        // }

        //nums.forEach(n->System.out.println(n));

        // for(int n: nums){
        //     if(n%2==0){
        //         n=n*2;
        //         sum=sum+2;
        //     }
        // }

        // System.out.println(sum);
    }
}