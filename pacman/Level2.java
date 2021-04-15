import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{

    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 700, 1); 
        this.getBackground().scale(900,700);
        addObject(new Pacman(),469,316);
        
        addObject(new Wall(105,85),779,92);
        addObject(new Wall(55,350),807,350);
        addObject(new Wall(55,600),93,349);
        addObject(new Wall(900,5),450,3);
        addObject(new Wall(900,5),450,694);
        addObject(new Wall(5,695),890,345);
        addObject(new Wall(5,695),7,345);
        addObject(new Wall(230,85),556,92);
        addObject(new Wall(285,85),689,606);
        addObject(new Wall(70,350),691,350);
        addObject(new Wall(165,125),573,236);
        addObject(new Wall(215,40),279,70);
        addObject(new Wall(55,45),359,112);
        addObject(new Wall(110,225),443,538);
        addObject(new Wall(105,100),549,476);
        addObject(new Wall(215,40),227,628);
        addObject(new Wall(50,185),307,516);
        addObject(new Wall(50,185),199,471);
        addObject(new Wall(105,250),226,260);
        addObject(new Wall(265,40),466,363);
        addObject(new Wall(110,170),388,261);
    }
}
