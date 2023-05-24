

class Test {
    static int x = 10;
    int y = 20;

    void show() {
        System.out.println("x = " + x + " y = " + y);
    }

    static void display() {
        System.out.println("x = " + x );
    }
}

public class staticMeth {
    public static void main(String[] args) {
        Test t = new Test();
        t.show();
        t.x = 30;
        t.y = 40;
        t.show();
        System.out.println("Its object T1");
        Test t1 = new Test();
        t1.show();
    }
}
