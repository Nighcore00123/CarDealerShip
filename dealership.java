package Dealershio;

import java.util.ArrayList;

public class dealership {
    private ArrayList<Car> amount_Of_Cars = new ArrayList<>();
    public void populate_Cars(){
        for(int i  = 0; i < 5; i++){
            amount_Of_Cars.add(new Car());
        }

    }
    public carManager() {
        populate_Cars();
    }
    public static  void main(String[] args) {
        dealership Manager = new carManager();

    }
}