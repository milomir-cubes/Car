
import loops.Loops;
import person.Person;
import person.Student;


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
        
//        Car noviAuto = new Car("Novi Auto", 100, 3, 4, 1);
//        noviAuto.printAttributes();
//        
//        noviAuto.getIn(3);
//        noviAuto.getIn(4);
//        noviAuto.printAttributes();
//
//        noviAuto.getOut(2);
//        noviAuto.getOut(5);
//        noviAuto.printAttributes();
        
        
//        int x = 0;
//        while(x > 0) {
//            System.out.println(x);
//            x = x - 1; //x--;
//        }
        
        
//        do {
//            System.out.println(x);
//            x--;
//        } while(x > 0);
        
        
//        for(int i = 7; i <= 15; i++) {
//            System.out.println(i);
//        }


//        Loops loop1 = new Loops();
//        loop1.testForLoop();
            
//        Loops.testWhileLoop();
//        Loops.testForLoop();
//        Loops.testDoubleForLoop();
//        Loops.printMultiplicationTable();
//        Loops.printCoordinates();


        Person osoba = new Person();
        osoba.showData();
        
        osoba.setName("Milomir");
        osoba.setSurname("Dragović");
        
        osoba.showData();
        
        Student studentPetar = new Student("Petar", "Petrović", "324324");
        
        studentPetar.showData();
        
        Student studentMarko = new Student("Marko", "Markovic", "636434", "OAS-123", 2);
        
        studentMarko.showData();

    }
    
}
