import java.util.ArrayList;

public class ShoppingCart
{
    private ArrayList<Product> products;

    public ShoppingCart(ArrayList<Product> products)
    {
        this.products = products;
    }

    public void addProduct(Product product)
    {
        products.add(product);
    }

    public void removeProduct(Product product)
    {
        products.remove(product);
    }

    public float getTotalPrice()
    {
        float price = 0;
        for(int i = 0; i < this.products.size(); ++i)
        {
            price = price + this.products.get(i).getPrice();
        }
        return price;
    }


    public ArrayList<Product> getProducts()
    {
        return this.products;
    }
}
