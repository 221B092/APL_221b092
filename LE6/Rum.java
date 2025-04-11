class Rum extends Decorator {
    
    Rum(Offering offering) {
        this.offering=offering;
    }
    
    int getPrice() {
        return offering.getPrice()+100;
    }
    
    String getName() {
        return offering.getName()+" with Rum";
    }
}