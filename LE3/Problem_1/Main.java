class Main {
    public static void main(String[] args) 
    {
        Pandav arjun=new Pandav("Arjun");
        Pandav bheem=new Pandav("Bheem");

        Kaurav duryodhan=new Kaurav("Duryodhan");
        Vikarn vikarn=new Vikarn();

        arjun.fight();
        arjun.obey();
        arjun.showKindness();

        bheem.fight();
        bheem.obey();
        bheem.showKindness();

        duryodhan.fight();
        duryodhan.obey();
        duryodhan.showKindness();

        vikarn.fight();
        vikarn.obey();
        vikarn.showKindness();
    }
}