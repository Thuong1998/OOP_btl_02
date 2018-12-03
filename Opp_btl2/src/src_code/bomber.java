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
public class bomber extends JLabel {
    int x, y;
    boolean dead = false;
    private static ImageIcon bomberDown = new ImageIcon("C:\\Users\\20166\\Documents\\NetBeansProjects\\Opp_btl2\\src\\image\\bomber_down.png");
    private static ImageIcon bomberUp = new ImageIcon("C:\\Users\\20166\\Documents\\NetBeansProjects\\Opp_btl2\\src\\image\\bomber_up.png");
    private static ImageIcon bomberLeft = new ImageIcon("C:\\Users\\20166\\Documents\\NetBeansProjects\\Opp_btl2\\src\\image\\bomber_left.png");
    private static ImageIcon bomberRight = new ImageIcon("C:\\Users\\20166\\Documents\\NetBeansProjects\\Opp_btl2\\src\\image\\bomber_right.png");
    public bomber(int x_, int y_) {
        this.setIcon(bomberDown);
        this.x = x_;
        this.y = y_;
        this.setBounds(x, y, display.size, display.size);
    }
    public void move(int _huong){
        boolean canMove;
        switch (_huong) {
            case 2:
                canMove = true;
                
                if(display.bomber_man.y==(display.row-1)*display.size)
                    canMove = false;
                for(int i = 0; i < display.listStone.size();i++)
                {
                    if(display.bomber_man.y+display.size==display.listStone.elementAt(i).y&&
                            display.bomber_man.x<display.listStone.elementAt(i).x+display.size&&
                            display.bomber_man.x>display.listStone.elementAt(i).x-display.size)
                        canMove = false;
                }
                for(int i = 0; i < display.listWood.size();i++)
                {
                    if(display.bomber_man.y+display.size==display.listWood.elementAt(i).y&&
                            display.bomber_man.x<display.listWood.elementAt(i).x+display.size&&
                            display.bomber_man.x>display.listWood.elementAt(i).x-display.size)
                        canMove = false;
                }
                for(int i = 0; i < display.listBom.size();i++)
                {
                    if(display.bomber_man.y+display.size==display.listBom.elementAt(i).y&&
                            display.bomber_man.x<display.listBom.elementAt(i).x+display.size&&
                            display.bomber_man.x>display.listBom.elementAt(i).x-display.size)
                        canMove = false;
                }
                if(canMove == true)
                {
                    y = y + 8;
                    setIcon(bomberDown);
                    setBounds(x, y, display.size, display.size);
                }
                else 
                {
                   setIcon(bomberDown);
                }
                break;
            case 0:
                canMove = true;
                if(display.bomber_man.y==0)
                    canMove = false;
                for(int i = 0; i < display.listStone.size();i++)
                {
                    if(display.bomber_man.y-display.size==display.listStone.elementAt(i).y&&
                            display.bomber_man.x<display.listStone.elementAt(i).x+display.size&&
                            display.bomber_man.x>display.listStone.elementAt(i).x-display.size)
                        canMove = false;
                }
                for(int i = 0; i < display.listWood.size();i++)
                {
                    if(display.bomber_man.y-display.size==display.listWood.elementAt(i).y&&
                            display.bomber_man.x<display.listWood.elementAt(i).x+display.size&&
                            display.bomber_man.x>display.listWood.elementAt(i).x-display.size)
                        canMove = false;
                }
                for(int i = 0; i < display.listBom.size();i++)
                {
                    if(display.bomber_man.y-display.size==display.listBom.elementAt(i).y&&
                            display.bomber_man.x<display.listBom.elementAt(i).x+display.size&&
                            display.bomber_man.x>display.listBom.elementAt(i).x-display.size)
                        canMove = false;
                }
                if(canMove == true)
                {
                    y = y - 8;
                    setIcon(bomberUp);
                    setBounds(x, y, display.size, display.size); 
                }
                else
                {
                   setIcon(bomberUp);   
                }
                break;
            case 3:
                canMove = true;
                if(display.bomber_man.x==0)
                    canMove = false;
                for(int i = 0; i < display.listStone.size();i++)
                {
                    if(display.bomber_man.x-display.size==display.listStone.elementAt(i).x&&
                            display.bomber_man.y<display.listStone.elementAt(i).y+display.size&&
                            display.bomber_man.y>display.listStone.elementAt(i).y-display.size)
                    {
                        canMove = false;
                    }
                }
                for(int i = 0; i < display.listWood.size();i++)
                {
                    if(display.bomber_man.x-display.size==display.listWood.elementAt(i).x&&
                            display.bomber_man.y<display.listWood.elementAt(i).y+display.size&&
                            display.bomber_man.y>display.listWood.elementAt(i).y-display.size)
                        canMove = false;
                }
                for(int i = 0; i < display.listBom.size();i++)
                {
                    if(display.bomber_man.x-display.size==display.listBom.elementAt(i).x&&
                            display.bomber_man.y<display.listBom.elementAt(i).y+display.size&&
                            display.bomber_man.y>display.listBom.elementAt(i).y-display.size)
                        canMove = false;
                }
                if(canMove == true)
                {
                    x = x - 8;
                    setIcon(bomberLeft);
                    setBounds(x, y, display.size, display.size);   
                }
                else
                {
                   setIcon(bomberLeft);     
                }
                break;
            case 1:
                canMove = true;
                
                if(display.bomber_man.x==(display.col-1)*display.size)
                    canMove = false;
                for(int i = 0; i < display.listStone.size();i++)
                {
                    if(display.bomber_man.x+display.size==display.listStone.elementAt(i).x&&
                            display.bomber_man.y<display.listStone.elementAt(i).y+display.size&&
                            display.bomber_man.y>display.listStone.elementAt(i).y-display.size)
                        canMove = false;
                }
                for(int i = 0; i < display.listWood.size();i++)
                {
                    if(display.bomber_man.x+display.size==display.listWood.elementAt(i).x&&
                            display.bomber_man.y<display.listWood.elementAt(i).y+display.size&&
                            display.bomber_man.y>display.listWood.elementAt(i).y-display.size)
                        canMove = false;
                }
                for(int i = 0; i < display.listBom.size();i++)
                {
                    if(display.bomber_man.x+display.size==display.listBom.elementAt(i).x&&
                            display.bomber_man.y<display.listBom.elementAt(i).y+display.size&&
                            display.bomber_man.y>display.listBom.elementAt(i).y-display.size)
                        canMove = false;
                }
                if(canMove == true)
                {
                    x = x + 8;
                    setIcon(bomberRight);
                    setBounds(x, y, display.size, display.size); 
                }
                else
                {
                   setIcon(bomberRight);   
                }
                break;
            default:
                break;
        }
    }
}
