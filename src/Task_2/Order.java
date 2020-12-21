package Task_2;

public class Order {
    private int size;
    private Dish[] dishes;
    private int current;

    public Order(int size){
        this.size=size;
        this.dishes = new Dish[size];
        this.current = 0;
    }

    public boolean add(Dish dish){
        if (this.current < this.size){
            dishes[this.current] = dish;
            this.current += 1;
            return true;
        }
        return false;
    }
    public boolean remove(String itemName){
        boolean flag = false;
        for (int i = 0; i < this.current; i++){
            if (dishes[i].getName() == itemName){
                flag = true;
                this.current -= 1;
            }
            if (flag) {
                Dish temp = dishes[i];
                dishes[i] = dishes[i + 1];
                dishes[i + 1] = temp;
            }
        }
        return true;
    };
    public double costTotal(){
        double total = 0;
        for (int i = 0; i < this.current; i++)
            total += dishes[i].getPrice();
        return total;
    };

    String[] itemNames(){
        String[] names = new String[this.current + 1];
        for (int i = 0; i < this.current; i++)
            names[i] = dishes[i].getName();
        return names;
    };

    Item[] getItems(){
        Item[] items = new Item[this.current + 1];
        for (int i = 0; i < this.current; i++)
            items[i] = dishes[i];
        return items;
    };
    int removeAll(String itemName){
        for (int j = 0; j < this.current; j++){
            boolean flag = false;
            for (int i = 0; i < this.current; i++){
                if (dishes[i].getName() == itemName){
                    flag = true;
                    this.current -= 1;
                }
                if (flag) {
                    Dish temp = dishes[i];
                    dishes[i] = dishes[i + 1];
                    dishes[i + 1] = temp;
                }
            }
        }
        return 0;
    };
}