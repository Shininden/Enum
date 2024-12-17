import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Order 
{    
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    
    private Date moment;
    private OrderStatus status;
    private Client client;
    private ArrayList<OrderItem> orderItens = new ArrayList<>();
    
    public Order() {}

    public Order(Date moment, OrderStatus status, Client client) 
    {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public void addItem(OrderItem item){
        orderItens.add(item);
    }
    public void removeItem(OrderItem item){
        orderItens.remove(item);
    }

    public Double total()
    {
        double sum = 0;

        for (OrderItem item : orderItens) {
            sum += item.subTotal();
        }
        
        return sum;
    }

    public Date getMoment() {
        return moment;
    }
    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public ArrayList<OrderItem> getOrderItens() {
        return orderItens;
    }

    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() 
    {
        StringBuilder sb = new StringBuilder();

        sb.append("Order moment: ");
        sb.append(sdf.format(getMoment()) + "\n");

        sb.append("Order status: ");
        sb.append(status + "\n");

        sb.append("Client: ");
        sb.append(client + "\n");


        sb.append("Order items: \n");
        for (OrderItem orderItem : orderItens) {
            sb.append(orderItem + "\n");
        }

        sb.append("Total price: ");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}