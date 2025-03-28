abstract class Beverage
{
    private void pour(int quantity)
    {
        System.out.println("Pour "+quantity+" ml of Beverage.");
    }
    
    protected abstract void addCondiment();
    
    protected void stir()
    {}
    
    private void serve()
    {
        System.out.println("Serve to Waiter.");
    }
    
    public void templateMethod(int quantity)
    {
        pour(quantity);
        addCondiment();
        stir();
        serve();
    }
}