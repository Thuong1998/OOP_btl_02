/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src_code;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Genius
 */
    
public class display extends JFrame {
    int width = 980;
    int height = 830;
    static int size = 54;
    int level = 1;
    static int row;    // so hang
    static int col;   // so cot
    static Vector<wood> listWood ;
    static Vector<stone> listStone ;
    static Vector<ghost> listGhost;
    static Vector<bom> listBom = new Vector<>();
    static bomber bomber_man;
    static bom newBom;
    JPanel jp;
    public display() throws FileNotFoundException{
        listWood  = new Vector<>();
        listGhost = new Vector<>();
        listStone = new Vector<>();
        this.setSize(width, height);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jp = new JPanel();
        jp.setBackground(Color.gray);
        File file = new File("C:\\Users\\20166\\Documents\\NetBeansProjects\\Btl_bomberman\\src\\map\\lv1.txt");
        Scanner sc = new Scanner(file);
        String t = sc.nextLine();
        String[] tt = t.split(" ");
        level = Integer.parseInt(tt[0]);
        row = Integer.parseInt(tt[1]);
        col = Integer.parseInt(tt[2]);
        String[] bando = new String[row];
        int i = 0;
        while(sc.hasNext()){
            bando[i] = sc.nextLine();
            i++;
        }
        jp.setLayout(null);
        for(int j = 0;j< row;j++)
            for(int k = 0;k < col;k ++){
            switch (bando[j].charAt(k)) {
                case '#':
                    {
                        stone s = new stone(k*size,j*size);
                        listStone.add(s);
                        jp.add(s);
                        break;
                    }
                case '*':
                    {
                        wood w = new wood(k*size,j*size);
                        jp.add(w);
                        listWood.add(w);
                        break;
                    }
                case 'p':
                    {
                        bomber_man = new bomber(k*size, j*size);
                        jp.add(bomber_man,0);
                        break;
                    }
                case 'g':
                    {
                        ghost g = new ghost(k*size,j*size);
                        jp.add(g);
                        listGhost.add(g);
                        break;
                    }
                default:
                    break;
            }
            }
        this.add(jp);
        this.setVisible(true);
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
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
//                    if(listBom.isEmpty())
                    {
                        newBom = new bom(bomber_man.x,bomber_man.y);
                        newBom.setVisible(true);
                        jp.add(newBom,0);
                        listBom.add(newBom);
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
    
    }
}
