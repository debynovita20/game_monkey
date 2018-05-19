import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Paper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paper extends World
{

    /**
     * Constructor for objects of class Paper.
     * 
     */
    public Paper()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        BananaAppear();
        BomAppear();
        prepare();
    }
    public void act()
    {
        if (getObjects(Banana.class).isEmpty()) BananaAppear();
        if (getObjects(Bom.class).isEmpty()) BomAppear();
    }
    private void prepare()
    {
        Monkey monkey = new Monkey();
        addObject (monkey, 648, 403);
        Counter counter = new Counter();
        addObject(counter, 57, 69);
        skor skor = new skor();
        addObject(skor, 64, 44);
        skor.setLocation(59, 44);
        monkey.setLocation(280, 280);
    }
    public void BananaAppear()
    {
        if(Greenfoot.getRandomNumber(2) < 50)
        {
            addObject(new Banana(), Greenfoot.getRandomNumber(519),20);
        }
    }
    
    public void BomAppear()
    {
        if(Greenfoot.getRandomNumber(2) <50)
        {
            addObject(new Bom(), Greenfoot.getRandomNumber(519), 21);
        }
    }

}