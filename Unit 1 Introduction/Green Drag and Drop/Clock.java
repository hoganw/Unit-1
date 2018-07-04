import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
import java.time.LocalDateTime;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
/**
 * Write a description of class Clock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Clock extends Actor
{
    private GreenfootImage label;
    private String labelText = "";
    private int labelTextSize;
    private int labelTextStyle = 0;
    private String labelTextFont = "Arial";
    private Color labelColor = Color.BLACK;
    private Font labelFont = new Font(labelTextFont, labelTextStyle, labelTextSize);
    private LocalDateTime clock = LocalDateTime.now();
    
    public Clock(String text, int textSize)
    {
        labelText = text;
        labelTextSize = textSize;
        
        updateLabel();
    }
    
    public Clock()
    {
        labelText = "" + LocalDateTime.now();
        labelTextSize = 20;
        
        updateLabel();
    }
    
    /**
     * sets the color of the label's text
     * @param color is of type color Color(int red, int green, int blue).
     */
    public void setTextColor(Color color)
    {
        label.clear();
        labelColor = color;
        updateLabel();
    }
    
    /**
     * sets the font and style.
     * @param style is the font and style for the label Font(String fontName, boolean bold, boolean italicize, int size).
     */
    public void setTextFont(String font, int fontStyle, int fontSize)
    {
        labelTextSize = fontSize;
        labelTextStyle = fontStyle;
        labelTextFont = font;
        label.clear();
        label.setFont(new Font(labelTextFont, labelTextStyle, labelTextSize));
        updateLabel();
    }
    
    public String toString()
    {
        return labelText;
    }
    
    public void setText(String text)
    {
        label.clear();
        labelText = text;
        updateLabel();
    }
    
    public void updateLabel()
    {
        
        label = new GreenfootImage((labelText.length()+1)*labelTextSize, labelTextSize + (labelTextSize/4));
       
        label.setFont(new Font(labelTextFont, labelTextStyle, labelTextSize));
        label.setColor(labelColor);
        label.drawString(labelText,labelText.length()*(labelTextSize/2), labelTextSize);
        
        setImage(label);
    }
    
   public void act()
    {
        clock = LocalDateTime.now();
        //String mm = formatTime(clock.getMinute());
       //String ss = formatTime(clock.getSecond());
        //setText("" + clock.getHour() + ":" + mm + ":" + ss);
        setText(formatTime());
    }
    
    public String formatTime()
    {
        //SimpleDateFormat sdfTime = new SimpleDateFormat("hh:mm:ss");
        return clock.format(DateTimeFormatter.ofPattern("h:mm:ss"));
    }
}
