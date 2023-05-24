interface Camera{
    void takesnap();
    void recordvideo();
}
interface wifi{
    String[] getnetworks();
    void connectToNetwork(String network);
}

class Mycellphone {
    void callnumber(int phonenumber) {
        System.out.println("calling " + phonenumber);
    }

    void pickCall(){
        System.out.println("connecting.....");
    }
}


public class Interface2 {
     public static void main(String[] args) {
        
     }
    
}
