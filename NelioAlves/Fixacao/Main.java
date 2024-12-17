import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import java.util.Date;

public class Main 
{
    public static void main(String[] args) throws ParseException 
    {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data:");
        
        System.out.print("Name: ");
        String clientName = sc.nextLine();

        System.out.print("Email: ");
        String clientEmail = sc.nextLine();

        System.out.print("Birth date (DD/MM/YYYY): ");
        Date clietBirthDate = sdf.parse(sc.next());
        sc.nextLine();

        Client client = new Client(clientName, clientEmail, clietBirthDate);

        System.out.println("--------------------------------");

        System.out.println("Enter order data:");
        
        System.out.print("Status: ");
        String status = sc.nextLine();

        System.out.println("--------------------------------");

        System.out.print("How many items will you order? ");
        int amountOfItens = sc.nextInt();
        sc.nextLine();
        
        
        Order order = new Order(new Date(), OrderStatus.valueOf(status), client);

        for (int i = 1; i <= amountOfItens; i++) 
        {
            System.out.println("Enter #" + i + " item data:");
            
            System.out.print("Product name: ");
            String productName = sc.nextLine();

            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();

            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();

            Product p = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(productQuantity, p);

            order.addItem(orderItem);
            System.out.println();

            sc.nextLine();
        }

        System.out.println("ORDER SUMMARY:");
        System.out.println(order);

        sc.close();
    }
}