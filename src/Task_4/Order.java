package Task_4;
import Task_2.*;

public interface Order {
    boolean add(Item item);
    boolean remove(String itemName);
    int removeAll(String itemName);
    Item[] getItems();
    double costTotal();
    String[] itemNames();
    Item[] sortedItemsByCostDesc();
    int itemQuantity();
    int itemQuantity(String itemName);
}