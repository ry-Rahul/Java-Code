interface Bicycle {

    //interfaces methods and properties are publc by default
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}


interface HornBicycle {
    int b = 46;

    void blowhorn();

    void blowhorn2();
}

class Rockrider implements Bicycle , HornBicycle{
    
    void blowhorn3() {
        System.out.println("blowing horn");

    }
    //agar ham interface ke methods ko use krte hai to unhe public banana padega

    public void applyBrake(int decrement) {
        System.out.println("applying brake");
    } 

    public void speedUp(int increment) {
        System.out.println("speeding up");
    }

    public void blowhorn() {
        System.out.println("blowing horn");
    }

    public void blowhorn2() {
        System.out.println("blowing horn 2");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        //interface in english means a poitn where two system meet and intract 

        // in java interface is a group of related methods with empty bodies

        // abstract class me sare ke sare methds abstract hota hai 

        // ham multiple interface ka use krke ek class ko bna sakte hai  lekin multiple abstract class ka use krke ek calss nhi bna sakte     
       
        Rockrider r1 = new Rockrider();
        r1.applyBrake(2);
        //you can create properties in interface
        System.out.println(r1.a);
        // you cannot modify the properties in interfaces as they are final 

        // r1.a = 567;  error
        // System.out.println(r1.a);

        r1.blowhorn();
        r1.blowhorn2();



    }  
    
}
