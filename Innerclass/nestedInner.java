// !nested inner class
class Outer {
    int x = 10;
    // global variable
    Inner i = new Inner();
// !inner classe
    class Inner {
        int y = 5;

        void innerDisplay() {
            System.out.println(x + "  " + y);
            System.out.println(y);
        }
    }

    void outerDisplay() {
        // Inner i = new Inner();
        i.innerDisplay();
        
        System.out.println(i.y);
    }
}

public class nestedInner {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.outerDisplay();
// !object of inner class can be created only inside the outer class
        Outer.Inner i = new Outer().new Inner();
        i.innerDisplay();
    }
}
