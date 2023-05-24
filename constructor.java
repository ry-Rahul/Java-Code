class Employee{
    private int id;
    private int sallary;
    private String name;

    //default constructor
    public Employee() {
        id = 0;
        sallary = 0;
        name = "No name";
    }

    //parameterized constructor
    public Employee(int id, int sallary, String name) {
        this.id = id;
        this.sallary = sallary;
        this.name = name;
    }

    //parameterized constructor
    public Employee(int id, int sallary) {
        this.id = id;
        this.sallary = sallary;
        this.name = "No name";
    }

    //parameterized constructor
    public Employee(int id, String name) {
        this.id = id;
        this.sallary = 0;
        this.name = name;
    }
    
    public void printDetails() {
        System.out.println("Id is -> " + id);
        System.out.println("Name is -> " + name);
        System.out.println("sallary ->" + sallary);

    }

}
public class constructor {

    public static void main(String[] args) {
        
        Employee e1 = new Employee(12, 20000, "Rahul");
        e1.printDetails();
    }
}
