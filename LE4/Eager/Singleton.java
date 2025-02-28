class Singleton{
    static int count=0;
    private Singleton(){count++;}
    private static Singleton uniqueinstance = new Singleton();
    public static Singleton getinstance(){
        System.out.println(count);
        return uniqueinstance;
    }
}