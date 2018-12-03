/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src_code;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Genius
 */
    
public class display extends JFrame {
    int width = 1152;
    int height = 999;
    static int size = 64;
    int level = 1;
    static int row;    // so hang
    static int col;   // so cot
    static Vector<wood> listWood ;
    static Vector<stone> listStone ;
    static Vector<ghost> listGhost;
    static Vector<bom> listBom = new Vector<>();
    static bomber bomber_man;
    static JPanel jp;
    static char[][] map;
    static nen[][] nenn;
    public display() throws FileNotFoundException{
        listWood  = new Vector<>();
        listGhost = new Vector<>();
        listStone = new Vector<>();
        jp = (JPanel) getContentPane();
        jp.setBackground(Color.gray);
        File file = new File("C:\\Users\\20166\\Documents\\NetBeansProjects\\Opp_btl2\\src\\map\\lv1.txt");
        Scanner sc = new Scanner(file);
        String t = sc.nextLine();
        String[] tt = t.split(" ");
        level = Integer.parseInt(tt[0]);
        row = Integer.parseInt(tt[1]);
        col = Integer.parseInt(tt[2]);
        width = size*col;
        height = 40 +size*row;
//        String[] bando = new String[row];
        map = new char[row][col];
        nenn = new nen[row][col];
        for(int j = 0;j < row;j ++)
            for(int k = 0;k < col;k ++)
                nenn[j][k] = new nen(k*size, j*size);
        int i = 0;
        while(sc.hasNext()){
            map[i] = sc.nextLine().toCharArray();
            i++;
        }
        jp.setLayout(null);
        for(int j = 0;j< row;j++)
            for(int k = 0;k < col;k ++){
            switch (map[j][k]) {
                case '#':
                    {
//                        stone s = new stone(k*size,j*size);
                        listStone.add(new stone(k*size,j*size));
                        jp.add(listStone.elementAt(listStone.size() - 1));
                        break;
                    }
                case '*':
                    {
//                        wood w = new wood(k*size,j*size);
//                        listWood.add(w);
//                        jp.add(w);
                        listWood.add(new wood(k*size,j*size));
                        jp.add(listWood.elementAt(listWood.size() - 1));
                        break;
                    }
                case 'p':
                    {
                        bomber_man = new bomber(k*size, j*size);
                        break;
                    }
                case 'g':
                    {
                        listGhost.add(new ghost(k*size,j*size));
//                        ghost g = new ghost(k*size,j*size);
//                        jp.add(g);
//                        listGhost.add(g);
                        break;
                    }
                default:
                    break;
            }
            }
        //this.add(jp);
        //this.setVisible(true);
        for(int j = 0;j < listGhost.size();j ++)
            jp.add(listGhost.elementAt(j), 0);
        jp.add(bomber_man, 0);
        for(int j = 0;j < row;j ++)
            for(int k = 0;k < col;k ++){
                jp.add(nenn[j][k]);
                jp.add(new nen(k*size, j*size));
            }
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();//2 xuong, 0 len, 3 trai, 1 phai
                if(bomber_man.dead)
                    return;
                if(key == KeyEvent.VK_S){
                    bomber_man.move(2);
                }
                if(key == KeyEvent.VK_W){
                    bomber_man.move(0);
                }
                if(key == KeyEvent.VK_A){
                    bomber_man.move(3);
                }
                if(key == KeyEvent.VK_D){
                    bomber_man.move(1);
                }
                if(key == KeyEvent.VK_O){
                    if(listBom.isEmpty())
                    {
                        //newBom = new bom(bomber_man.x,bomber_man.y);
                        //newBom.setVisible(true);
                        listBom.add(new bom(bomber_man.x,bomber_man.y));
                    }
                }
            }
        });
        this.setSize(width, height);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
