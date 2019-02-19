/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploBase;

import ch.aplu.turtle.Turtle;
import ch.aplu.turtle.TurtleFrame;

/**
 *
 * @author Estudiante
 */
public class EscenarioTortugas extends TurtleFrame{
    //Turtle tortuga1 = null;
    //Turtle tortuga2 = null;
    Turtle tortuga3 = null;
    
    public EscenarioTortugas() {
      //tortuga1 = new Turtle(this);
      //tortuga2 = new Turtle(this);
      tortuga3 = new Turtle(this);
    }
    
    public void iniciar(){
       //HiloBase hilo = new HiloBase(tortuga1);
       //HiloNoBase hilo2 = new HiloNoBase(tortuga2);
       Fachada f = new Fachada(tortuga3);
       f.start();
       //hilo.start();
       //hilo2.start();
    }
    
    
    public static void main(String[] args) {
        EscenarioTortugas escenario = new EscenarioTortugas();
        escenario.iniciar();
        
    }
}
