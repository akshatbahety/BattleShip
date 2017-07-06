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
public class Cruiser extends Ship {

    Cruiser()
    {
        Cruiser c = new Cruiser();
        c.setLength(6);
        c.setHit(6);
    }
    
    
    
    @Override
            
    String getShipType() {
        return "cruiser";
                
    }
    
}
