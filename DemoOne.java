enum Laptop {
    MAC(2000), HP(1500), MSI(1800), ASUS(1850), LENOVO(1400);

    private int price;

    private Laptop(int price) {  
        this.price = price;
    }

    public int getPrice() {  
        return price;
    }

    public void setPrice(int price) {  
        this.price = price;
    }
}


public class DemoOne {
    public static void main(String[] args) {
        // Laptop lap=Laptop.ASUS;
        // System.out.println(lap);
        // System.out.println(lap.getPrice());

        for(Laptop lap :Laptop.values()){
            System.out.println(lap +" : "+ lap.getPrice() );
        }
    }
}
