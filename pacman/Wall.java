import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wall extends Actor
{
    /**
     * Act - do whatever the Wall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage wall;
    public Wall(int width, int height){
        wall = new GreenfootImage(width,height);
        wall.setColor(Color.RED);
        wall.fillRect(0,0,width,height);
        wall.setTransparency(0);
        setImage(wall);
    }
    public void act(){}
    } 