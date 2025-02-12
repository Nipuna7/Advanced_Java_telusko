
@FunctionalInterface
interface B{
    void show(int i);
}

public class DemoTwo{
    public static void main(String[] args) {
        B obj= i -> System.out.println("in show"+ i);  //only use one parameter
        
        obj.show(5);
    }
}