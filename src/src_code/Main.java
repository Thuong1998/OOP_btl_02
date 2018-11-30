/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src_code;

import java.io.FileNotFoundException;
import java.util.Random;

/**
 *
 * @author 20166
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        new display().setVisible(true);
        long time = System.currentTimeMillis();
        while(true){
            long time1 = System.currentTimeMillis();
            if(time1 - time > 100){
                time =time1;
                for(int i = 0; i < display.listGhost.size(); i++ )
                    display.listGhost.elementAt(i).move(new Random().nextInt()%4);
            }
        }
    }
}
