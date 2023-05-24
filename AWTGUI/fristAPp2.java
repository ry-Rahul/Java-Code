// package javaPrograms.AWTGUI;

import java.awt.*;
class MyFrame extends Frame {
    Label l;
    TextField tf;
    Button b;

    MyFrame() {
        super("First App");
        l = new Label("Enter your name");
        tf = new TextField(20);
        b = new Button("Click Me");

        add(l);
        add(tf);
        add(b);

        setLayout(new FlowLayout());
        setLocation(1000, 150);
        setSize(400, 400);
        setVisible(true);
    }
}
public class fristAPp2 {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
    }
}
