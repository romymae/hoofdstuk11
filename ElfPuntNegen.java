package Hoofdstuk11;

import java.applet.Applet;

/**
 * Created by Romy Mae on 20-10-2016.
 */
import java.awt.*;
public class ElfPuntNegen extends Applet {
    public void init() {
        setBackground(Color.pink);
    }

    public void paint(Graphics g) {
        int breedte = 30;
        int hoogte = 30;
        int x = 50;
        int y = 50;
        Color wit = Color.white;
        Color zwart = Color.black;
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(zwart);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(wit);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }
        //2e rij
        x = 50;
        y += hoogte;
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }
        //3e rij
        x = 50;
        y += hoogte;
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(zwart);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(wit);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }
        //4e rij
        x = 50;
        y += hoogte;
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }
        //5e rij
        x = 50;
        y += hoogte;
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(zwart);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(wit);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }
        //6e rij
        x = 50;
        y += hoogte;
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }
        //7e rij
        x = 50;
        y += hoogte;
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(zwart);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(wit);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }
        //8e rij
        x = 50;
        y += hoogte;
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }
    }
}





