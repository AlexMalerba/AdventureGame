package com.labollo.main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

    // It tells if the player is pressing the keys
    public boolean upPressed, downPressed, leftPressed, rightPressed, shiftPressed, cPressed;

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode(); // It gets the key code of the pressed key

        // It sets the pressed key to true
        if(code == KeyEvent.VK_W || code == KeyEvent.VK_UP)
            upPressed = true;
        if(code == KeyEvent.VK_S || code == KeyEvent.VK_DOWN)
            downPressed = true;
        if(code == KeyEvent.VK_A || code == KeyEvent.VK_LEFT)
            leftPressed = true;
        if(code == KeyEvent.VK_D || code == KeyEvent.VK_RIGHT)
            rightPressed = true;

        if(code == KeyEvent.VK_SHIFT)
            shiftPressed = true;
        if(code == KeyEvent.VK_C)
            cPressed = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode(); // It gets the key code of the released key

        // It sets the released key to false because when the key is released the player isn't pressing it
        if(code == KeyEvent.VK_W || code == KeyEvent.VK_UP)
            upPressed = false;
        if(code == KeyEvent.VK_S || code == KeyEvent.VK_DOWN)
            downPressed = false;
        if(code == KeyEvent.VK_A || code == KeyEvent.VK_LEFT)
            leftPressed = false;
        if(code == KeyEvent.VK_D || code == KeyEvent.VK_RIGHT)
            rightPressed = false;

        if(code == KeyEvent.VK_SHIFT)
            shiftPressed = false;
        if(code == KeyEvent.VK_C)
            cPressed = false;
    }
}
