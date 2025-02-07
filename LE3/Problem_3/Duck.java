abstract class Duck implements Swimable
{
    public void swim()
    {
       System.out.println("This duck can swim.") ;
    }
    
    abstract void display();
}