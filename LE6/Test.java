 class Test {
    public static void main(String args[]) {
        Offering offering=new Coffee();
        offering=new Rum(offering);
        offering=new Gin(offering);
        System.out.println(offering.getName()+" : ₹ "+offering.getPrice());
        
        Offering offering2=new Tea();
        offering2=new Rum(offering2);
        offering2=new Gin(offering2);
        System.out.println(offering2.getName()+" : ₹ "+offering2.getPrice());
        
    }
}