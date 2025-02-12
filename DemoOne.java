public class DemoOne {
    public static void main(String[] args){
        int i=2;
        int j=0;

        try{
            j=18/i;
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        catch(Exception e){
            System.out.println("Something went wrong.."+e);
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}
