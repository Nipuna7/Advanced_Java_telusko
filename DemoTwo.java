
interface A {
    
   String name="nipuna";  //variables inside the interface bydefult final and static
   int age=24;

   void show();  //method inside the interface bydefult abstract.
   void config();
}
class B implements A{
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
}

public class DemoTwo {
    public static void main(String[] args) {
        A obj=new B();
        obj.show();
        obj.config();
        System.out.println(obj.name);
    }
}
