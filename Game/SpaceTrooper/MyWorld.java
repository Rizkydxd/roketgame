import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Awal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class Awal.
     * 
     */

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        siapSiap();
        prepare();
    }


    private void siapSiap()
    {
        Start start = new Start();
        addObject(start,300,100);
        Info info = new Info();
        addObject(info,300,250);
        Rocket roket = new Rocket();
        addObject(roket,150,150);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}