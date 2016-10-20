package Hoofdstuk11;

/**
 * Created by Romy Mae on 14-10-2016.
 */
import java.awt.*;
import java.applet.*;
public class ElfPutnDrie extends Applet {

    public void init() {
    }
    public void paint(Graphics g){
            int x= 50;
            int y=30;
            int z=1;
        for(int a=1;a<100; a+=z){
            g.drawString(""+a,x,y);
            x+=20;
            z++;
        }
    }








}
