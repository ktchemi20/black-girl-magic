import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class pacmantoright here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ghost extends Actor
{
    GifImage ghostGif = new GifImage("ghost.gif");
    /**
     * Act - do whatever the pacmantoright wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        setImage (ghostGif.getCurrentImage());
        if(getOneObjectAtOffset(0,-10,Wall.class) == null){
            setLocation(getX(), -10 + getY());
        }
    }    
}
