package graphics;

import java.awt.Color;
import java.awt.Graphics;

/**
 * @author Héctor Quej Cosgaya
 * @author Jose Aguilar Canepa
 * 
 * Esta clase necesita de tu ayuda!
 */
public class Rectangulo extends FiguraGrafica {
    
    private int[] x = {50, 150, 150, 50}; 
    private int[] y = {15, 15, 65, 65};  

    
    @Override
    public void dibujar(Graphics g) {
    g.drawPolygon(x, y, 4);
    }
    
    
    @Override
    
    public void encojer(Graphics g) {
    x[1] -= 5; y[1] -= 5;
    x[2] -= 5; y[2] += 5;
    this.dibujar(g);
    }


    @Override
    public void agrandar(Graphics g) {
    x[1] += 5; y[1] += 5;
    x[2] += 5; y[2] -= 5;
    this.dibujar(g);
    }
    

    @Override
    public void cambiarColor(Graphics g, Color c) {
    g.setColor(c);
    this.dibujar(g);
    }
    
    @Override
    public void mover(Graphics g, String direccion) {
    switch(direccion) {
    case "arriba": 
    y[0] -= 5; y[1] -= 5; y[2] -= 5; y[3] -= 5; 
    break;
    case "abajo": 
    y[0] += 5; y[1] += 5; y[2] += 5; y[3] += 5; 
    break;
    case "izquierda": 
    x[0] -= 5; x[1] -= 5; x[2] -= 5; x[3] -= 5; 
    break;
    case "derecha": 
    x[0] += 5; x[1] += 5; x[2] += 5; x[3] += 5; 
    break;
    }
    this.dibujar(g);
}

    
}


    

