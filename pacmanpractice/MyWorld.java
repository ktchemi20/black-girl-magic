import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
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
        super(600, 400, 1); 
        new animatedGif();
    }
    
    public class animatedGif extends JFrame{
        public animatedGif(){
        Icon imgIcon = new ImageIcon("https://raw.githubusercontent.com/Gaspared/Pacman/master/images/right.gif");
        setSize(200,200);
        setVisible (true);
    }
    }
}
