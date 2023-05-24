class phone {
    int manufac;
    int cost;
    String name;

    // default constructor
    public phone() {
        System.out.println("I am default constructor of base class");
        manufac = 0;
        cost = 0;
        name = "No name given";
    }

    // parametrized constructor
    public phone(int manufac, int cost, String name) {
        System.out.println("I am parametrized constructor of base class");
        this.manufac = manufac;
        this.cost = cost;
        this.name = name;
    }

    public void printDetails() {
        System.out.println("Manufacturer is -> " + manufac);
        System.out.println("Name is -> " + name);
        System.out.println("Cost is -> " + cost);
    }
}


// derived class
class smartphone extends phone {
    int ram;
    int rom;
    String os;

    // default constructor
    public smartphone() {
        System.out.println("I am default constructor of derived class");
        ram = 0;
        rom = 0;
        os = "No os given";
    }

    // parametrized constructor
    public smartphone(int manufac, int cost, String name, int ram, int rom, String os) {
        //super (0) call the default constructor of base class
        //super (0,0,"") call the parametrized constructor of base class

        super(manufac, cost, name);
        // super();

        System.out.println("I am parametrized constructor of derived class");
        this.ram = ram;
        this.rom = rom;
        this.os = os;
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("Ram is -> " + ram);
        System.out.println("Rom is -> " + rom);
        System.out.println("Os is -> " + os);
    }

}

class childDerived extends smartphone {
    int battery;
    int camera;

    public childDerived() {
        System.out.println("I am default constructor of childDerived class");
        battery = 0;
        camera = 0;
    }

    public childDerived(int manufac, int cost, String name, int ram, int rom, String os, int battery, int camera) {
        super(manufac, cost, name, ram, rom, os);

        System.out.println("I am parametrized constructor of childDerived class");
        this.battery = battery;
        this.camera = camera;
    }


}




public class constructorInheritance {
    public static void main(String[] args) {
        
        // phone p1 = new phone(12, 20000, "Rahul");
        // p1.printDetails();

        // smartphone s1 = new smartphone(12, 20000, "Rahul", 4, 64, "Android");
        //    smartphone s2 = new smartphone(4, 64, "Android");
        // s1.printDetails(); 

        childDerived D1 = new childDerived(1,45000,"samsung",4,64,"Android",5000,48);

    }
    
}
