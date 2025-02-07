class LakeDuck extends Duck implements Flyable, Quackable
{
    void display()
    {
        System.out.println("This is a Lake Duck");
    }
    
    public void fly()
    {
        System.out.println("This duck can fly.");
    }
    
    public void quack()
    {
        System.out.println("Quack! Quack");
    }
}