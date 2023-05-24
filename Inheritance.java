
class Base {
    int x;
 
    public void setx(int a) {
        x = a;
    }

    public int getx() {
        return x;
    }

    public void printx() {
        System.out.println("value of x is " + x);

    }

    public Base() {
        System.out.println("Baseclass constructor");
    }

}

class Derived extends Base {
    int y;
    
    public void sety(int n) {
        y = n;
    }

    public int gety() {
        return y;
    }
    
    public Derived() {
        System.out.println("I am derived class constructor");

    }


}


public class Inheritance {

   public static void main(String[] args) {
    
    //base class object
    Base b = new Base();
    b.x = 5;
    System.out.println(b.getx());

    Derived d = new Derived();
    d.x = 78;
    System.out.println(d.getx());
   }
}
