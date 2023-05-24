class phone {

    public void showTime() {
        System.out.println("good morinig time is 8 am");
    }

    public void on() {
        System.out.println("turning on phone");
    }
}

class smartphone extends phone {
    
    public void music() {
        System.out.println("playing music");

    }
    
    public void on() {
        System.out.println("hello i am a smartphone");
    }
}

public class dynamicMethod {
    public static void main(String[] args) {
        
        // phone obj = new phone();
        // smartphone smobj = new smartphone();
        // obj.name();.

        // agar reference super class ka hai or object subclass ka hai tab ham ye kr sakte hai

          phone obj = new smartphone();
          obj.on();
          obj.showTime();

          //ek aisa method jo super class me hai or subclass me nhi hai to usko call krne se error aayega
            // obj.music();  not allowed it is called dynamic method dispatch

    }
}
