package day02rev;

public class Porche extends Car{

    private String turbo = "off";
    private int accelerate = 0;
    
    public Porche() {
        super.setColour("yellow");
    }

    public Porche(String colour, String registration) {
        this.colour = colour;
        setRegistration(registration);
    }    

    @Override
    public void setColour(String c) { }

    public void accelerate() {
        this.accelerate++;
        if (this.accelerate > 4) {
            this.turbo = "on";
        }
    }

    public void decelerate() {
        this.accelerate--;
        if (this.accelerate <= 4) {
            this.turbo = "off";
        }
    }

}
