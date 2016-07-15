/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author kamillus
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle a = new Vehicle(0, 1);
        Vehicle b = new Vehicle(1, 5);
        Vehicle c = new Vehicle(1, 20);
        Vehicle d = new Vehicle(0, 5);
        
        
        a.move();
        a.move();
        b.move();
        a.move();
        c.move();
        c.move();
        a.move();
    }
    
}
