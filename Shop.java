import java.util.ArrayList;

public class Shop
{
    private ArrayList<Product> products;
    private WareHouse wareHouse;

    public Shop(ArrayList<Product> products, WareHouse wareHouse)
    {
        this.products = products;
        this.wareHouse = wareHouse;
    }

    public void addProduct(Product product)
    {
        this.products.add(product);
    }


    public void removeProduct(Product product)
    {
        this.products.remove(product);
    }

    public Product getProduct(int index)
    {
        return this.products.get(index);
    }
}
