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
public class wood extends JLabel  {
    int x, y;
    private static ImageIcon hinhWood = new ImageIcon("C:\\Users\\20166\\Documents\\NetBeansProjects\\Opp_btl2\\src\\image\\wood.png");
    public wood(int x_, int y_) {
        this.setIcon(hinhWood);
        this.x = x_;
        this.y = y_;
        this.setBounds(x, y, display.size, display.size);
    }
    
}
