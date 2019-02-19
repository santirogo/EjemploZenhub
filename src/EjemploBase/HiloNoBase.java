/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploBase;

import ch.aplu.turtle.Turtle;

/**
 *
 * @author white
 */
public class HiloNoBase extends Thread{
    
    private Turtle tortuga;

    public HiloNoBase(Turtle tortuga) {
        this.tortuga = tortuga;
    }

    @Override
    public void run() {
        this.tortuga.setPos(-50, 0);
        for (int i = 0; i < 4; i++) {
            this.tortuga.forward(115);
            this.tortuga.right(90);
        }
      
    }
    
}
