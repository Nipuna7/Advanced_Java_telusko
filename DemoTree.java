public class DemoTree{
    public static void main(String[] args) {
        int i=0;
        int j=0;
        int num[]=new int[5];
        String str=null;

        try{
            j=18/i;
            System.out.println(num[1]);
            System.out.println(num[5]);
            System.out.println(str.length());
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limit"); //Multiple exception
        }

        //Exception is use to bottem
        catch(Exception e){
            System.out.println("Somrthing went wornge "+e); //Exception is the perant class of all 
        }
    }
    
}