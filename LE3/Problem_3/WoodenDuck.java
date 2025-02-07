class WoodenDuck extends Duck implements Muteable
{
    void display()
    {
        System.out.println("This is a Wooden Duck.");
    }
    
    public void mute()
    {
        System.out.println("This duck cannot Quack.");
    }
}