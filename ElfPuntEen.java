package Hoofdstuk11;

import java.applet.Applet;

/**
 * Created by Romy Mae on 13-10-2016.
 */
import java.awt.*;
import java.applet.*;


public class ElfPuntEen extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller = 0;
        int y = 0;

        while(teller <= 10) {
            y += 20;
            g.drawLine(y , 50, y,300);
            g.drawString("" + teller, y, 310 );
            teller++;
        }
    }
}
