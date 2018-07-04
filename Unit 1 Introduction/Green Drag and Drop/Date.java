import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
import java.time.LocalDateTime;
/**
 * Write a description of class Date here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Date extends Actor
{
    private GreenfootImage label;
    private String labelText = "";
    private int labelTextSize;
    private int labelTextStyle = 0;
    private String labelTextFont = "Arial";
    private Color labelColor = Color.BLACK;
    private Font labelFont = new Font(labelTextFont, labelTextStyle, labelTextSize);
    private LocalDateTime clock = LocalDateTime.now();
    
    public Date(String text, int textSize)
    {
        labelText = text;
        labelTextSize = textSize;
        
        updateLabel();
    }
    
    public Date()
    {
        labelText = getDate();
        labelTextSize = 20;
       // getDate();
        
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
    
   public String getDate()
    {
        clock = LocalDateTime.now();
        String mm = "" + clock.getMonthValue();
        String dd = "" + clock.getDayOfMonth();
        String yy = "" + clock.getYear();
        return "" + mm + "/" + dd + "/" + yy;
    }
    
    public String formatTime(int date)
    {
        return String.format("%02d", date);
    }
}
