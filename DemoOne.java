
@FunctionalInterface
interface A{
    int add(int i,int j);
}

public class DemoOne {
    public static void main(String[] args) {
        // A obj=(int i,int j)->{
        //     return i+j;
        // };

        // A obj=(int i,int j)-> i+j;

        A obj=(i,j) -> i+j;
        
        int resalt=obj.add(5, 12);
        System.out.println(resalt);
    }
}
