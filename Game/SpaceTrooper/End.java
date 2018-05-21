import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class End here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class End extends World
{

    /**
     * Constructor for objects of class End.
     * 
     */
    public End()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        siapSiap();
    }
    private void siapSiap()
    {
        GameOver over = new GameOver();
        addObject(over,300,150);
        Retry retry = new Retry();
        addObject(retry,300,300);
    }
}
