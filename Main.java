
class A{
    public void show(){
        System.out.println("in A show");
    }
}

public class Main{
    public static void main(String[] args){
        A obj=new A(){
            public void show(){
                System.out.println("in new show");
            }
        };
        obj.show();
    }
}