public class Juet
{
    String name;
    int age;
    
    String getName()
    {
        return this.name;
    }
    
    int getAge()
    {
        return this.age;
    }
    
    void setName(String name)
    {
        this.name=name;
    }
    
    void setAge(int age)
    {
        this.age=age;
    }
    
    public static void main(String args[])
    {
        Juet ob=new Juet();
        ob.setName("Arunendra Singh");
        ob.setAge(21);
        
        System.out.println("Name : "+ob.getName());
        System.out.println("Age : "+ob.getAge());
        
        ob.setName("xyz");
        ob.setAge(23);
        
        System.out.println("Name : "+ob.getName());
        System.out.println("Age : "+ob.getAge());
    }
}