import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bom extends Objek
{
    /**
     * Act - do whatever the Bom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        {
            setLocation(getX(), getY()+5);
            Boming();
        }
    }
    public void Boming()
    {
        if (canSee(Monkey.class))
        {
((Counter)getWorld().getObjects(Counter.class).get(0)).Counting(-1);
            Greenfoot.playSound("boom.wav");
        }
        if (atWorldEdge())
        {
            getWorld().removeObject(this);
        }
        // Add your action code here.
    }    
}