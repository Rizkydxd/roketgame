import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public Rocketship rocket=new Rocketship();
    private int jeda=0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(rocket,getWidth()/6,getHeight()/2);
    }
    public void act()
    {
        if(jeda>0)jeda--;
        else jeda=20;
        if(jeda==1)
        {
            int py=Greenfoot.getRandomNumber(getHeight());
            addObject(new Asteroid(-(2+Greenfoot.getRandomNumber(3))),getWidth()+200,py);
        }
    }
}
