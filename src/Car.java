
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

    public Car() {
        this.model = "default";
        this.maxFuel = 100;
        this.consumption = 5;
        this.mileage = 1000;
    }

    public Car(String customModel, int customMaxFuel, int customConsumption) {
        this.model = customModel;
        this.maxFuel = customMaxFuel;
        this.consumption = customConsumption;
    }

    public void printAttributes() {
        System.out.println("Model: " + this.model);
        System.out.println("Kapacitet rezervoara: " + this.maxFuel);
        System.out.println("Potrosnja: " + this.consumption);
        System.out.println("Registracija : " + this.license);
        System.out.println("Trenutno stanje rezervoara : " + this.currentFuel);
        System.out.println("Ukupna pređena distanca: " + this.mileage);
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
        //return this.maxFuel / this.consumption;
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
        } else {
            System.out.println("Nema dovoljno goriva za taj put.");
        }

    }

}
