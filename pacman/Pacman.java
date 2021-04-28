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
        boolean isMove = false;
        int angle = 0;
        Actor food1 = getOneIntersectingObject(Food1.class);
        Actor food2 = getOneIntersectingObject(Food2.class);
        Actor food3 = getOneIntersectingObject(Food3.class);
        Actor food4 = getOneIntersectingObject(Food4.class);
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
        int width = rightGif.getCurrentImage().getWidth();
        int height = rightGif.getCurrentImage().getHeight();
        if (isMove && getOneObjectAtOffset(width * (int)Math.cos(Math.toRadians(angle)),height * (int)Math.sin(Math.toRadians(angle)), Wall.class) == null){
            setRotation(angle);
            move(2);
        }
        if(food1!=null){
            World myWorld = getWorld();
            myWorld.removeObject(food1);
            Level1 level1 = (Level1)myWorld;
            Counter counter = level1.getCounter();
            counter.addScore();
        } 
        if(food2!=null){
            World myWorld = getWorld();
            myWorld.removeObject(food2);
            Level1 level1 = (Level1)myWorld;
            Counter counter = level1.getCounter();
            counter.addScore();
        } 
        if(food3!=null){
            World myWorld = getWorld();
            myWorld.removeObject(food3);
            Level2 level2 = (Level2)myWorld;
            Counter2 counter2 = level2.getCounter();
            counter2.addScore();
        } 
        if(food4!=null){
            World myWorld = getWorld();
            myWorld.removeObject(food4);
            Level2 level2 = (Level2)myWorld;
            Counter2 counter2 = level2.getCounter();
            counter2.addScore();
        } 
    }
}

   
