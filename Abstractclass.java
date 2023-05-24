
// abstract class
abstract class parent {

    // abstract class ka object nahi ban sakta kyoki wo to ek jariya hai ek standard
    // hai dusri classes ke liye ek calss banane ka

    public parent() {
        System.out.println("iam base class constructor");
    }

    public void sayhello() {
        System.out.println("Hello my love");
    }

    abstract public void greet();

    abstract public void greet2();
}

// child calss
class child extends parent {

    public child() {

    }

    public void greet() {
        System.out.println("good morning");
    }

    public void greet2() {
        System.out.println("yeah i am second extract class");
    }

}

// child 2 class
// ye to is class ko abstract bna lo ya us method ko overide kr lo
abstract class child2 extends parent {

    public void ntg() {
        System.out.println("iam child 2 method");
    }
}

public class Abstractclass {
    public static void main(String[] args) {

        // child2 c2 = new child2();
        child c2 = new child();
        c2.greet();
        c2.greet2();

    }
}