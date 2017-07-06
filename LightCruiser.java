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
public class LightCruiser  extends Ship
{

    LightCruiser()
    {
        LightCruiser lc = new LightCruiser();
        lc.setLength(5);
        lc.setHit(5);
    }
    
    
    @Override
    String getShipType() {
        
        return "lightcruiser";
        
    }
    
}
