package Dealershio;

import java.util.ArrayList;
import java.util.Scanner;

public class dealership {
    private ArrayList<Car> amount_Of_Cars = new ArrayList<>();
    static  Scanner user_Input = new Scanner(System.in);


    public void populate_Cars(){
        for(int i  = 0; i < 5; i++){
            
            amount_Of_Cars.add(new Car(null, 0, i));
        }
    }

    public dealership() {
        populate_Cars();
    }

    public void add_Car () {
        int carNumber = 0;
        System.out.println("Please enter the Model");
        String model_Name = user_Input.next();
        System.out.println("Please enter the Manufacturing Date");
        int manuFacturingDate = user_Input.nextInt();
        user_Input.nextLine();

        for(int i = 0; i < amount_Of_Cars.size(); i++){
            Car number = amount_Of_Cars.get(i);
            if(number.freeSlot()) {
                carNumber = i;
                number.setCarNumber(carNumber);
                number.setManufacturingDate(manuFacturingDate);
                number.setModel(model_Name);
                return;

            }

        }
    }

    public void viewCars() {
        if(!amount_Of_Cars.isEmpty()) {
            for (Car car : amount_Of_Cars) {
                System.out.println("Car number: " + car.getCarNumber() + ", Car Model: " + car.getModel() + ", Car Manufacturing Date: " + car.getManufacturingDate());
            }
        }else {
            System.out.println("No cars in storage :( ");

        }
    }


    public static void main(String[] args) {

        dealership Manager = new dealership();
        boolean quit = false;
        
        while (quit != true) {
            System.out.println("WELCOME.. These are your options:");
            System.out.println("1: View Cars");
            System.out.println("2: Add Car to collection");
            System.out.println("3: quit");
            int choice = user_Input.nextInt();
            
            switch (choice) {
                case 1:
                    Manager.viewCars();
                    break;
                case 2:
                    Manager.add_Car();
                    break; //i dont understand why its "Manager." to call Public void add_Car
                case 3:
                    quit = true;
    
            }
        }
    }
}