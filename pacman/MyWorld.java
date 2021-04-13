import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 700, 1);
        this.getBackground().scale(900,700);
        addObject(new Wall(95,45),129,80);
        addObject(new Wall(95,45),768,80);
        addObject(new Wall(130,45),305,80);
        addObject(new Wall(130,45),593,80);
    }

}

