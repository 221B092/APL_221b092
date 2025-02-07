class Pandav extends Bharatvanshi 
{
    private String name;

    public Pandav(String name) 
    {
        this.name=name;
    }

    public void obey() 
    {
        System.out.println(name + " is obedient.");
    }

    public void showKindness() 
    {
        System.out.println(name + " is kind.");
    }
}