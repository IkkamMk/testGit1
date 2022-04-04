/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.makki.test;

/**
 *
 * @author amakki01
 */
public abstract class Noeuds  {
    private int ind;
    private double px;
    private double py;
    private double ForceX ; //QUERGHUTGBQHN
    private double ForceY ;

    public Noeuds(int ind, double px, double py, double ForceX, double ForceY) {
        this.ind = ind;
        this.px = px;
        this.py = py;
        this.ForceX = ForceX;
        this.ForceY = ForceY;
    }

    public Noeuds(double px, double py, double ForceX, double ForceY) {
        this(-1, px, py, ForceX, ForceY);
    }
    
    
    public Noeuds( double px, double py) {
        this(-1, px, py, 0, 0);
    }
   
    

    @Override
    public String toString() {
        return "Le noeud numéro  :" + ind + " en position [ " + px + ";" + py + "]. La force appliqué est : [ " + ForceX + ";" + ForceY + ']';
    }
    
    
    
    public static Noeuds  entreNoeud () {
         System.out.println("Entrer un point");
         double x =Lire.d();
         double y=Lire.d();
         return new Noeuds(-1, x, y, 0, 0)  ;
        
    } 
    
    public static void main(String[] args){
     
        
    }
    
    
    
    
    
    
    
    
    
    public int getInd() {
        return ind;
    }

    public void setInd(int ind) {
        this.ind = ind;
    }

    public double getPx() {
        return px;
    }

    public void setPx(double px) {
        this.px = px;
    }

    public double getPy() {
        return py;
    }

    public void setPy(double py) {
        this.py = py;
    }

    public double getForceX() {
        return ForceX;
    }

    public void setForceX(double ForceX) {
        this.ForceX = ForceX;
    }

    public double getForceY() {
        return ForceY;
    }

    public void setForceY(double ForceY) {
        this.ForceY = ForceY;
    }

    
    
    
    
}
