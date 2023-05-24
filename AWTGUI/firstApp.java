

import java.awt.*;
public class firstApp {
    public static void main(String[] args) {
        Frame f = new Frame("First App");
        f.setLayout(new FlowLayout());
 
        Button b = new Button("Click Me");
        TextField tf = new TextField(20);
        Label l = new Label("Enter your name");

        f.add(l);
        f.add(tf);
        f.add(b);

        f.setLocation(1000, 150);
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
