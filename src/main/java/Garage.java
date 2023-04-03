import java.util.ArrayList;

public class Garage {

    private ArrayList<Vehicle> stock;


    public Garage(){
        this.stock = new ArrayList<>();
    }

    public ArrayList<Vehicle> getStock() {
        return this.stock;
    }

    public void addToStock(Vehicle newVehicle){
        this.stock.add(newVehicle);
    }

    public int calculateCapacity(){
        int capacity = 0;
        for (Vehicle vehicle : stock) {
            capacity += vehicle.getOccupancy();
        }
        return capacity;
    }

}
