import java.util.HashMap;
import java.util.*;

public class WareHouse
{
    private HashMap<Product, Integer> products;

    public WareHouse(HashMap<Product, Integer> products)
    {
        this.products = products;
    }

    public void addProduct(Product product, int quantity)
    {
        this.products.put(product, quantity);
    }

    public void removeProduct(Product product, int quantity)
    {
        this.products.remove(product, quantity);
    }

    public Integer getProductQuantity(Product product)
    {
        return this.products.get(product);
    }
}
