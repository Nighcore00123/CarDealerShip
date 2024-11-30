package Dealershio;

import java.util.Scanner;

public class Main {
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        Dealership CarManager = new Dealership();
        boolean quit = false;
        
        while (!quit) {
            System.out.println("WELCOME.. These are your options:");
            System.out.println("1: View Cars");
            System.out.println("2: Add Car to collection");
            System.out.println("3: quit");
            int choice = userInput.nextInt();
            
            switch (choice) {
                case 1:
                    CarManager.viewCars();
                    break;
                case 2:
                    CarManager.add_Car();
                    break;
                case 3:
                    quit = true;
            }
        }
    }
}
