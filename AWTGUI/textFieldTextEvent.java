import java.awt.event.ActionListener;

import java.awt.event.ActionListener;

import java.awt.event.ActionListener;

import java.awt.event.ActionListener;

import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements TextListener , ActionListener
{
    Label l1, l2;
    TextField tf;

    MyFrame() {
        super("Event Action");
        l1 = new Label("No text is Entered Yet");
        l2 = new Label("Enter key is not yet hit");
        tf = new TextField(20);
        // setEchoChar for passwords
        tf.setEchoChar('*');

        tf.addTextListener(this);
        tf.addActionListener(this);

        setLayout(new FlowLayout());
        add(l1);
        add(tf);
        add(l2);

    }
    public void textValueChanged(TextEvent e) {
       l1.setText(tf.getText());
    }
    public void actionPerformed(ActionEvent e) {
        l2.setText(tf.getText());
    }
}
public class textFieldTextEvent {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(400, 400);
        f.setLocation(1000, 150);
        f.setVisible(true);
    }
}
