package Hoofdstuk11;

/**
 * Created by Romy Mae on 20-10-2016.
 */
import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class HoofdstukElfPraktijk extends Applet {
    int tafel;
    int x, y, z;
    TextField tekstvak;
    Label label;

    public void init() {
        setSize(500, 500);
        tafel = 0;
        label = new Label("type hier uw getal en druk op enter");
        tekstvak = new TextField(2);
        Listen1 l1 = new Listen1();
        tekstvak.addActionListener(l1);
        add (label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        x = 50;
        y = 50;
        if (tafel > 0) {
            for (z = 0; z < 10; ) {
                y = y + 20;
                z++;
                g.drawString(z + "x" + tafel + "=" + tafel * z, x, y);
            }
        }
    }

    class Listen1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tafel=(Integer.parseInt(tekstvak.getText()));
            repaint();
        }
    }
}
