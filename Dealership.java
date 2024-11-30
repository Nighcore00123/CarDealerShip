package Dealershio;

import java.util.ArrayList;
import java.util.Scanner;

public class Dealership {
    private final ArrayList<Car> amountOfCars = new ArrayList<>();
    static Scanner userInput = new Scanner(System.in);
    
    
    public void populate_Cars(){
        for(int i  = 0; i < 5; i++){
            amountOfCars.add(new Car(null, 0, i));
        }
    }

    public Dealership() {
        populate_Cars();
    }

    public void add_Car () {
        int carNumber;
        System.out.println("Please enter the Model");
        String model_Name = userInput.next();
        System.out.println("Please enter the Manufacturing Date");
        int manufacturingDate = userInput.nextInt();
        userInput.nextLine();

        for(int i = 0; i < amountOfCars.size(); i++){
            Car number = amountOfCars.get(i);
            if(number.freeSlot()) {
                carNumber = i;
                number.setCarNumber(carNumber);
                number.setManufacturingDate(manufacturingDate);
                number.setModel(model_Name);
                return;
            }
        }
    }
    
    public void viewCars() {
        if(!amountOfCars.isEmpty()) {
            for (Car car : amountOfCars) {
                System.out.println("Car number: " + car.getCarNumber() + ", Car Model: " + car.getModel() + ", Car Manufacturing Date: " + car.getManufacturingDate());
            }
        }
        else {
            System.out.println("No cars in storage :( ");
            
        }
    }
}
