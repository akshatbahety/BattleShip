/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

/**
 *
 * @author Akshat Bahety
 */
public class Submarine extends Ship {

    Submarine()
    {
        Submarine s = new Submarine();
        s.setLength(3);
        s.setHit(3);
    }
    
    
    @Override
    String getShipType() {
        return "submarine";
    }
    
}
