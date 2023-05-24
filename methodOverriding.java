class A {
    
    int a;

    public A() {
        this.a = 0;
    }

    public A(int a) {
        this.a = a;
    }
    
    public void method1(int a) {
        this.a = a;
        System.out.println("I am method A and value of a is -> "+a);
    }
}

class B extends A {

    int b;

    public B() {
        super();
        this.b = 0;
    }

    public B(int a, int b) {
        super(a);
        this.b = b;
    }

    public void method1() {
        System.out.println("I am method B and value of b -> "+b);
    }
}




public class methodOverriding {
    public static void main(String[] args) {
        A a = new A();
        a.method1(78);

        B b = new B();
        b.method1(45);

    }
    
}
