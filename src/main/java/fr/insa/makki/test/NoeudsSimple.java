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
public class NoeudsSimple extends Noeuds {

    public NoeudsSimple(int ind, double px, double py, double ForceX, double ForceY) {
        super(ind, px, py, ForceX, ForceY);
    }

    public NoeudsSimple(double px, double py, double ForceX, double ForceY) {
        super(px, py, ForceX, ForceY);
    }

    public NoeudsSimple(double px, double py) {
        super(px, py);
    }
    

}
