import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldInfo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldInfo extends World
{

    /**
     * Constructor for objects of class WorldInfo.
     * 
     */
    public WorldInfo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        siapSiap();
    }
    private void siapSiap()
    {
        Rocket roket = new Rocket();
        addObject(roket,300,350);
        IsiInfo info = new IsiInfo();
        addObject(info,300,150);
    }
}
