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
public abstract class Ship {
 
    
    private int bowRow = 19;
    private int bowColoumn = 19;
    private int length = 0;
    private boolean horizontal = false;
    private boolean[] hit;
    
    abstract String getShipType();
    
    boolean okToPlaceShipAt(int row, int column, boolean horizontal, Ocean ocean)
    {
        /**
         * To do your code here
         */
        
        
        
        
        return false;
    }
    
    void placeShipAt(int row, int column, boolean horizontal, Ocean ocean)
    {
        
    }
    
    boolean shootAt(int row, int column)
    {
        return false;
    }
    
    boolean isSunk()
    {
        
        return false;
    }
    
    @Override
public String toString()
{
    
    return "S";
}
    
    public int getBowRow() {
        return bowRow;
    }

    public void setBowRow(int bowRow) {
        this.bowRow = bowRow;
    }

    public int getBowColoumn() {
        return bowColoumn;
    }

    public void setBowColoumn(int bowColoumn) {
        this.bowColoumn = bowColoumn;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isHorizontal() {
        return horizontal;
    }

    public void setHorizontal(boolean horizontal) {
        this.horizontal = horizontal;
    }

    public boolean[] getHit() {
        return hit;
    }

    public void setHit(int i ) {
        this.hit = new boolean[i];
    }
    
    
    
}
