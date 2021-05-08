import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
/**
 * Write a description of class CounterBinary1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BinaryCounter extends Actor
{
    public String binaryScore = "";
    /**
     * Act - do whatever the CounterBinary1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(new GreenfootImage("Binary Score: " + binaryScore, 20,Color.WHITE, Color.BLACK));
    }    
    
    public void bAddScore(int score){
        
        while(score > 0){
            binaryScore = "" + (score % 2) + binaryScore;
            score /= 2;
        }
        //return binaryScore;
         
       
        //System.out.println(Integer.toBinaryString(score));
    
    }
}
