package Task_3;
import Task_2.*;

public class InternetOrder extends Order {
    private int size;
    private node head;
    class node {
        Item value;
        node next;
        node prev;
    }
    public InternetOrder(int size) {
        super(size);
        this.size = size;
    }

    public boolean add(Item item) {
        if(item == null || itemQuantity() + 1 > size)
            return false;

        if(head == null) {
            head = new node();
            head.value = item;
            head.next = head;
            head.prev = head;
        }
        return true;
    }

    public int itemQuantity() {
        if(head == null)
            return 0;
        node it = head;
        int count = 0;
        do {
            count++;
            it = it.next;
        } while (it != null && it != head);

        return count;
    }


    public Item[] getItems() {
        Item[] items = new Item[this.size];
        if(head == null)
            return items;
        node it = head;
        int count = 0;
        do {
            items[count] = it.value;
            count++;
            it = it.next;
        } while (it != null && it != head);

        return items;
    }

    public double costTotal() {
        if(head == null)
            return 0;
        node it = head;
        int cost = 0;
        do {
            cost += it.value.getPrice();
            it = it.next;
        } while (it != null && it != head);

        return cost;
    }

    public String[] itemNames() {
        String[] names = new String[this.size];
        if(head == null)
            return names;
        node it = head;
        int count = 0;
        do {
            names[count] = it.value.getName();
            count++;
            it = it.next;
        } while (it != null && it != head);

        return names;
    }
}