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
public class bom extends JLabel{
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

    public bom(int x, int y) {
        this.setIcon(new ImageIcon("C:\\Users\\20166\\Documents\\NetBeansProjects\\Btl_bomberman\\src\\image\\bom.png"));
        if((x%display.size)/6<5)
            this.x = (x/display.size)*display.size;
        else
            this.x = (x/display.size+1)*display.size; 
        if((y%display.size)/6<5)
            this.y = (y/display.size)*display.size;
        else
            this.y = (y/display.size+1)*display.size;
        this.setBounds(x, y, display.size, display.size);
    }
}
