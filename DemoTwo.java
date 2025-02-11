enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

public class DemoTwo {
    public static void main(String[] args) {

        Day today=Day.SATURDAY;

        if(today==Day.SUNDAY)
            System.out.println("Today ia sunday");
        else if(today==Day.MONDAY)
             System.out.println("Today is monday");
        else if(today==Day.TUESDAY)
             System.out.println("Today is tuesday");
        else if(today==Day.WEDNESDAY)
             System.out.println("Today is wednesday");  
        else if(today==Day.THURSDAY)
             System.out.println("Today is thursday"); 
        else if(today==Day.FRIDAY)
             System.out.println("Today is friday"); 
        else if(today==Day.SATURDAY)
             System.out.println("Today is saturday"); 
        else
             System.out.println("Wrong");     
    }
}
