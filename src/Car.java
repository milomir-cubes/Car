
public class Car {

    String model;
    int maxSpeed;
    int minSpeed;
    double weight;

    String license = "abc123";
    int maxFuel;
    int currentFuel;
    int consumption; //consumption per distance unit (km)
    int mileage = 0;
    
    int numberOfPassengers;
    int currentNumberOfPassengers;
    
    public Car() {
        this.model = "default";
        this.maxFuel = 100;
        this.consumption = 5;
        this.mileage = 1000;
        this.numberOfPassengers = 5;
        this.currentNumberOfPassengers = 1;
    }

    public Car(String customModel, int customMaxFuel, int customConsumption) {
        this.model = customModel;
        this.maxFuel = customMaxFuel;
        this.consumption = customConsumption;
    }
    
    public Car(String customModel, int customMaxFuel, int customConsumption, int maxPass, int currPass) {
        this.model = customModel;
        this.maxFuel = customMaxFuel;
        this.consumption = customConsumption;
        this.currentNumberOfPassengers = currPass;
        this.numberOfPassengers = maxPass;
    }
    
//    public Car(int maxPass, int currPass) {
//        this.currentNumberOfPassengers = currPass;
//        this.numberOfPassengers = maxPass;
//    }

    public  void printAttributes() {
        System.out.println("Model: " + this.model);
        System.out.println("Tezina: " + this.weight);
        System.out.println("Kapacitet rezervoara: " + this.maxFuel);
        System.out.println("Potrosnja: " + this.consumption);
        System.out.println("Registracija : " + this.license);
        System.out.println("Trenutno stanje rezervoara : " + this.currentFuel);
        System.out.println("Ukupna pređena distanca: " + this.mileage);
        System.out.println("Trenutni broj putnika je " + this.currentNumberOfPassengers + " od maksimalnih " + this.numberOfPassengers);
        System.out.println();
    }

    public void changeLicense(String customLicense) {
        this.license = customLicense;
    }

    public void changeWeight(double newWeight) {
        this.weight = newWeight;
    }

    public double maxDistance() {
        double dist = this.maxFuel / this.consumption;
        return dist;
        //return this.mreturn 12;
    }

    public void fuelUp() {
        this.currentFuel = this.maxFuel;
    }

    public void travel(int distance) {

        //ako ima dovoljno goriva za put onda putaj (mileage, smanji trenutno gorivo)
        //ako nema dovoljno goriva onda ispiši poruku da nema dovoljno goriva.
        if (this.currentFuel >= distance * this.consumption) {
            this.mileage = this.mileage + distance;
            this.currentFuel = this.currentFuel - distance * this.consumption;
            System.out.println("Uspesno smo putovali: " + distance);
        } else {
            System.out.println("Nema dovoljno goriva za taj put.");
        }

    }
    
 
    
    public void getIn(){
        
        // Da li ima mesta?
        // ako ima
        //      dodaj putnika i ispisi poruku
        // ako nema
        //      samo ispisi poruku da nema mesta
        
        if (this.currentNumberOfPassengers < this.numberOfPassengers) {
            this.currentNumberOfPassengers = this.currentNumberOfPassengers + 1;
            //this.currentNumberOfPassengers++;
            System.out.println("Someone got in. Current number: " + this.currentNumberOfPassengers);
        } else {
            System.out.println("The car is full, there is no space for another passenger.");
        }
        
    }
    
    public void getOut(){
        //Da li ima vise od 1 putnika (da li ima bar jedan putnik)
        // ako ima
        //      smanji broj
        // ako nema
        //      reci da to nije moguce
        
        if (this.currentNumberOfPassengers > 0) {
            this.currentNumberOfPassengers = this.currentNumberOfPassengers - 1;
            //this.currentNumberOfPassengers--;
            System.out.println("Someone got out. Current number: " + this.currentNumberOfPassengers);
        } else {
            System.out.println("There are no more passengers.");
        }
        
    }
    
    

}
