import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
/**
 * Write a description of class pacmantoright here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pacman extends Actor
{
    GifImage rightGif = new GifImage("right.gif");
    /**
     * Act - do whatever the pacmantoright wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act() 
    {
        setImage (rightGif.getCurrentImage());
        if(Greenfoot.isKeyDown("right")){
            setRotation(0);
            move(1);
        }
        if(Greenfoot.isKeyDown("left")){
            setRotation(180);
            move(1);
        }
        if(Greenfoot.isKeyDown("up")){
            setRotation(270);
            move(1);
        }
        if(Greenfoot.isKeyDown("down")){
            setRotation(90);
            move(1);
        }
        
        /**
         * if(getIntersectingObjects(Wall.class) == null){
            setLocation(getX(),-10 + getY());|}
         */
    } 
} 