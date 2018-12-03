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
public class nen extends JLabel  {
       int x, y;
       static ImageIcon hinhNen = new ImageIcon("C:\\Users\\20166\\Documents\\NetBeansProjects\\Opp_btl2\\src\\image\\nen.png");
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

    public nen(int x_, int y_) {
        this.setIcon(hinhNen);
        this.x = x_;
        this.y = y_;
        this.setBounds(x, y, display.size, display.size);
    }
    
}
