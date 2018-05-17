import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocketship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocketship extends Actor
{
    /**
     * Act - do whatever the Rocketship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //kode aksi
        //aksi gerak
        checkKeyPress();
        //check hit roketnya
        if(checkHit())
        {
            getWorld().removeObject(this);
            Greenfoot.setWorld(new End());
        }
    }    
    private boolean checkHit()
    {
        if(isTouching(Asteroid.class))
        {
            return true;
        }
        return false;
    }
    private void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("up")) 
        {
            setLocation(getX(), getY()-3);
        }

        if (Greenfoot.isKeyDown("down")) 
        {
            setLocation(getX(), getY()+3);
        }
        if (Greenfoot.isKeyDown("left")) 
        {
            setLocation(getX()-3, getY());
        }

        if (Greenfoot.isKeyDown("right")) 
        {
            setLocation(getX()+3, getY());
        }

    }
}
