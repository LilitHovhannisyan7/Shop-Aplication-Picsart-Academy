public class PhysicalProduct extends Product
{
    private int weight;

    public PhysicalProduct(String name, float price, int weight)
    {
        super(name, price);
        this.weight = weight;
    }

    public int getShippingWeight()
    {
        return this.weight;
    }


}
