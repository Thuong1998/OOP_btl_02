/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src_code;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author h
 */
public class ghost extends JLabel{
    int x, y;
    ArrayList <Integer> cacHuong = new ArrayList<Integer> ();
    int status = 2;
    private static ImageIcon ghostDown = new ImageIcon("C:\\Users\\20166\\Documents\\NetBeansProjects\\Opp_btl2\\src\\image\\quaivat_down.png");
    private static ImageIcon ghostUp = new ImageIcon("C:\\Users\\20166\\Documents\\NetBeansProjects\\Opp_btl2\\src\\image\\quaivat_up.png");
    private static ImageIcon ghostLeft = new ImageIcon("C:\\Users\\20166\\Documents\\NetBeansProjects\\Opp_btl2\\src\\image\\quaivat_left.png");
    private static ImageIcon ghostRight = new ImageIcon("C:\\Users\\20166\\Documents\\NetBeansProjects\\Opp_btl2\\src\\image\\quaivat_right.png");
    public ghost(int x_, int y_) {
        this.setIcon(ghostDown);
        this.x = x_;
        this.y = y_;
        this.setBounds(x, y, display.size, display.size);
    }
    public void move(){
        tinhCacHuongDi();
        if(cacHuong.isEmpty()){
            kill();
            return;
        }
        int newStatus = cacHuong.get((int) (Math.random()*cacHuong.size()));
        for(int i = 0;i < cacHuong.size();i ++)
            if(cacHuong.get(i) == status){
                newStatus = status;
                break;
            }
        status = newStatus;
        switch (status) {
            case 2:
                {
                    y = y + 8;
                    setIcon(ghostDown);
                    setBounds(x, y, display.size, display.size);
                }
                break;
            case 0:
                {
                    y = y - 8;
                    setIcon(ghostUp);
                    setBounds(x, y, display.size, display.size); 
                }
                break;
            case 3:
                {
                    x = x - 8;
                    setIcon(ghostLeft);
                    setBounds(x, y, display.size, display.size);   
                }
                break;
            case 1:
                {
                    x = x + 8;
                    setIcon(ghostRight);
                    setBounds(x, y, display.size, display.size); 
                }
                break;
            default:
                break;
        }
        kill();
    }
    public void kill(){
        if(display.bomber_man.dead)
            return;
        int tmpx = display.bomber_man.x;
        int tmpy = display.bomber_man.y;
        if(tmpx >  x - display.size  && tmpx < x + display.size
                &&tmpy > y -display.size && tmpy < y + display.size){
            display.bomber_man.setIcon(new ImageIcon("C:\\Users\\20166\\Documents\\NetBeansProjects\\Opp_btl2\\src\\image\\thayma.png"));
            display.bomber_man.dead = true;
           
              
        }
    }
    public void tinhCacHuongDi(){
        cacHuong.clear();
        for(int j = 0;j < 4;j ++){
            boolean canMove = true;
            switch (j) {
            case 2:
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
                break;
            case 0:
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
                break;
            case 3:
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
                break;
            case 1:
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
                break;
            default:
                break;
        }
            if(canMove)
                cacHuong.add(j);
        }
    }
}
