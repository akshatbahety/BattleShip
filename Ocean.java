
package battleship;

import java.util.Random;

/**
 *
 * @author Akshat Bahety
 */
class Ocean {
    
    
    Ship[][] ships = new Ship[20][20];
    int shotsFired;
    int hitCount;
    int shipsSunk;
    
    Ocean()
    {
        shotsFired = 0;
        hitCount = 0;
        shipsSunk = 0;
    }
    
    void placeAllShipsRandomnly()
    {
        
        Random rand = new Random();
        
        int r = rand.nextInt((19 - 0) + 1) + 0; //Random number between 19 & 0
        int c = rand.nextInt((19 - 0) + 1) + 0;
        
        
        BattleShip bs = new BattleShip();
        int check = bs.getLength() - 1;
        
        while(check  > 0)
        {
            if(isOccupied(r,c))
            {
                break;
            }
            else
            {
                
                
                
                check--;
            }
            
            
        }
        
        
    }
    
    boolean isOccupied(int row, int coloumn)
    {
        if(ships[row][coloumn] == null)
        {
            return true;
        }
        return false;
    }
            
    boolean shootAt(int row, int coloumn)
    {
    
        
        return false;
    }
    
    int getShotsFired()
    {
    
        
        return -1;
    }
    
    int getHitCount()
    {
        
        
        return -1;
    }
                  
    int getShipsSunk()
    {
        
        return -1;
    }
    
    boolean isGameOver()
    {
        
        
        return false;
    }
    
    Ship[][] getShipArray()
    {
       
        
        
        
    }
    
    void print()
    {
        
    }
    
            
    
}
