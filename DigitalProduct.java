public class DigitalProduct extends Product
{
    private int propertySize;

    public DigitalProduct(String name, float price, int propertySize)
    {
        super(name, price);
        this.propertySize = propertySize;
    }

    public int getDownloadSize()
    {
        return this.propertySize;
    }
}
