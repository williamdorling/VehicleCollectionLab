import interfaces.IDrive;

import java.util.ArrayList;

public class Garage {

    private ArrayList<IDrive> stock;


    public Garage(){
        this.stock = new ArrayList<>();
    }

    public ArrayList<IDrive> getStock() {
        return this.stock;
    }

    public void addToStock(IDrive newVehicle){
        this.stock.add(newVehicle);
    }

    public int calculateTotalPrice(){
        int price = 0;
        for (IDrive vehicle : stock) {
            price += vehicle.getPrice();
        }
        return price;
    }

}
