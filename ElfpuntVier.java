package Hoofdstuk11;

import java.applet.Applet;

/**
 * Created by Romy Mae on 14-10-2016.
 */
import java.awt.*;
import java.applet.*;
public class ElfpuntVier extends Applet {
public void init(){
}
    public void paint(Graphics g){
     int x=50;
        int y=50;
      for(int z=3; z<=30; z+=3){
          g.drawString(""+z,x,y);
          x+=20;
      }
    }




}
