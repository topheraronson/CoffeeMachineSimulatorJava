package machine;

public class Coffee {
    private String type;
    private int amountOfWater;
    private int amountOfMilk;
    private int amountOfCoffe;
    private int cost;

    public Coffee(String type, int amountOfWater, int amountOfMilk, int amountOfCoffe, int cost) {
        this.type = type;
        this.amountOfWater = amountOfWater;
        this.amountOfMilk = amountOfMilk;
        this.amountOfCoffe = amountOfCoffe;
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public int getAmountOfWater() {
        return amountOfWater;
    }

    public int getAmountOfMilk() {
        return amountOfMilk;
    }

    public int getAmountOfCoffe() {
        return amountOfCoffe;
    }

    public int getCost() {
        return cost;
    }
}
