// package javaPrograms.AWTGUI;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener {
    Label l;
    TextField tf;
    Button b;
    int count = 0;

    MyFrame() {
        super("First App");
        l = new Label("     " + count);
        tf = new TextField(20);
        b = new Button("Click Me");
        b.addActionListener(this);

        add(l);
        add(tf);
        add(b);

        setLayout(new FlowLayout());
        setLocation(1000, 150);
        setSize(400, 400);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            count++;
            l.setText("     " + count);
        }
    }
}


public class ActionListenerr {
    public static void main(String[] args) {
        new MyFrame();
    }
}
