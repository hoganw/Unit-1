import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.time.LocalDateTime;
import java.awt.Color;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    private Clock clockLabel = new Clock();
    private Date dateLabel = new Date();
    private LocalDateTime clock = LocalDateTime.now();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        clockLabel.setTextFont("Comic Sans MS", 1, 40);
        clockLabel.setTextColor(Color.BLUE);
        addObject(clockLabel, 50, 50);
        addObject(dateLabel, 500, 50);
        
        Greenfoot.start();
    }
    
    public void act()
    {
        
    }
    
}
