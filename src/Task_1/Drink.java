package Task_1;
import Task_2.Item;

public class Drink implements Item{
    private final double price;
    private final String name;
    private final String description;

    public Drink(String name, String description) {
        this.name = name;
        this.description = description;
        this.price = 0;
    }

    public Drink(double price, String name, String description) {
        this.price = price;
        this.name = name;
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}