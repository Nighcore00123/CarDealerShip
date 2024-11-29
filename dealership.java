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
        System.out.println("Please enter the Model");
        String Model_Name = user_Input.nextLine();
        System.out.println("Please enter the Manufacturing Date");
        int manuFacturingDate = user_Input.nextInt();
    }
    public static void main(String[] args) {
        //type      Var name    = expression
        dealership Manager = new dealership();
        boolean quit = false;
        int choice = user_Input.nextInt();

        while (!quit) {
            System.out.println("WELCOME.. These are your options:");
            System.out.println("1: View Cars");
            System.out.println("2: Add Car to collection");
            System.out.println("3: quit");
        }
        switch (choice) {
            case 1:
                
                break;
            case 2:
            Manager.add_Car(); //i dont understand why its "Manager." to call Public void add_Car
            case 3:
            
        }
        

    }
}