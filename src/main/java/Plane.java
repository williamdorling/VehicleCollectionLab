public class Plane extends Vehicle{
    private boolean firstClassCabin;

    public Plane(int occupancy, double range, double price, Boolean publicTravel, Boolean electricPowered,
                 Boolean firstClassCabin){
        super(VehicleType.AIR, occupancy, range, price, publicTravel, electricPowered);
        this.firstClassCabin = firstClassCabin;
    }

    public String setMaxSpeed(double speed){
        return String.format("Max speed set to mach %s", speed);
    }
}
