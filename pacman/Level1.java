import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    Counter counter = new Counter();
    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level1()
    {   
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 700, 1);
        this.getBackground().scale(900,700);
        addObject(new Pacman(),449,532);

        addObject(new Wall(95,45),129,80);
        addObject(new Wall(95,45),768,80);
        addObject(new Wall(130,45),305,80);
        addObject(new Wall(130,45),593,80);
        addObject(new Wall(96,35),129,160);
        addObject(new Wall(96,35),769,158);
        addObject(new Wall(35,96),449,55);
        addObject(new Wall(180,90),91,260);
        addObject(new Wall(180,90),87,395);
        addObject(new Wall(180,90),810,260);
        addObject(new Wall(180,90),809,395);
        addObject(new Wall(20,265),10,572);
        addObject(new Wall(20,265),890,572);
        addObject(new Wall(20,220),11,105);
        addObject(new Wall(20,220),890,105);
        addObject(new Wall(860,20),450,8);
        addObject(new Wall(860,20),450,691);
        addObject(new Wall(65,25),52,565);
        addObject(new Wall(65,25),848,565);
        addObject(new Wall(30,155),258,227);
        addObject(new Wall(30,155),641,227);
        addObject(new Wall(220,25),450,158);
        addObject(new Wall(35,70),448,205);
        addObject(new Wall(95,30),320,228);
        addObject(new Wall(95,30),579,228);
        addObject(new Wall(130,25),305,497);
        addObject(new Wall(290,25),225,632);
        addObject(new Wall(100,25),129,498);
        addObject(new Wall(230,25),448,565);
        addObject(new Wall(35,80),161,538);
        addObject(new Wall(35,80),257,592);
        addObject(new Wall(35,80),449,605);
        addObject(new Wall(35,80),449,471);
        addObject(new Wall(230,25),448,430);
        addObject(new Wall(130,25),594,497);
        addObject(new Wall(35,95),257,394);
        addObject(new Wall(35,95),641,396);
        addObject(new Wall(35,95),257,394);
        addObject(new Wall(35,95),641,396);
        addObject(new Wall(35,80),641,593);
        addObject(new Wall(290,25),673,631);
        addObject(new Wall(100,25),767,497);
        addObject(new Wall(35,80),735,534);
        addObject(new Wall(74,25),522,290);
        addObject(new Wall(74,24),378,291);
        addObject(new Wall(35,86),542,326);
        addObject(new Wall(40,86),358,330);
        addObject(new Wall(220,25),451,359);
        
       

        addObject(new Food1(),401,234);
        addObject(new Food1(),401,194);
        addObject(new Food1(),349,194);
        addObject(new Food1(),301,194);
        addObject(new Food1(),301,158);
        addObject(new Food1(),301,124);
        addObject(new Food1(),347,124);
        addObject(new Food1(),398,124);
        addObject(new Food1(),398,75);
        addObject(new Food1(),39,629);
        addObject(new Food1(),39,594);
        addObject(new Food1(),103,594);
        addObject(new Food1(),99,535);
        addObject(new Food1(),39,535);
        addObject(new Food1(),39,491);
        addObject(new Food1(),100,463);
        addObject(new Food1(),159,463);
        addObject(new Food1(),255,124);
        addObject(new Food1(),255,327);
        addObject(new Food1(),255,463);
        addObject(new Food1(),255,529);
        addObject(new Food1(),394,461);
        addObject(new Food1(),344,461);
        addObject(new Food1(),302,461);
        addObject(new Food1(),642,331);
        addObject(new Food1(),642,461);
        addObject(new Food1(),642,526);
        addObject(new Food1(),587,571);
        addObject(new Food1(),541,596);
        addObject(new Food1(),493,597);
        addObject(new Food1(),493,628);
        addObject(new Food1(),801,663);
        addObject(new Food1(),495,663);
        addObject(new Food1(),448,663);
        addObject(new Food1(),400,663);
        addObject(new Food1(),334,663);
        addObject(new Food1(),278,663);
        addObject(new Food1(),222,663);
        addObject(new Food1(),165,663);
        addObject(new Food1(),112,663);
        addObject(new Food1(),70,663);
        addObject(new Food1(),400,628);
        addObject(new Food1(),400,597);
        addObject(new Food1(),305,571);
        addObject(new Food1(),305,529);
        addObject(new Food1(),349,529);
        addObject(new Food1(),399,529);
        addObject(new Food1(),695,526);
        addObject(new Food1(),695,572);
        addObject(new Food1(),753,595);
        addObject(new Food1(),801,596);
        addObject(new Food1(),852,597);
        addObject(new Food1(),852,629);
        addObject(new Food1(),749,462);
        addObject(new Food1(),800,462);
        addObject(new Food1(),852,462);
        addObject(new Food1(),852,531);
        addObject(new Food1(),799,532);
        addObject(new Food1(),851,120);
        addObject(new Food1(),851,161);
        addObject(new Food1(),806,121);
        addObject(new Food1(),756,121);
        addObject(new Food1(),636,36);
        addObject(new Food1(),757,192);
        addObject(new Food1(),525,36);
        addObject(new Food1(),525,120);
        addObject(new Food1(),637,122);
        addObject(new Food1(),493,75);
        addObject(new Food1(),165,597);
        addObject(new Food1(),208,571);
        addObject(new Food1(),208,529);
        addObject(new Food1(),208,385);
        addObject(new Food1(),208,329);
        addObject(new Food1(),208,269);
        addObject(new Food1(),208,213);
        addObject(new Food1(),208,160);
        addObject(new Food1(),208,85);
        addObject(new Food1(),208,36);
        addObject(new Food1(),808,192);
        addObject(new Food1(),581,120);
        addObject(new Food1(),692,35);
        addObject(new Food1(),692,85);
        addObject(new Food1(),692,159);
        addObject(new Food1(),692,226);
        addObject(new Food1(),692,280);
        addObject(new Food1(),692,333);
        addObject(new Food1(),692,389);
        addObject(new Food1(),692,441);
        addObject(new Food1(),586,159);
        addObject(new Food1(),586,194);
        addObject(new Food1(),536,194);
        addObject(new Food1(),491,194);
        addObject(new Food1(),491,234);
        addObject(new Food1(),587,461);
        addObject(new Food1(),539,461);
        addObject(new Food1(),488,461);
        addObject(new Food1(),488,528);
        addObject(new Food1(),538,528);
        addObject(new Food1(),587,528);
        addObject(new Food1(),708,663);
        addObject(new Food1(),758,663);
        addObject(new Food1(),654,663);
        addObject(new Food1(),599,663);
        addObject(new Food1(),759,663);
        addObject(new Food1(),851,71);
        addObject(new Food1(),804,36);
        addObject(new Food1(),756,36);
        addObject(new Food1(),636,36);
        addObject(new Food1(),578,36);
        addObject(new Food1(),525,36);
        addObject(new Food1(),495,120);
        addObject(new Food1(),302,422);
        addObject(new Food1(),587,419);
        addObject(new Food1(),154,197);
        addObject(new Food1(),97,197);
        addObject(new Food1(),43,161);
        addObject(new Food1(),43,123);
        addObject(new Food1(),43,76);
        addObject(new Food1(),97,34);
        addObject(new Food1(),148,34);
        addObject(new Food1(),363,34);
        addObject(new Food1(),315,34);
        addObject(new Food1(),263,34);
        addObject(new Food1(),97,124);
        addObject(new Food1(),153,124);
        addObject(new Food1(),207,463);
        addObject(new Food1(),547,663);
        addObject(new Food1(),350,594);
        addObject(new Food1(),852,494);
        
        
        addObject(new Food2(),850,460);
        addObject(new Food2(),40,460);
        addObject(new Food2(),40,194);
        addObject(new Food2(),850,192);
        addObject(new Food2(),853,663);
        addObject(new Food2(),853,36);
        addObject(new Food2(),39,663);
        addObject(new Food2(),43,36);
        
        addObject(counter,81, 260);
        
    }
    
    public Counter getCounter(){
        return counter;
    }
}

