package Hoofdstuk11;

import java.applet.Applet;

/**
 * Created by Romy Mae on 14-10-2016.
 */
import java.awt.*;
import java.applet.*;
public class ElfPuntZes extends Applet {

    public void init(){

    }
    public void paint(Graphics g){
        int z =0;
        int x=50;
        int y=50;
        int breedte=10;
        int lengte=10;
        while (z<=5){
            g.drawOval(x,y,breedte,lengte);
            breedte +=10;
            x-=5;
            y-=5;
            lengte+=10;
            z++;
        }

    }
    }

