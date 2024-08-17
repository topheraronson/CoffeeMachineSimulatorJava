package machine;

import java.util.Scanner;

public class CoffeeMachine {


    public static void main(String[] args) {
        CoffeeShop coffeeShop = new CoffeeShop(550, 400, 540, 120, 9);

        mainMenu(coffeeShop);
    }

    private static void mainMenu(CoffeeShop coffeeShop) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println();
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            switch (scanner.nextLine()) {
                case "buy":
                    buyMenu(coffeeShop);
                    break;
                case "fill":
                    coffeeShop.fill();
                    break;
                case "take":
                    coffeeShop.emptyRegister();
                    break;
                case "remaining":
                    coffeeShop.status();
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("Unknown command");
            }
        }
    }

    private static void buyMenu(CoffeeShop coffeeShop) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        switch (scanner.nextLine()) {
            case "1":
                coffeeShop.buyEpresso();
                break;
            case "2":
                coffeeShop.buyLatte();
                break;
            case "3":
                coffeeShop.buyCappuccino();
                break;
            case "back":
                return;
            default:
                System.out.println("Unknown product");
        }
    }
}
