package Hoofdstuk11;

/**
 * Created by Romy Mae on 13-10-2016.
 */
import java.awt.*;
import java.applet.*;
public class ElfPuntTwee extends Applet {

    public void init(){
    }
    public void paint(Graphics g){
        int teller;
        int y=300;

        for (teller=10; teller<= 20; teller++){
            y -=20;
            g.drawString(""+teller,100,y);

        }
    }

}
