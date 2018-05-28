
public class Main {

    
    public static void main(String[] args) {
        
//        Car myCar = new Car();
//        myCar.printAttributes();
//        myCar.changeLicense("efg123");
//        myCar.printAttributes();
//        double distance = myCar.maxDistance();
//        System.out.println("Maksimalna distanca je: " + distance);
        
        
        
//        Car audi = new Car("Audi", 50, 2);
//        audi.printAttributes();
//        audi.changeLicense("zcv345");
//        audi.printAttributes();
        
//        System.out.println("Maksimalna distanca je: " + audi.maxDistance());
        
//        audi.fuelUp();
//        audi.printAttributes();
//        audi.travel(20);
//        audi.printAttributes();
//        audi.travel(30);
//        audi.printAttributes();
        
        Car noviAuto = new Car("Novi Auto", 100, 3, 4, 1);
        noviAuto.printAttributes();
        
        noviAuto.getIn();
        noviAuto.getIn();
        noviAuto.getIn();
        noviAuto.getIn();
        noviAuto.getIn();
        noviAuto.printAttributes();

        noviAuto.getOut();
        noviAuto.getOut();
        noviAuto.getOut();
        noviAuto.getOut();
        noviAuto.getOut();
        noviAuto.getOut();
        noviAuto.printAttributes();
        
    }
    
}
