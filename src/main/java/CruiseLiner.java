public class CruiseLiner extends Vehicle{

    private int numberOfLifeBoats;
    public CruiseLiner(int occupancy, double range, double price, Boolean publicTravel, Boolean electricPowered, int numberOfLifeBoats) {
        super(VehicleType.WATER, occupancy, range, price, publicTravel, electricPowered);
        this.numberOfLifeBoats = numberOfLifeBoats;
    }

    public String dropAnchor(){
        return "Anchor is now dropped, this boat will no longer move";
    }

}
