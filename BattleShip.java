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
public class BattleShip extends Ship {

    
    BattleShip()
    {
        BattleShip bs = new BattleShip();
        bs.setLength(8);
        bs.setHit(8);    
    }
    
    
   
    
    
    @Override
    String getShipType() {
        
      
        return "battleship";
        
    }

    
    
}
