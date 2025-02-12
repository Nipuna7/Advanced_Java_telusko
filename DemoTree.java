
@FunctionalInterface
interface C{
    void Show(int i,String n); //using multiple parameters
}

public class DemoTree {
    public static void main(String[] args) {
        C obj=(int age,String name)->System.out.println("your name is :"+name +" and your age is :"+age);
        obj.Show(25, "Nipuna");
    }
    
}
