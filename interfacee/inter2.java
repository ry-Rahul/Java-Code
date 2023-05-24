class Phone {
    public void call() {
        System.out.println("Phone Calling...");
    }

    public void sms() {
        System.out.println("Phone Sending...");
    }
}

interface ICamera{

    void takePhoto();

    void recordVideo();
}

interface IMusicPlayer {

    void playMusic();

    void stopMusic();
}

class Smartphone extends Phone implements ICamera, IMusicPlayer {
    public void takePhoto() {
        System.out.println("Taking Photo...");
    }

    public void recordVideo() {
        System.out.println("Recording Video...");
    }

    public void playMusic() {
        System.out.println("Playing Music...");
    }

    public void stopMusic() {
        System.out.println("Stopping Music...");
    }
}
public class inter2 {
    public static void main(String[] args) {
        // Smartphone s = new Smartphone();
        // s.call();
        // s.sms();

        IMusicPlayer s = new Smartphone();
        s.playMusic();
        s.stopMusic();
    }
}
