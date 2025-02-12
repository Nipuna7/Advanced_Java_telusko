public class DemoTwo{
    public static void main(String[] args) {
        int i=0;
        int j=0;
        int num[]=new int[5];

        try{
            // j=18/i;
            System.out.println(num[1]);
            System.out.println(num[5]);
        }
        catch(Exception e){
            System.out.println("Somthing went wrong "+e);
        }
    }
    
}