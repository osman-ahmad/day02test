package day02rev;

public class Car {

    //member
    private String registration;
    protected String colour;
    private int year;
    private boolean started;
    
    public Car() {
        this.colour = "white";
        
    }

    public Car(String registration, String colour) {
        this.registration = registration;
        this.colour = colour;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isStarted() {
        return started;
    }

    public void start(){
        this.started = true;
    }

    public void stop() {
    this.started = false;
    }

    public void getOutOfMyWaya(){
        System.out.println("Hoonkk......");

    }

    
}
