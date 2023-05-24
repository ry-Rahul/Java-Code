// package javaPrograms.staticFinal;

class Test {
    static {
        System.out.println("Static block 1");
    }
    static {
        System.out.println("Static block 2");
    }
}
// !main method 
public class staticBlock {
    // static {
    //     System.out.println("Static block 1");
    // }

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println("Main method");
    }
    
    // static {
    //     System.out.println("Static block 2");
    // }
}
