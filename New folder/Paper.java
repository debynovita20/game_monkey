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
        bananaAppear();//method bananaAppear
        prepare();//method prepare
        bomAppear();//method bomAppear
    }
    public void act()//method act
    {
        if (getObjects(banana.class).isEmpty()) bananaAppear();
        if (getObjects(bom.class).isEmpty()) bomAppear();
    }
    private void prepare()//method prepare untuk menentukan posisi dari kelas objek masing-masing
    {
        Monkey monkey = new Monkey();
        addObject (monkey, 648, 403);
        Counter counter = new Counter();
        addObject(counter, 57, 69);
        Score score = new Score();
        addObject(score, 64, 44);
        score.setLocation(59, 44);
        monkey.setLocation(373, 403);
    }
    public void bananaAppear() //method bananaAppear
    {
        if(Greenfoot.getRandomNumber(2) < 50)
        {
            addObject(new banana(),
Greenfoot.getRandomNumber(519),20);
        }
    }
    
    public void bomAppear() //method bomAppear
    {
        if(Greenfoot.getRandomNumber(2) <50)
        {
            addObject(new bom(),
Greenfoot.getRandomNumber(519), 21);
        }
    }
}
