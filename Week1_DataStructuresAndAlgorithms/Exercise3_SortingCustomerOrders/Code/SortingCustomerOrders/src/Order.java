public class Order
{
    public int orderID;
    public String customerName;
    public double totalPrice;

    public Order(int id, String name, double price)
    {
        this.orderID = id;
        this.customerName = name;
        this.totalPrice = price;
    }
}