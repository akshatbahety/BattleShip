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
public class EmptySea extends Ship {

    
    @Override
boolean shootAt(int row, int column)
{
    return false;
}
    
@Override 
boolean isSunk()
{
    return false;
}
    
@Override
public String toString()
{
    return "unoccupied";
}
    @Override
    String getShipType() {
        return "empty";
    }
    
        
    
    
}
