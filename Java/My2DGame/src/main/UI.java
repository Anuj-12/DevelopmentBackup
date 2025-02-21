package main;

import java.awt.*;

public class UI {

    GamePanel gp;
    Font arial_40;

    public UI(GamePanel gp){
        this.gp = gp;

        arial_40 = new Font("Arail", Font.PLAIN, 40);
    }

    public void draw(Graphics2D g2){

        // Setting fonts    Font(name, style, size)
        g2.setFont(arial_40);
        g2.setColor(Color.white);
        g2.drawString("Key = " + gp.player.hasKey, 50, 50);
    }
}
