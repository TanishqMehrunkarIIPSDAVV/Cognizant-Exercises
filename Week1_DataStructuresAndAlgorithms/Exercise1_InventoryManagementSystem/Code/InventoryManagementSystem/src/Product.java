public class Product
{
    public int productId;
    public String productName;
    public int productQuantity;
    public double productPrice;

    public Product(int id, String name, int quantity, double price)
    {
        this.productId = id;
        this.productName = name;
        this.productQuantity = quantity;
        this.productPrice = price;
    }

    public Product updateProductName(String name)
    {
        this.productName = name;
        return this;
    }

    public Product updateProductQuantity(int quantity)
    {
        this.productQuantity = quantity;
        return this;
    }

    public Product updateProductPrice(double price)
    {
        this.productPrice = price;
        return this;
    }
}