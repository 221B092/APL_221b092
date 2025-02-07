class Main
{
    public static void main(String args[])
    {
        RubberDuck rd=new RubberDuck();
        rd.display();
        rd.swim();
        rd.squeak();
        System.out.println();
        
        WoodenDuck wd=new WoodenDuck();
        wd.display();
        wd.swim();
        wd.mute();
        System.out.println();
        
        RedHeadDuck rhd=new RedHeadDuck();
        rhd.display();
        rhd.swim();
        rhd.fly();
        rhd.quack();
        System.out.println();
        
        LakeDuck ld=new LakeDuck();
        ld.display();
        ld.swim();
        ld.fly();
        ld.quack(); 
    }
}












