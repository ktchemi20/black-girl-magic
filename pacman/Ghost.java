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
        //setImage (ghostGif.getCurrentImage());
        //if(getOneObjectAtOffset(0,-10,Wall.class)== null){
          //  setLocation(getX(),-10 + getY());
        setImage (ghostGif.getCurrentImage());
        boolean isMove = false;
        int angle = 0;
        
        if(Greenfoot.isKeyDown("right")){
            angle = 0;
            isMove = true;
        } else if(Greenfoot.isKeyDown("left")){
            angle = 180;
            isMove = true;
        } else if(Greenfoot.isKeyDown("up")){
            angle = 270;
            isMove = true;
        } else if(Greenfoot.isKeyDown("down")){
            angle = 90;
            isMove = true;
        } 
        int width = ghostGif.getCurrentImage().getWidth();
        int height = ghostGif.getCurrentImage().getHeight();
        if (isMove && getOneObjectAtOffset(width * (int)Math.cos(Math.toRadians(angle)),height * (int)Math.sin(Math.toRadians(angle)), Wall.class) == null){
            setRotation(angle);
            move(1);
        }
       }
    
}