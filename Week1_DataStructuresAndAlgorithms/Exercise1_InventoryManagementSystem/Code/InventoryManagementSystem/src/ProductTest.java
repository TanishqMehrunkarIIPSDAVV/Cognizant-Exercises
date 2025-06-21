import java.util.ArrayList;

public class ProductTest
{
    public static void main(String[] args)
    {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop", 5, 50000));
        products.add(new Product(2, "Tablet", 10, 20000));
        products.add(new Product(3, "Phone", 7, 15000));

        System.out.println("Before Updating:");
        for(Product product: products)
        {
            System.out.println("ID: "+product.productId+", Name: "+product.productName+", Quantity: "+product.productQuantity+", Price: "+product.productPrice);
        }

        for(Product p: products)
        {
            if(p.productId == 1)
            {
                p.updateProductName("Wired Mouse")
                .updateProductPrice(1000)
                .updateProductQuantity(6);
                break;
            }
        }
        
        System.out.println("After Updating:");
        for(Product product: products)
        {
            System.out.println("ID: "+product.productId+", Name: "+product.productName+", Quantity: "+product.productQuantity+", Price: "+product.productPrice);
        }

        for(Product p: products)
        {
            if(p.productId == 2)
            {
                products.remove(p);
                break;
            }
        }

        System.out.println("After Deleting:");
        for(Product product: products)
        {
            System.out.println("ID: "+product.productId+", Name: "+product.productName+", Quantity: "+product.productQuantity+", Price: "+product.productPrice);
        }
    }
}