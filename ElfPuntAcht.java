package Hoofdstuk11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Romy Mae on 20-10-2016.
 */
public class ElfPuntAcht extends Applet{

    public void paint(Graphics g){
        int z =0;
        int x=100;
        int y=100;
        int breedte=5;
        int lengte=5;
        while (z<=100){
            g.drawOval(x,y,breedte,lengte);
            breedte +=5;
            lengte+=5;
            z++;
        }

    }

}
