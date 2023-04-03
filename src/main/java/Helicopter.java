public class Helicopter extends Vehicle{
    private int numberOfRotors;

    public Helicopter(int occupancy, double range, double price, Boolean publicTravel, Boolean electricPowered,
                      int numberOfRotors){
        super(VehicleType.AIR, occupancy, range, price, publicTravel, electricPowered);
        this.numberOfRotors = numberOfRotors;
    }

    public String autoRotate(){
        return "Safely autorotating to the ground";
    }
}
