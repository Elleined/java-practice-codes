package trykeylistener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {

    JLabel label;
    ImageIcon imageIcon;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.addKeyListener(this);

        imageIcon = new ImageIcon("rocket.png");
        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.cyan);
        label.setOpaque(true);
        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'a' -> label.setLocation(label.getX() - 10, label.getY());
            case 'w' -> label.setLocation(label.getX(), label.getY() - 10);
            case 's' -> label.setLocation(label.getX(), label.getY() + 10);
            case 'd' -> label.setLocation(label.getX() + 10, label.getY());
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Key code: " + e.getKeyCode());
        System.out.println("Key char: " + e.getKeyChar());
    }
}
