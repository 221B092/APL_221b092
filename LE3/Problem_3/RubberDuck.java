class RubberDuck extends Duck implements Squeakable
{
    void display()
    {
        System.out.println("This is a Rubber Duck.");
    }
    
    public void squeak()
    {
        System.out.println("Squeak! Squeak!");
    }
}