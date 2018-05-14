import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class banana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class banana extends Objek
{
    /**
     * Act - do whatever the banana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer=0;
    public void act() 
    {
        setLocation(getX(), getY()+6);
        BananaFall();
        // Add your action code here.
    }  
    public void BananaFall()
    {
        if (atWorldEdge())
        {
            getWorld().removeObject(this);
            Greenfoot.playSound("bananafall.wav");
        }
    }
}
