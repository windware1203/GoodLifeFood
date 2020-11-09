package ut;
import java.text.NumberFormat;

public class GoodLifeFood{

    private Product product;
    private int quantity;

    public GoodLifeFood() {
        this.product = null;
        this.quantity = 0;
    }

    public GoodLifeFood(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTotal() {
        int total = product.getPrice() * quantity;
        return total;
    }

    public String getTotalFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(this.getTotal());
    }
}