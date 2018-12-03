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
private static ImageIcon quaBom = new ImageIcon("C:\\Users\\20166\\Documents\\NetBeansProjects\\Opp_btl2\\src\\image\\bom.png"), 
        bomNo = new ImageIcon("C:\\Users\\20166\\Documents\\NetBeansProjects\\Opp_btl2\\src\\image\\no.png");
    int timeKichNo = 2000, timeNo = 500;
    public bom(int x_, int y_) {
        if((x_%display.size) < 32)
            this.x = (x_/display.size)*display.size;
        else
            this.x = (x_/display.size+1)*display.size; 
        if((y_%display.size) < 32)
            this.y = (y_/display.size)*display.size;
        else
            this.y = (y_/display.size+1)*display.size;
        display.nenn[y/display.size][x/display.size].setIcon(quaBom);
        this.setBounds(x, y, display.size, display.size);
    }
    public void noBom(){
        if(timeKichNo != 0){
            timeKichNo -= 100;
        }
        else{
            if(timeNo == 500){
                display.nenn[y/display.size][x/display.size].setIcon(bomNo);
                for(int i =0 ; i < display.listWood.size(); i++ ){
                    if((display.listWood.elementAt(i).x == x + display.size && display.listWood.elementAt(i).y == y)||
                            (display.listWood.elementAt(i).x == x - display.size && display.listWood.elementAt(i).y == y)||
                            (display.listWood.elementAt(i).x == x && display.listWood.elementAt(i).y == y + display.size)||
                            (display.listWood.elementAt(i).x == x && display.listWood.elementAt(i).y == y - display.size)
                            )
                    {
                        display.listWood.elementAt(i).setVisible(false);
                        display.listWood.remove(i);
                        i--;
                    }
                }
                display.nenn[y/display.size - 1][x/display.size].setIcon(bomNo);
                display.nenn[y/display.size + 1][x/display.size].setIcon(bomNo);
                display.nenn[y/display.size][x/display.size - 1].setIcon(bomNo);
                display.nenn[y/display.size][x/display.size + 1].setIcon(bomNo);
            }
            kill();
            timeNo -= 100;
            if(timeNo != 0)
                return;
            display.nenn[y/display.size][x/display.size].setIcon(nen.hinhNen);
            display.nenn[y/display.size - 1][x/display.size].setIcon(nen.hinhNen);
            display.nenn[y/display.size + 1][x/display.size].setIcon(nen.hinhNen);
            display.nenn[y/display.size][x/display.size - 1].setIcon(nen.hinhNen);
            display.nenn[y/display.size][x/display.size + 1].setIcon(nen.hinhNen);
            display.jp.remove(this);
            for(int i = 0;i < display.listBom.size();i ++)
                if(display.listBom.elementAt(i) == this){
                    display.listBom.remove(i);
                    break;
                }
        }
    }
    public void kill() {
            for(int j = 0;j < display.listGhost.size();j ++){
                int tmpx = display.listGhost.elementAt(j).x;
                int tmpy = display.listGhost.elementAt(j).y;
                if(tmpx > x - 2 * display.size && tmpx < x + 2*display.size
                    && tmpy > y - 2 * display.size && tmpy < y + 2 * display.size){
                    display.listGhost.elementAt(j).setVisible(false);
                    display.listGhost.remove(j);
                }
            }
        int tmpx = display.bomber_man.x;
        int tmpy = display.bomber_man.y;
        if(tmpx > x - 2 * display.size && tmpx < x + 2*display.size
           && tmpy > y - 2 * display.size && tmpy < y + 2 * display.size)
        {
            display.bomber_man.setIcon(new ImageIcon("C:\\Users\\20166\\Documents\\NetBeansProjects\\Opp_btl2\\src\\image\\thayma.png")); 
            display.bomber_man.dead = true;
        }
    }
}
