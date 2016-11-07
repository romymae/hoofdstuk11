package Hoofdstuk11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Romy Mae on 7-11-2016.
 */
public class ElfPuntNegen20 extends Applet {
    int marge;
    int breedteveld;
    int hoogteveld;
    Color wit;
    Color zwart;
    Color achtergrond;


    public void init() {
        wit  = Color.white;
        zwart = Color.black;
        achtergrond = Color.pink;
        marge =60;
        breedteveld = 40;
        hoogteveld= breedteveld;

        int breedtescherm = 2*marge + 8* breedteveld;
        int hooftescherm = 2*marge+8*hoogteveld;
        setSize(breedtescherm, hooftescherm);
        setBackground(achtergrond);
    }

    public void paint(Graphics g) {
       int y = marge;
        for (int rij = 0; rij <8 ; rij++) {
            int x = marge;
            for (int kolom = 0; kolom <8 ; kolom++) {
                if ((rij+kolom)%2==0){
                    g.setColor(zwart);
                } else{
                    g.setColor(wit);
                }
                g.fillRect(x,y,breedteveld,hoogteveld);
                x+=breedteveld;
            }
            y+=hoogteveld;
        }
    }
}
