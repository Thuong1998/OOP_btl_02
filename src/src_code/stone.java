/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src_code;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author h
 */
public class stone extends JLabel  {
       int x, y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public stone(int x, int y) {
        this.setIcon(new ImageIcon("C:\\Users\\20166\\Documents\\NetBeansProjects\\Btl_bomberman\\src\\image\\stone.png"));
        this.x = x;
        this.y = y;
        this.setBounds(x, y, 54, 54);
    }
    
}
