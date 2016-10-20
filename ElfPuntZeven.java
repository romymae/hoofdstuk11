package Hoofdstuk11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Romy Mae on 20-10-2016.
 */
public class ElfPuntZeven extends Applet {


    public void init(){
    }
    public void paint(Graphics g){
        int z =0;
        int x=300;
        int y=300;
        int breedte=10;
        int lengte=10;
        while (z<=50){
            g.drawOval(x,y,breedte,lengte);
            breedte +=10;
            x-=5;
            y-=5;
            lengte+=10;
            z++;
        }

    }
}
