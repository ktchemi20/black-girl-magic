import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wall2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wall2 extends Actor
{
    /**
     * Act - do whatever the Wall2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage wall2;
    public Wall2(int width, int height) 
    {
        wall2 = new GreenfootImage(width,height);
        wall2.setColor(Color.BLACK);
        wall2.fillRect(0,0,width,height);
        
        setImage(wall2);
    }    
}
