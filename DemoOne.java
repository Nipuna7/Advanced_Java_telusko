interface Computer{
    public abstract void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("code,compile,run");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("code,compile,run : fast");
    }
}


class Developer{
    public void devApp(Computer lap){
        lap.code();
    }
}

public class DemoOne{
    public static void main(String[] args){
        Computer lap=new Laptop();
        Computer desk=new Desktop();

        Developer kapila=new Developer();
        kapila.devApp(desk);
    }
}