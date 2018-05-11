import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Asteroid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asteroid extends Actor
{
    /**
     * Act - do whatever the Asteroid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int vx=0;
    private boolean toRemove=false;
    public Asteroid()
    {
        
    }
    public Asteroid(int v)
    {
        vx=v;
    }
    public void addedToWorld(World World)
    {
        setRotation(180);
    }
    public void move()
    {
        setLocation(getX()+vx,getY());
        if(getX()<-200)toRemove=true;
    }
    int asteroid_speed = -6;
    public void act() 
    {
        setLocation( getX() + asteroid_speed, getY());

        if(getX()<=20)
            getWorld().removeObject(this); 
    }    
}
