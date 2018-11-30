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

    public bomber(int x, int y) {
        this.setIcon(new ImageIcon("C:\\Users\\20166\\Documents\\NetBeansProjects\\Btl_bomberman\\src\\image\\bomber_down.png"));
        this.x = x;
        this.y = y;
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
                    y = y + 6;
                    setIcon(new ImageIcon("C:\\Users\\20166\\Documents\\NetBeansProjects\\Btl_bomberman\\src\\image\\bomber_down.png"));
                    setBounds(x, y, display.size, display.size);
                }
                else 
                {
                   setIcon(new ImageIcon("C:\\Users\\20166\\Documents\\NetBeansProjects\\Btl_bomberman\\src\\image\\bomber_down.png"));
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
                    y = y - 6;
                    setIcon(new ImageIcon("C:\\Users\\20166\\Documents\\NetBeansProjects\\Btl_bomberman\\src\\image\\bomber_up.png"));
                    setBounds(x, y, display.size, display.size); 
                }
                else
                {
                   setIcon(new ImageIcon("C:\\Users\\20166\\Documents\\NetBeansProjects\\Btl_bomberman\\src\\image\\bomber_up.png"));   
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
                    x = x - 6;
                    setIcon(new ImageIcon("C:\\Users\\20166\\Documents\\NetBeansProjects\\Btl_bomberman\\src\\image\\bomber_left.png"));
                    setBounds(x, y, display.size, display.size);   
                }
                else
                {
                   setIcon(new ImageIcon("C:\\Users\\20166\\Documents\\NetBeansProjects\\Btl_bomberman\\src\\image\\bomber_left.png"));     
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
                    x = x + 6;
                    setIcon(new ImageIcon("C:\\Users\\20166\\Documents\\NetBeansProjects\\Btl_bomberman\\src\\image\\bomber_right.png"));
                    setBounds(x, y, display.size, display.size); 
                }
                else
                {
                   setIcon(new ImageIcon("C:\\Users\\20166\\Documents\\NetBeansProjects\\Btl_bomberman\\src\\image\\bomber_right.png"));   
                }
                break;
            default:
                break;
        }
    }
}
