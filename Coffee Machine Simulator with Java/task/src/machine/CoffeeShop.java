package machine;

import java.util.Arrays;
import java.util.Scanner;

public class CoffeeShop {
    private int income;
    private int waterInMachine;
    private int milkInMachine;
    private int coffeeInMachine;
    private int numberOfCups;

    private Coffee espresso = new Coffee("espresso", 250, 0, 16, 4);
    private Coffee latte = new Coffee("latte", 350, 75, 20, 7);
    private Coffee cappuccino = new Coffee("cappuccino", 200, 100, 12, 6);

    public CoffeeShop(int income, int waterInMachine, int milkInMachine, int coffeeInMachine, int numberOfCups) {
        this.income = income;
        this.waterInMachine = waterInMachine;
        this.milkInMachine = milkInMachine;
        this.coffeeInMachine = coffeeInMachine;
        this.numberOfCups = numberOfCups;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getWaterInMachine() {
        return waterInMachine;
    }

    public void setWaterInMachine(int waterInMachine) {
        this.waterInMachine = waterInMachine;
    }

    public int getMilkInMachine() {
        return milkInMachine;
    }

    public void setMilkInMachine(int milkInMachine) {
        this.milkInMachine = milkInMachine;
    }

    public int getCoffeeInMachine() {
        return coffeeInMachine;
    }

    public void setCoffeeInMachine(int coffeeInMachine) {
        this.coffeeInMachine = coffeeInMachine;
    }

    public int getNumberOfCups() {
        return numberOfCups;
    }

    public void setNumberOfCups(int numberOfCups) {
        this.numberOfCups = numberOfCups;
    }

    public void status() {

        System.out.println("The coffee machine has:");
        System.out.println(waterInMachine + " ml of water");
        System.out.println(milkInMachine + " ml of milk");
        System.out.println(coffeeInMachine + " g of coffee beans");
        System.out.println(numberOfCups + " disposable cups");
        System.out.println("$" + income + " of money");
    }

    public void buyEpresso() {
        int water = espresso.getAmountOfWater();
        int milk = espresso.getAmountOfMilk();
        int coffee = espresso.getAmountOfCoffe();

        if (water > waterInMachine) {
            System.out.println("Sorry, not enough water!");
            return;
        } else if (milk > milkInMachine) {
            System.out.println("Sorry, not enough milk!");
            return;
        } else if (coffee > coffeeInMachine) {
            System.out.println("Sorry, not enough coffee beans!");
            return;
        } else {
            System.out.println("I have enough resources, making you a coffee!");
        }

        waterInMachine -= water;
        milkInMachine -= milk;
        coffeeInMachine -= coffee;

        income += espresso.getCost();
        numberOfCups -= 1;
    }

    public void buyLatte() {
        int water = latte.getAmountOfWater();
        int milk = latte.getAmountOfMilk();
        int coffee = latte.getAmountOfCoffe();

        if (water > waterInMachine) {
            System.out.println("Sorry, not enough water!");
            return;
        } else if (milk > milkInMachine) {
            System.out.println("Sorry, not enough milk!");
            return;
        } else if (coffee > coffeeInMachine) {
            System.out.println("Sorry, not enough coffee beans!");
            return;
        } else {
            System.out.println("I have enough resources, making you a coffee!");
        }

        waterInMachine -= water;
        milkInMachine -= milk;
        coffeeInMachine -= coffee;

        income += latte.getCost();
        numberOfCups -= 1;
    }

    public void buyCappuccino() {
        int water = cappuccino.getAmountOfWater();
        int milk = cappuccino.getAmountOfMilk();
        int coffee = cappuccino.getAmountOfCoffe();

        if (water > waterInMachine) {
            System.out.println("Sorry, not enough water!");
            return;
        } else if (milk > milkInMachine) {
            System.out.println("Sorry, not enough milk!");
            return;
        } else if (coffee > coffeeInMachine) {
            System.out.println("Sorry, not enough coffee beans!");
            return;
        } else {
            System.out.println("I have enough resources, making you a coffee!");
        }

        waterInMachine -= water;
        milkInMachine -= milk;
        coffeeInMachine -= coffee;

        income += cappuccino.getCost();
        numberOfCups -= 1;
    }

    public void emptyRegister() {
        System.out.println("I gave you $" + income);
        income = 0;
    }

    public void fill() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How much water:");
        waterInMachine += scanner.nextInt();

        System.out.println("How much milk:");
        milkInMachine += scanner.nextInt();

        System.out.println("How much coffee:");
        coffeeInMachine += scanner.nextInt();

        System.out.println("How many cups:");
        numberOfCups += scanner.nextInt();
    }
}
