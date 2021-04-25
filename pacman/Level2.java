import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{

    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 700, 1); 
        this.getBackground().scale(900,700);
        addObject(new Pacman(),469,316);
        
        addObject(new Wall(105,85),779,92);
        addObject(new Wall(55,350),807,350);
        addObject(new Wall(55,600),93,349);
        addObject(new Wall(900,5),450,3);
        addObject(new Wall(900,5),450,694);
        addObject(new Wall(5,695),890,345);
        addObject(new Wall(5,695),7,345);
        addObject(new Wall(230,85),556,92);
        addObject(new Wall(285,85),689,606);
        addObject(new Wall(70,350),691,350);
        addObject(new Wall(165,125),573,236);
        addObject(new Wall(215,40),279,70);
        addObject(new Wall(55,45),359,112);
        addObject(new Wall(110,225),443,538);
        addObject(new Wall(105,100),549,476);
        addObject(new Wall(215,40),227,628);
        addObject(new Wall(50,185),307,516);
        addObject(new Wall(50,185),199,471);
        addObject(new Wall(105,250),226,260);
        addObject(new Wall(265,40),466,363);
        addObject(new Wall(110,170),388,261);
        
        addObject(new Food1(),858,155);
        addObject(new Food1(),803,155);
        addObject(new Food1(),752,155);
        addObject(new Food1(),698,155);
        addObject(new Food1(),646,155);
        addObject(new Food1(),591,155);
        addObject(new Food1(),530,155);
        addObject(new Food1(),466,155);
        addObject(new Food1(),411,155);
        addObject(new Food1(),357,155);
        addObject(new Food1(),305,155);
        addObject(new Food1(),758,540);
        addObject(new Food1(),758,491);
        addObject(new Food1(),758,441);
        addObject(new Food1(),758,396);
        addObject(new Food1(),758,351);
        addObject(new Food1(),758,252);
        addObject(new Food1(),758,202);
        addObject(new Food1(),758,302);
        addObject(new Food1(),692,540);
        addObject(new Food1(),815,540);
        addObject(new Food1(),858,113);
        addObject(new Food1(),858,68);
        addObject(new Food1(),803,27);
        addObject(new Food1(),750,27);
        addObject(new Food1(),698,27);
        addObject(new Food1(),698,68);
        addObject(new Food1(),698,113);
        addObject(new Food1(),363,448);
        addObject(new Food1(),363,491);
        addObject(new Food1(),363,534);
        addObject(new Food1(),363,575);
        addObject(new Food1(),363,621);
        addObject(new Food1(),363,668);
        addObject(new Food1(),363,404);
        addObject(new Food1(),424,404);
        addObject(new Food1(),476,404);
        addObject(new Food1(),525,404);
        addObject(new Food1(),574,404);
        addObject(new Food1(),629,404);
        addObject(new Food1(),629,369);
        addObject(new Food1(),629,455);
        addObject(new Food1(),629,498);
        addObject(new Food1(),629,540);
        addObject(new Food1(),583,541);
        addObject(new Food1(),521,574);
        addObject(new Food1(),306,202);
        addObject(new Food1(),306,248);
        addObject(new Food1(),306,299);
        addObject(new Food1(),306,345);
        addObject(new Food1(),306,401);
        addObject(new Food1(),250,401);
        addObject(new Food1(),250,446);
        addObject(new Food1(),250,490);
        addObject(new Food1(),250,586);
        addObject(new Food1(),203,586);
        addObject(new Food1(),250,535);
        addObject(new Food1(),146,585);
        addObject(new Food1(),146,540);
        addObject(new Food1(),146,489);
        addObject(new Food1(),146,442);
        addObject(new Food1(),146,397);
        addObject(new Food1(),146,345);
        addObject(new Food1(),146,294);
        addObject(new Food1(),146,248);
        addObject(new Food1(),146,195);
        addObject(new Food1(),146,148);
        addObject(new Food1(),146,107);
        addObject(new Food1(),146,63);
        addObject(new Food1(),146,25);
        addObject(new Food1(),411,110);
        addObject(new Food1(),411,65);
        addObject(new Food1(),411,26);
        addObject(new Food1(),520,619);
        addObject(new Food1(),520,663);
        addObject(new Food1(),305,110);
        addObject(new Food1(),258,110);
        addObject(new Food1(),198,110);
        addObject(new Food1(),858,201);
        addObject(new Food1(),858,251);
        addObject(new Food1(),858,304);
        addObject(new Food1(),858,351);
        addObject(new Food1(),858,397);
        addObject(new Food1(),858,438);
        addObject(new Food1(),858,484);
        addObject(new Food1(),858,539);
        addObject(new Food1(),858,589);
        addObject(new Food1(),858,634);
        addObject(new Food1(),88,25);
        addObject(new Food1(),88,671);
        addObject(new Food1(),35,62);
        addObject(new Food1(),35,106);
        addObject(new Food1(),35,147);
        addObject(new Food1(),35,194);
        addObject(new Food1(),35,246);
        addObject(new Food1(),35,295);
        addObject(new Food1(),35,395);
        addObject(new Food1(),35,439);
        addObject(new Food1(),35,489);
        addObject(new Food1(),35,588);
        addObject(new Food1(),35,634);
        addObject(new Food1(),35,344);
        addObject(new Food1(),35,539);
        addObject(new Food1(),646,28);
        addObject(new Food1(),594,28);
        addObject(new Food1(),473,28);
        addObject(new Food1(),353,28);
        addObject(new Food1(),302,28);
        addObject(new Food1(),252,28);
        addObject(new Food1(),200,28);
        addObject(new Food1(),538,28);
        addObject(new Food1(),819,672);
        addObject(new Food1(),766,672);
        addObject(new Food1(),704,672);
        addObject(new Food1(),636,672);
        addObject(new Food1(),581,672);
        addObject(new Food1(),462,672);
        addObject(new Food1(),413,672);
        addObject(new Food1(),301,672);
        addObject(new Food1(),256,672);
        addObject(new Food1(),204,672);
        addObject(new Food1(),149,672);
        
        addObject(new Food2(),855,668);
        addObject(new Food2(),855,28);
        addObject(new Food2(),37,668);
        addObject(new Food2(),37,28);
        
    }
}
