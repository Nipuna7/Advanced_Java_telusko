
@FunctionalInterface
interface A{
    void show();
}

public class DemoOne{
    public static void main(String[] args) {
        A obj= () -> System.out.println("in show");
        
        obj.show();
    }
}