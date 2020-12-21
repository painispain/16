package Task_2;

public class TablesOrderManager {
    Order[] orders;
    private int size;
    private int current;
    public TablesOrderManager(int size){
        this.orders = new Order[size];
        this.size = size;
        this.current = 0;
    }
    Order[] getOrder(){
        return this.orders;
    };
    double OrderCostSummary(){
        double sum = 0;
        for (int i = 0; i < this.current; i++)
            sum += orders[i].costTotal();
        return sum;
    };
}