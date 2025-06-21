import java.util.ArrayList;

public class OrderTest
{
    public static void main(String args[])
    {
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(new Order(1, "ABC", 5000));
        orders.add(new Order(2, "XYZ", 1000));
        orders.add(new Order(3, "PQR", 3000));
        orders.add(new Order(4, "MNO", 6000));
        orders.add(new Order(5, "DEF", 4000));

        System.out.println("Bubble Sort:");
        //Bubble Sort
        for(int i=0;i<orders.size()-1;i++)
        {
            for(int j=0;j<orders.size()-i-1;j++)
            {
                if(orders.get(j).totalPrice > orders.get(j+1).totalPrice)
                {
                    Order o = orders.get(j);
                    orders.set(j,orders.get(j+1));
                    orders.set(j+1,o);
                }
            }
        }

        for(Order o: orders)
        {
            System.out.println("ID: "+o.orderID+", Customer Name: "+o.customerName+", Total Price: "+o.totalPrice);
        }

        orders.clear();
        orders.add(new Order(1, "ABC", 5000));
        orders.add(new Order(2, "XYZ", 1000));
        orders.add(new Order(3, "PQR", 3000));
        orders.add(new Order(4, "MNO", 6000));
        orders.add(new Order(5, "DEF", 4000));

        System.out.println("Quick Sort:");
        //Quick Sort
        quickSort(orders, 0, orders.size() - 1);

        for(Order o: orders)
        {
            System.out.println("ID: "+o.orderID+", Customer Name: "+o.customerName+", Total Price: "+o.totalPrice);
        }
    }

    static int partition(ArrayList<Order> order,int low,int high)
    {
        double pivot = order.get(high).totalPrice;
        int i = low -1;
        for(int j=low;j<high;j++)
        {
            if(order.get(j).totalPrice < pivot)
            {
                i++;
                swap(order,i,j);
            }
        }
        swap(order,i+1,high);
        return i+1;
    }

    static void swap(ArrayList<Order> order,int i,int j)
    {
        Order o = order.get(i);
        order.set(i,order.get(j));
        order.set(j,o);
    }

    static void quickSort(ArrayList<Order> order,int low,int high)
    {
        if(low<high)
        {
            int pi = partition(order,low,high);
            quickSort(order, low, pi - 1);
            quickSort(order, pi + 1, high);
        }
    }
}