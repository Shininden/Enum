public class OrderItem 
{
    private Integer quantity;
    private Product product;

    public OrderItem() {}

    public OrderItem(Integer quantity, Product product) 
    {
        this.quantity = quantity;
        this.product = product;
    }

    public Double subTotal(){
        return product.getPrice() * quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() 
    {
        StringBuilder sb = new StringBuilder();

        sb.append(product.getName() + ", ");
        sb.append("$" + String.format("%.2f", product.getPrice() )  + ", ");
        sb.append("Quantity: " + getQuantity() + ", ");
        sb.append( "Subtotal: " + "$" + String.format("%.2f", subTotal()) );

        return sb.toString();
    }
}