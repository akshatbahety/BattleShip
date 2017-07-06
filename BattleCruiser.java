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
public class BattleCruiser extends Ship {

    
    BattleCruiser ()
    {
        BattleCruiser  bc= new BattleCruiser();
        bc.setLength(7);
        bc.setHit(7);
    }
            
    
    
    @Override
    String getShipType() {
        return "battlecruiser";
    }
    
}
