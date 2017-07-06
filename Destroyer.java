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
public class Destroyer extends Ship {

    
    Destroyer()
    {
        Destroyer d = new Destroyer();
        d.setLength(4);
        d.setHit(4);
    }
    
    
    @Override
    String getShipType() {
        return "destroyer";
    }
    
    
}
