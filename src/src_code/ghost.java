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
public class ghost extends JLabel{
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

    public ghost(int x, int y) {
        this.setIcon(new ImageIcon("C:\\Users\\20166\\Documents\\NetBeansProjects\\Btl_bomberman\\src\\image\\quaivat_down.png"));
        this.x = x;
        this.y = y;
        this.setBounds(x, y, 54, 54);
    }
    public void move(int _huong){
        boolean canMove;
        switch (_huong) {
            case 2:
                canMove = true;
                
                if(this.y==(display.row-1)*display.size)
                    canMove = false;
                for(int i = 0; i < display.listStone.size();i++)
                {
                    if(this.y+display.size==display.listStone.elementAt(i).y&&
                            this.x<display.listStone.elementAt(i).x+display.size&&
                            this.x>display.listStone.elementAt(i).x-display.size)
                        canMove = false;
                }
                for(int i = 0; i < display.listWood.size();i++)
                {
                    if(this.y+display.size==display.listWood.elementAt(i).y&&
                            this.x<display.listWood.elementAt(i).x+display.size&&
                            this.x>display.listWood.elementAt(i).x-display.size)
                        canMove = false;
                }
                for(int i = 0; i < display.listBom.size();i++)
                {
                    if(this.y+display.size==display.listBom.elementAt(i).y&&
                            this.x<display.listBom.elementAt(i).x+display.size&&
                            this.x>display.listBom.elementAt(i).x-display.size)
                        canMove = false;
                }
                if(canMove == true)
                {
                    y = y + 6;
                    setIcon(new ImageIcon("C:\\Users\\20166\\Documents\\NetBeansProjects\\Btl_bomberman\\src\\image\\quaivat_down.png"));
                    setBounds(x, y, display.size, display.size);
                }
                else 
                {
                   setIcon(new ImageIcon("C:\\Users\\20166\\Documents\\NetBeansProjects\\Btl_bomberman\\src\\image\\quaivat_down.png"));
                }
                break;
            case 0:
                canMove = true;
                if(this.y==0)
                    canMove = false;
                for(int i = 0; i < display.listStone.size();i++)
                {
                    if(this.y-display.size==display.listStone.elementAt(i).y&&
                            this.x<display.listStone.elementAt(i).x+display.size&&
                            this.x>display.listStone.elementAt(i).x-display.size)
                        canMove = false;
                }
                for(int i = 0; i < display.listWood.size();i++)
                {
                    if(this.y-display.size==display.listWood.elementAt(i).y&&
                            this.x<display.listWood.elementAt(i).x+display.size&&
                            this.x>display.listWood.elementAt(i).x-display.size)
                        canMove = false;
                }
                for(int i = 0; i < display.listBom.size();i++)
                {
                    if(this.y-display.size==display.listBom.elementAt(i).y&&
                            this.x<display.listBom.elementAt(i).x+display.size&&
                            this.x>display.listBom.elementAt(i).x-display.size)
                        canMove = false;
                }
                if(canMove == true)
                {
                    y = y - 6;
                    setIcon(new ImageIcon("C:\\Users\\20166\\Documents\\NetBeansProjects\\Btl_bomberman\\src\\image\\quaivat_up.png"));
                    setBounds(x, y, display.size, display.size); 
                }
                else
                {
                   setIcon(new ImageIcon("C:\\Users\\20166\\Documents\\NetBeansProjects\\Btl_bomberman\\src\\image\\quaivat_up.png"));   
                }
                break;
            case 3:
                canMove = true;
                if(this.x==0)
                    canMove = false;
                for(int i = 0; i < display.listStone.size();i++)
                {
                    if(this.x-display.size==display.listStone.elementAt(i).x&&
                            this.y<display.listStone.elementAt(i).y+display.size&&
                            this.y>display.listStone.elementAt(i).y-display.size)
                    {
                        canMove = false;
                    }
                }
                for(int i = 0; i < display.listWood.size();i++)
                {
                    if(this.x-display.size==display.listWood.elementAt(i).x&&
                            this.y<display.listWood.elementAt(i).y+display.size&&
                            this.y>display.listWood.elementAt(i).y-display.size)
                        canMove = false;
                }
                for(int i = 0; i < display.listBom.size();i++)
                {
                    if(this.x-display.size==display.listBom.elementAt(i).x&&
                            this.y<display.listBom.elementAt(i).y+display.size&&
                            this.y>display.listBom.elementAt(i).y-display.size)
                        canMove = false;
                }
                if(canMove == true)
                {
                    x = x - 6;
                    setIcon(new ImageIcon("C:\\Users\\20166\\Documents\\NetBeansProjects\\Btl_bomberman\\src\\image\\quaivat_left.png"));
                    setBounds(x, y, display.size, display.size);   
                }
                else
                {
                   setIcon(new ImageIcon("C:\\Users\\20166\\Documents\\NetBeansProjects\\Btl_bomberman\\src\\image\\quaivat_left.png"));     
                }
                break;
            case 1:
                canMove = true;
                
                if(this.x==(display.col-1)*display.size)
                    canMove = false;
                for(int i = 0; i < display.listStone.size();i++)
                {
                    if(this.x+display.size==display.listStone.elementAt(i).x&&
                            this.y<display.listStone.elementAt(i).y+display.size&&
                            this.y>display.listStone.elementAt(i).y-display.size)
                        canMove = false;
                }
                for(int i = 0; i < display.listWood.size();i++)
                {
                    if(this.x+display.size==display.listWood.elementAt(i).x&&
                            this.y<display.listWood.elementAt(i).y+display.size&&
                            this.y>display.listWood.elementAt(i).y-display.size)
                        canMove = false;
                }
                for(int i = 0; i < display.listBom.size();i++)
                {
                    if(this.x+display.size==display.listBom.elementAt(i).x&&
                            this.y<display.listBom.elementAt(i).y+display.size&&
                            this.y>display.listBom.elementAt(i).y-display.size)
                        canMove = false;
                }
                if(canMove == true)
                {
                    x = x + 6;
                    setIcon(new ImageIcon("C:\\Users\\20166\\Documents\\NetBeansProjects\\Btl_bomberman\\src\\image\\quaivat_right.png"));
                    setBounds(x, y, display.size, display.size); 
                }
                else
                {
                   setIcon(new ImageIcon("C:\\Users\\20166\\Documents\\NetBeansProjects\\Btl_bomberman\\src\\image\\quaivat_right.png"));   
                }
                break;
            default:
                break;
        }
    }
}
