import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Awal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Awal extends World
{

    /**
     * Constructor for objects of class Awal.
     * 
     */
    
    
    public Awal()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        siapSiap();
    }
    private void siapSiap()
    {
        Start start = new Start();
        addObject(start,300,100);
    }
}