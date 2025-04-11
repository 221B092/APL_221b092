class Gin extends Decorator {
    Gin(Offering offering) {
        this.offering=offering;
    }
    
    int getPrice() {
        return offering.getPrice()+150;
    }
    
    String getName() {
        return offering.getName()+" with Gin";
    }
}