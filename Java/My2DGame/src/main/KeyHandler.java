package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

// KeyListener is used to receive keystrokes
public class KeyHandler implements KeyListener {

    public boolean upPressed, downPressed, leftPressed, rightPressed;
    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {

        int code = keyEvent.getKeyCode();   // return integer ACII code assigned to the key pressed

        if(code == KeyEvent.VK_W){  // if W pressed
            upPressed = true;
        }
        if(code == KeyEvent.VK_S){  // if S pressed
            downPressed = true;
        }
        if(code == KeyEvent.VK_A){  // if A pressed
            leftPressed = true;
        }
        if(code == KeyEvent.VK_D){  // if D pressed
            rightPressed = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        int code = keyEvent.getKeyCode();   // return integer ACII code assigned to the key pressed

        if(code == KeyEvent.VK_W){  // if W pressed
            upPressed = false;
        }
        if(code == KeyEvent.VK_S){  // if S pressed
            downPressed = false;
        }
        if(code == KeyEvent.VK_A){  // if A pressed
            leftPressed = false;
        }
        if(code == KeyEvent.VK_D){  // if D pressed
            rightPressed = false;
        }

    }
}
