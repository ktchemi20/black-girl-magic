import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter2 extends Actor
{   
    int score = 0;
    /**
     * Act - do whatever the Counter2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       setImage(new GreenfootImage("Score: " + score, 24,Color.WHITE, Color.BLACK)); 
    }    
    
    public void addScore(){
        score += 10;
    }
}
