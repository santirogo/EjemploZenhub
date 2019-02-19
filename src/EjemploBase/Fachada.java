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
public class Fachada extends Thread{
    
    private Turtle tortuga;

    public Fachada(Turtle tortuga) {
        this.tortuga = tortuga;
    }

    @Override
    public void run() {
        this.tortuga.setPos(0, 0);
        
        this.tortuga.forward(100);
        this.tortuga.right(90);
        this.tortuga.forward(100);
        this.tortuga.right(90);
        this.tortuga.forward(50);
        this.tortuga.right(90);
        this.tortuga.forward(20);
        this.tortuga.left(90);
        this.tortuga.forward(50);
        this.tortuga.right(90);
        this.tortuga.forward(80);
      
    }
    
}
