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
        BananaAppear();//method BananaAppear
        prepare();//method prepare
        BomAppear();//method BomAppear
    }
    public void act()//method act
    {
        if (getObjects(Banana.class).isEmpty()) BananaAppear();
        if (getObjects(Bom.class).isEmpty()) BomAppear();
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
        monkey.setLocation(300, 350);
    }
    public void BananaAppear() //method BananaAppear
    {
        if(Greenfoot.getRandomNumber(2) < 50)
        {
            addObject(new Banana(),
Greenfoot.getRandomNumber(519),20);
        }
    }
    
    public void BomAppear() //method BomAppear
    {
        if(Greenfoot.getRandomNumber(2) <50)
        {
            addObject(new Bom(),
Greenfoot.getRandomNumber(519), 21);
        }
    }
}
