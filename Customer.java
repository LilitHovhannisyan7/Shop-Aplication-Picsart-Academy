public class Customer
{
    private ShoppingCart cart;

    public Customer(ShoppingCart cart)
    {
        this.cart = cart;
    }

    public void addProductToCart(Product product)
    {
        cart.addProduct(product);
    }

    public void removeProductToCart(Product product)
    {
        cart.removeProduct(product);
    }

    public ShoppingCart purchase()
    {
        for(int i = 0; i < this.cart.getProducts().size(); ++i)
        {
            this.cart.removeProduct(this.cart.getProducts().get(i));
        }
        return this.cart;
    }
}
