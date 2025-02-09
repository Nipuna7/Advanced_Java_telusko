
abstract class Car{
    public abstract void drive();
    public abstract void Fly();

    public void playMusic(){
        System.out.println("play music");
    }
}
class WagonR extends Car{
    public void Fly(){
        System.out.println("fly..");
    }
    public void drive(){
        System.out.println("Driving..");
    }
}

public class Demo{
    public static void main(String[] args){
        Car obj=new WagonR();
        obj.drive();
        obj.playMusic();
        obj.Fly();
    }
}