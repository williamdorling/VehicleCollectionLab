public class Bus extends Vehicle{

    private int numberOfWheels;
    private Boolean hasSeatbelts;

    public Bus(int occupancy, double range, double price, Boolean publicTravel, Boolean electricPowered,
               int numberOfWheels, Boolean hasSeatbelts) {
        super(VehicleType.LAND,occupancy, range, price, publicTravel, electricPowered);
        this.numberOfWheels = numberOfWheels;
        this.hasSeatbelts = hasSeatbelts;
    }

    public String setAirconTemperature(int temperature){
        return String.format("Temperature set to %s degrees.", temperature);
    }

    @Override
    public String setMaxSpeed(double speed) {
        return String.format("Max speed set to %s kph", speed);
    }

}
