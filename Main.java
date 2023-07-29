import java.util.ArrayList;
import java.util.HashMap;

public class Main
{
    public static void main(String[] args)
    {
        Product product1 = new PhysicalProduct("Phone", 500.0f, 300);
        Product product2 = new DigitalProduct("Software", 50.0f, 1024);

        ArrayList<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);

        WareHouse wareHouse = new WareHouse(new HashMap<>());
        wareHouse.addProduct(product1, 5);
        wareHouse.addProduct(product2, 10);

        Shop shop = new Shop(products, wareHouse);

        ShoppingCart cart = new ShoppingCart(new ArrayList<>());
        Customer customer = new Customer(cart);


        customer.addProductToCart(product1);
        customer.addProductToCart(product2);
        customer.addProductToCart(product1);


        System.out.println("Price in cart: $" + customer.purchase().getTotalPrice());


        System.out.println("Warehouse quantity of product1: " + wareHouse.getProductQuantity(product1));
        System.out.println("Warehouse quantity of product1: " + wareHouse.getProductQuantity(product2));

    }
}