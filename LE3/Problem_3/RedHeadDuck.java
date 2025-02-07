class RedHeadDuck extends Duck implements Flyable, Quackable
{
    void display()
    {
        System.out.println("This is a RedHead Duck.");
    }
    
    public void fly()
    {
        System.out.println("This duck can Fly.");
    }
    
    public void quack()
    {
        System.out.println("Quack! Quack!");
    }
}