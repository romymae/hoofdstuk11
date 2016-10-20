package Hoofdstuk11;

import java.awt.*;

/**
 * Created by Romy Mae on 14-10-2016.
 */
public class ElfPuntVijf {
    public void init(){
    }
    public void paint(Graphics g){

        int y=10;
        for(int x=10; x<=50; x+=y)
            g.drawRect(x,x,10,10);
    }


}


