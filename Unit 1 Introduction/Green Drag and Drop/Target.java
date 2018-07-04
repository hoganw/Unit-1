import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Target here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Target extends Actor
{
    boolean drop = false;
    /**
     * Act - do whatever the Target wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
            
            Source obj = (Source) getOneIntersectingObject(Source.class);
            if (obj != null & !drop) {
                System.out.println(obj);
                drop = true;
            }
            
            if (obj == null)
            {
                drop = false;
            }
            
           
    }    
}
