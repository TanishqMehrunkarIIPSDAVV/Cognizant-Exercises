import java.util.ArrayList;

public class ProductTest
{
    public static void main(String[] args)
    {
        ArrayList<Product> products = new ArrayList<>();
        Product product = new Product(3, "Laptop", "Electronics");
        products.add(product);
        product = new Product(1, "Smartphone", "Electronics");
        products.add(product);
        product = new Product(2, "Table", "Furniture");
        products.add(product);

        Product found = linearSearch(2, products);
        if(found != null)
        {
            System.out.println("Product found: " + found.productName);
        }
        else
        {
            System.out.println("Product not found.");
        }

        found = binarySearch(3, products);
        if(found != null)
        {
            System.out.println("Product found: " + found.productName);
        }
        else
        {
            System.out.println("Product not found.");
        }
    }

    // Linear search method to find a product by productId
    public static Product linearSearch(int productId,ArrayList<Product> products)
    {
        // Linear search for a product by productId
        for(Product product : products)
        {
            if(product.productId == productId)
            {
                return product;
            }
        }
        return null;
    }

    // Binary search method to find a product by productId
    public static Product binarySearch(int productId, ArrayList<Product> products)
    {
        products.sort((p1, p2) -> Integer.compare(p1.productId, p2.productId));
        
        int left = 0;
        int right = products.size() - 1;

        while (left <= right)
        {
            int mid = left + (right - left) / 2;
            Product midProduct = products.get(mid);

            if (midProduct.productId == productId)
            {
                return midProduct;
            }
            else if (midProduct.productId < productId)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return null;
    }
}
