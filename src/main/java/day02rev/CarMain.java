package day02rev;

public class CarMain {

    public static void main(String[] args) {
        
        Car c = new Car();
        c.setColour("blue");
        c.setRegistration("SGD123434z");
        c.setYear(2021);
        c.start();
        
        System.out.printf("is the car started? %b \n", c.isStarted());

        c.getOutOfMyWaya();

        Car d = new Car();
        //d.setColour("red");
        System.out.printf("Color of my car %s\n", d.getColour());
    }
    
}
 