import interfaces.IDrive;

public class RemoteControlCar implements IDrive {

    private double range;
    private double price;
    private String colour;

    public RemoteControlCar(double range, double price, String colour){
        this.range = range;
        this.price = price;
        this.colour = colour;
    }

    public String drive(double distance){
        return String.format("%s remote control car drove %sm", this.colour, distance);
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }
}
