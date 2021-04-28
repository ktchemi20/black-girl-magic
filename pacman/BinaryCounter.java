import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BinaryCounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BinaryCounter extends Counter
{
    private String binaryScore = "";
    /**
     * Act - do whatever the BinaryCounter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(new GreenfootImage("Binary Score: " + binaryScore, 20,Color.WHITE, Color.BLACK));
    }

    public void bAddScore(){
        while(score > 0){
            binaryScore = "" + (score % 2) + binaryScore;
            score /= 2;
        }
        //return binaryScore;
    }

}    
