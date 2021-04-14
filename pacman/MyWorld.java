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
        addObject(new Wall(96,35),129,160);
        addObject(new Wall(96,35),769,158);
        addObject(new Wall(35,96),449,55);
        addObject(new Wall(180,90),91,260);
        addObject(new Wall(180,90),87,395);
        addObject(new Wall(180,90),810,260);
        addObject(new Wall(180,90),809,395);
        addObject(new Wall(20,265),10,572);
        addObject(new Wall(20,265),890,572);
        addObject(new Wall(20,220),11,105);
        addObject(new Wall(20,220),890,105);
        addObject(new Wall(860,20),450,8);
        addObject(new Wall(860,20),450,691);
        addObject(new Wall(65,25),52,565);
        addObject(new Wall(65,25),848,565);
        addObject(new Wall(30,155),258,227);
        addObject(new Wall(30,155),641,227);
        addObject(new Wall(220,25),450,158);
        addObject(new Wall(35,70),448,205);
        addObject(new Wall(95,30),320,228);
        addObject(new Wall(95,30),579,228);
        addObject(new Wall(130,25),305,497);
        addObject(new Wall(290,25),225,632);
        addObject(new Wall(100,25),129,498);
        addObject(new Wall(230,25),448,565);
        addObject(new Wall(35,80),161,538);
        addObject(new Wall(35,80),257,592);
        addObject(new Wall(35,80),449,605);
        addObject(new Wall(35,80),449,471);
        addObject(new Wall(230,25),448,430);
        addObject(new Wall(130,25),594,497);
        addObject(new Wall(35,95),257,394);
        addObject(new Wall(35,95),641,396);
        addObject(new Wall(35,95),257,394);
        addObject(new Wall(35,95),641,396);
        addObject(new Wall(35,80),641,593);
        addObject(new Wall(290,25),673,631);
        addObject(new Wall(100,25),767,497);
        addObject(new Wall(35,80),735,534);
        addObject(new Wall(74,25),522,290);
        addObject(new Wall(74,24),378,291);
        addObject(new Wall(35,86),542,326);
        addObject(new Wall(40,86),358,330);
        addObject(new Wall(220,25),451,359);
    }

}

