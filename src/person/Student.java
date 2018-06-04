
package person;


public class Student extends Person {
    
    private String indexNumber;
    private int year;
    
    
    
    public Student(String name, String surname, String jmbg) {
        super(name, surname, jmbg);
        
    }
    
    public Student(String name, String surname, String jmbg, String indexNumber, int year) {
        super(name, surname, jmbg);
        this.indexNumber = indexNumber;
        this.year = year;
    }
    
    @Override
    public void showData() {
        
        System.out.println("Index number: " + getIndexNumber());
        System.out.println("Study year: " + getYear());
        super.showData();
    }
    
    
}
