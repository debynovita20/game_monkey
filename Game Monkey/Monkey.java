import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Monkey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monkey extends Objek
{
    /**
     * Act - do whatever the Monkey wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveMonkey();
        objectDisappear();
    }
    public void objectDisappear()
    {
        if (canSee(Banana.class))
        {
            eat(Banana.class);
((Counter)getWorld().getObjects(Counter.class).get(0)).Counting(10);
            Greenfoot.playSound("score.wav");
        }
    }
    public void moveMonkey()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            move(-7);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            move(7);
        }
    {
        // Add your action code here.
    }  
}
}
