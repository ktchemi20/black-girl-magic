import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Food1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Food1 extends Food
{
    /**
     * Act - do whatever the Food1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(getOneIntersectingObject(Pacman.class)!=null)
            {
                getWorld().removeObject(this);
            }
    }    
}
