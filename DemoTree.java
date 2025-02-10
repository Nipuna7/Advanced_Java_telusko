
interface A {
    void show();  //method inside the interface bydefult abstract.
    void config();
 }
interface X{
    void run();
 }
//  interface Y extends X{

//  }
 class B implements A,X{
     public void show(){
         System.out.println("in show");
     }
     public void config(){
         System.out.println("in config");
     }
     public void run(){
        System.out.println("running");
     }
 }
 public class DemoTree {
     public static void main(String[] args) {
         A obj=new B();
         obj.show();
         obj.config();

         X obj1=new B();
         obj1.run();
         
     }
 }
 