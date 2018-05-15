import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bom extends Objek
{
    /**
     * Act - do whatever the bom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), getY()+5);
        Bombing();
        // Add your action code here.
    }    
    public void Bombing()
    {
        if (canSee(Monkey.class))
        {
((Counter)getWorld().getObjects(Counter.cla).get(0)).Counting(-1);
            Greenfoot.playsound("boom.wav");
        }
        if (atWorldEdge())
        {
            getWorld().rremoveObject(this);
        }
    }
}
