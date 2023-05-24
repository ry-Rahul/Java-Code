class Employee {

    int id;
    int salary;
    String name;

    public void printDetails() {
        System.out.println("Id is -> " + id);
        System.out.println("Name is -> " + name);
        System.out.println("sallary ->" + salary);

    }

    public int getsallary() {
        return salary;
    }
}


public class customClass {


    public static void main(String[] args) {
        System.out.println("______________This is our custom class______________ ");

        //creating object of class Employee
        Employee rahul = new Employee();
        Employee sakshi = new Employee();


        

        //setting Attribute for rahul
        rahul.id = 45;
        rahul.name = "Rahulyadav";
        rahul.salary = 2500000;

        //setting Attribute for sakshi
        sakshi.id = 46;
        sakshi.name = "Sakshi jaiswal";
        sakshi.salary = 300000;

        // System.out.println("Sallary of rahul is -> " + rahul.getsallary());
        // System.out.println("Sallary of sakshi is -> " + sakshi.getsallary());

        //printing details by methods
        sakshi.printDetails();
    }
    
}
