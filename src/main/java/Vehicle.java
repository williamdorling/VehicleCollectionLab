

public abstract class Vehicle {

    private VehicleType type;
    private int occupancy;
    private double range;
    private double price;
    private Boolean publicTravel;
    private Boolean electricPowered;

    public Vehicle(VehicleType type, int occupancy, double range, double price, Boolean publicTravel, Boolean electricPowered){
        this.type = type;
        this.occupancy = occupancy;
        this.range = range;
        this.price = price;
        this.publicTravel = publicTravel;
        this.electricPowered = electricPowered;
    }

    public double calculateEfficiency(){
        return this.range * this.occupancy / this.price;
    }

    public abstract String setMaxSpeed(double speed);

    public int getOccupancy() {
        return this.occupancy;
    }
}





