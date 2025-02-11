enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

public class DemoOne {
    public static void main(String[] args) {

        Day[] today = Day.values();//to get a all value 
       for(Day s: today){
            System.out.println(s+" : "+s.ordinal());
        }
        // System.out.println("Today is: " + today);
        // System.out.println(today.ordinal());
    }
}
