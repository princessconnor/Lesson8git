
import java.net.URL;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author conn6070
 */
public class Die {
   
    private ImageIcon pic;
    private int value; 
    public Die()
    {
        value = 1;
        URL file = getClass().getResource("d1.jpg");
        pic = new ImageIcon(file);
    }
    
  
    
    public void roll()
    {
        value = (int)(Math.random()*6)+1;
        URL file = getClass().getResource("d" + value + ".jpg");
        pic = new ImageIcon(file);
    }
    
    public ImageIcon getPic()
    {
        return pic;
    } 
      public int getValue()
    {
        return value;
    }
}
