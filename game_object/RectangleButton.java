package game_object;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class RectangleButton extends Button {
	public static int h=0;
        private BufferedImage nen;
        public static int k=0;
      
	public RectangleButton(String text, int posX, int posY, int width, int height, int paddingTextX, int paddingTextY,
			Color bgColor) {
		super(text, posX, posY, width, height, paddingTextX, paddingTextY, bgColor);
	}

	@Override
	public boolean isInButton(int x, int y) {
		return (enabled && x >= posX && x <= posX + width && y >= posY && y <= posY + height);
	}
	
	@Override
	public void draw(Graphics g) {
            try {
                nen=ImageIO.read(new File("cmt.png"));
            } catch (IOException ex) {
                Logger.getLogger(RectangleButton.class.getName()).log(Level.SEVERE, null, ex);
            }
		if(enabled) {
                    
                    if(state==HOVER)
                    {k=1;
//                    g.drawImage(nen, -10, -80,500,300, null);
                        if(h==0)
                        {    
//                            g.drawImage(nen, 0, 0, 800,500,null);
                     g.drawImage(image, 0, 50,800,400 ,null);
                     h++; 
                           
                    }
                        else if(h==1)
                        {
                        try {
                                sleep(10);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(RectangleButton.class.getName()).log(Level.SEVERE, null, ex);
                            }  
                             g.drawImage(image2, 0, 50,800,400 ,null);
                             h++;
                           
                        }
                         else   if(h==2)
                        {
                          try {
                                sleep(10);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(RectangleButton.class.getName()).log(Level.SEVERE, null, ex);
                            }  
//                            g.drawImage(nen, 0, 0, 800,500,null);
                     g.drawImage(image3, 0, 50,800,400 ,null);
                     h++; 
                           
                    }  
                         else    if(h==3)
                        {
//                            g.drawImage(nen, 0, 0, 800,500,null);
                     g.drawImage(image4,  0, 50,800,400 ,null);
                     h++; 
                    try {
                                sleep(10);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(RectangleButton.class.getName()).log(Level.SEVERE, null, ex);
                            }       
                    }
                         else     if(h==4)
                        {
//                            g.drawImage(nen, 0, 0, 800,500,null);
                     g.drawImage(image5,0, 50,800,400 ,null);
                     h++; 
                        try {
                                sleep(10);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(RectangleButton.class.getName()).log(Level.SEVERE, null, ex);
                            }       
                    }
                        else       if(h==5)
                        {
//                            g.drawImage(nen, 0, 0, 800,500,null);
                     g.drawImage(image6, 0, 50,800,400 ,null);
                     h++; 
                        try {
                                sleep(10);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(RectangleButton.class.getName()).log(Level.SEVERE, null, ex);
                            }  
                        }
                            else    if(h==6)
                        {
//                            g.drawImage(nen, 0, 0, 800,500,null);
                     g.drawImage(image7, 0, 50,800,400 ,null);
                     h++; 
                  try {
                                sleep(10);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(RectangleButton.class.getName()).log(Level.SEVERE, null, ex);
                            } 
                        }
                    else if(h==7)
                        {
//                            g.drawImage(nen, 0, 0, 800,500,null);
                     g.drawImage(image8, 0, 50,800,400 ,null);
                     h++; 
                    try {
                                sleep(10);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(RectangleButton.class.getName()).log(Level.SEVERE, null, ex);
                            }  
                            }
                    else  if(h==8)
                        {
//                            g.drawImage(nen, 0, 0, 800,500,null);
                     g.drawImage(image9, 0, 50,800,400 ,null);
                     h++; 
                         try {
                                sleep(10);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(RectangleButton.class.getName()).log(Level.SEVERE, null, ex);
                            }    
                    }
                     else  if(h==9)
                        {
//                            g.drawImage(nen, 0, 0, 800,500,null);
                     g.drawImage(image10, 0, 50,800,400 ,null);
                     h++; 
                        try {
                                sleep(10);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(RectangleButton.class.getName()).log(Level.SEVERE, null, ex);
                            }   
                    }
                      else    if(h==10)
                        {
//                            g.drawImage(nen, 0, 0, 800,500,null);
                     g.drawImage(image11, 0, 50,800,400 ,null);
                     h++; 
                         try {
                                sleep(10);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(RectangleButton.class.getName()).log(Level.SEVERE, null, ex);
                            }   
                    }
                        else   if(h==11)
                        {
//                            g.drawImage(nen, 0, 0, 800,500,null);
                     g.drawImage(image12, 0, 50,800,400 ,null);
                     h++; 
                         try {
                                sleep(10);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(RectangleButton.class.getName()).log(Level.SEVERE, null, ex);
                            }   
                    }
                       else     if(h==12)
                        {
//                            g.drawImage(nen, 0, 0, 800,500,null);
                     g.drawImage(image13, 0, 50,800,400 ,null);
                     h++; 
                         try {
                                sleep(10);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(RectangleButton.class.getName()).log(Level.SEVERE, null, ex);
                            }  
                    }       
                         else   if(h==13)
                        {
//                            g.drawImage(nen, 0, 0, 800,500,null);
                     g.drawImage(image14,  0, 50,800,400 ,null);
                     h++; 
                         try {
                                sleep(10);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(RectangleButton.class.getName()).log(Level.SEVERE, null, ex);
                            }  
                    }
                         else    if(h==14)
                        {
//                            g.drawImage(nen, 0, 0, 800,500,null);
                     g.drawImage(image15,0, 50,800,400 ,null);
                     h++; 
                         try {
                                sleep(10);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(RectangleButton.class.getName()).log(Level.SEVERE, null, ex);
                            }  
                    }
                        else  if(h==15)
                        {
//                            g.drawImage(nen, 0, 0, 800,500,null);
                     g.drawImage(image16, 0, 50,800,400 ,null);
                     h++; 
                     try {
                                sleep(10);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(RectangleButton.class.getName()).log(Level.SEVERE, null, ex);
                            }      
                    }  
                        else   if(h==16)
                        {
//                            g.drawImage(nen, 0, 0, 800,500,null);
                     g.drawImage(image17,  0, 50,800,400 ,null);
                     h++; 
                       try {
                                sleep(10);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(RectangleButton.class.getName()).log(Level.SEVERE, null, ex);
                            }     
                    }
                       else     if(h==17)
                        {
//                            g.drawImage(nen, 0, 0, 800,500,null);
                     g.drawImage(image18,0, 50,800,400 ,null);
                     h++; 
                         try {
                                sleep(10);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(RectangleButton.class.getName()).log(Level.SEVERE, null, ex);
                            }     
                    }  
                         else if(h==18)
                        {
//                            g.drawImage(nen, 0, 0, 800,500,null);
                     g.drawImage(image19, 0, 50,800,400 ,null);
                     h=0; 
                       try {
                                sleep(10);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(RectangleButton.class.getName()).log(Level.SEVERE, null, ex);
                            }       
                    }
                      
//                         else  if(h==19)
//                        {
////                            g.drawImage(nen, 0, 0, 800,500,null);
//                     g.drawImage(image,  0, 100,800,400 ,null);
//                     h++; 
//                           
//                    }
//                         else if(h==21)
//                        {
////                            g.drawImage(nen, 0, 0, 800,500,null);
//                     g.drawImage(image20, 0, 100,800,400 ,null);
//                     h++; 
//                           
//                    }
//                          else   if(h==22)
//                        {
////                            g.drawImage(nen, 0, 0, 800,500,null);
//                     g.drawImage(image21,  0, 100,800,400 ,null);
//                     h++; 
//                          
//                    }
//                        else      if(h==23)
//                        {
////                            g.drawImage(nen, 0, 0, 800,500,null);
//                     g.drawImage(image22, 0, 100,800,400 ,null);
//                     h++; 
//                           
//                    }
//                     else     if(h==24)
//                        {
////                            g.drawImage(nen, 0, 0, 800,500,null);
//                     g.drawImage(image23,  0, 100,800,400 ,null);
//                     h++; 
//                           
//                    }
//                         else  if(h==25)
//                        {
////                            g.drawImage(nen, 0, 0, 800,500,null);
//                     g.drawImage(image24,  0, 100,800,400 ,null);
//                     h++; 
//                           
//                    }
//                         else   if(h==26)
//                        {
////                            g.drawImage(nen, 0, 0, 800,500,null);
//                     g.drawImage(image25,  0, 100,800,400 ,null);
//                     h++; 
//                           
//                    }
//                         else if(h==27)
//                        {
////                            g.drawImage(nen, 0, 0, 800,500,null);
//                     g.drawImage(image26,  0, 100,800,400 ,null);
//                     h++; 
//                            
//                    }
//                       else   if(h==28)
//                        {
////                            g.drawImage(nen, 0, 0, 800,500,null);
//                     g.drawImage(image27, 0, 100,800,400 ,null);
//                     h++; 
//                           
//                    }
//                      else    if(h==29)
//                        {
////                            g.drawImage(nen, 0, 0, 800,500,null);
//                     g.drawImage(image28, 0, 100,800,400 ,null);
//                     h++; 
//                            
//                    }
//                        else   if(h==30)
//                        {
////                            g.drawImage(nen, 0, 0, 800,500,null);
//                     g.drawImage(image29,  0, 100,800,400 ,null);
//                     h++; 
//                    }
//                       else     if(h==31)
//                        {
////                            g.drawImage(nen, 0, 0, 800,500,null);
//                     g.drawImage(image30,  0, 100,800,400 ,null);
//                     h++; 
//                           
//                    }
//                      else    if(h==32)
//                        {
////                            g.drawImage(nen, 0, 0, 800,500,null);
//                     g.drawImage(image31, 0, 100,800,400 ,null);
//                     h++; 
//                           
//                    }
//                       else    if(h==33)
//                        {
////                            g.drawImage(nen, 0, 0, 800,500,null);
//                     g.drawImage(image32,  0, 100,800,400 ,null);
//                     h++; 
//                           
//                    }
//                          else  if(h==34)
//                        {
////                            g.drawImage(nen, 0, 0, 800,500,null);
//                     g.drawImage(image33,  0, 100,800,400 ,null);
//                     h++; 
//                           
//                    }
//                          else   if(h==35)
//                        {
////                            g.drawImage(nen, 0, 0, 800,500,null);
//                     g.drawImage(image34,  0, 100,800,400 ,null);
//                     h++; 
//                         
//                    }
//                           else   if(h==36)
//                        {
////                            g.drawImage(nen, 0, 0, 800,500,null);
//                     g.drawImage(image35, 0, 100,800,400 ,null);
//                     h++; 
//                           
//                    }
//                            else   if(h==37)
//                        {
////                            g.drawImage(nen, 0, 0, 800,500,null);
//                     g.drawImage(image36,  0, 100,800,400 ,null);
//                     h++; 
//                          
//                    }
//                            else    if(h==38)
//                        {
////                            g.drawImage(nen, 0, 0, 800,500,null);
//                     g.drawImage(image37, 0, 100,800,400 ,null);
//                     h++; 
//                          
//                    }
//                           else      if(h==39)
//                        {
////                            g.drawImage(nen, 0, 0, 800,500,null);
//                     g.drawImage(image38,  0, 100,800,400 ,null);
//                     h++; 
//                            
//                    }
//                          else        if(h==40)
//                        {
////                            g.drawImage(nen, 0, 0, 800,500,null);
//                     g.drawImage(image39,  0, 100,800,400 ,null);
//                     h++; 
//                            
//                    }
//                              else     if(h==41)
//                        {
////                            g.drawImage(nen, 0, 0, 800,500,null);
//                     g.drawImage(image40, 0, 100,800,400 ,null);
//                     h++; 
//                          
//                    }
//                              else      if(h==42)
//                        {
////                            g.drawImage(nen, 0, 0, 800,500,null);
//                     g.drawImage(image41,  0, 100,800,400 ,null);
//                     h++; 
//                    }
//                                else     if(h==43)
//                        {
////                            g.drawImage(nen, 0, 0, 800,500,null);
//                     g.drawImage(image42,  0, 100,800,400 ,null);
//                     h++; 
//                            
//                    }
//                          else   if(h==44)
//                        {
////                            g.drawImage(nen, 0, 0, 800,500,null);
//                     g.drawImage(image43, 0, 100,800,400 ,null);
//                     h++; 
//                            
//                    }
//                           else   if(h==45)
//                        {
//                            g.drawImage(nen,  0, 100,800,400 ,null);
//                     g.drawImage(image44, 0, 200,800,500 ,null);
//                     h++; 
//                           
//                    }
//                         else      if(h==46)
//                        {
////                            g.drawImage(nen, 0, 0, 800,500,null);
//                     g.drawImage(image45,  0, 100,800,400 ,null);
//                     h++; 
//                            
//                    }
//                          else      if(h==47)
//                        {
////                            g.drawImage(nen, 0, 0, 800,500,null);
//                     g.drawImage(image46,  0, 100,800,400 ,null);
//                     h++; 
//                           
//                    }
//                          else       if(h==48)
//                        {
////                            g.drawImage(nen, 0, 0, 800,500,null);
//                     g.drawImage(image47,  0, 100,800,400 ,null);
//                     h++; 
//                           
//                    }
//                            else      if(h==49)
//                        {
////                            g.drawImage(nen, 0, 0, 800,500,null);
//                     g.drawImage(image48,  0, 100,800,400 ,null);
//                     h++; 
//                            
//                    }
//                           else        if(h==50)
//                        {
//                            
////                            g.drawImage(nen, 0, 0, 800,500,null);
//                     g.drawImage(image49,  0, 100,800,400 ,null);
//                     h=0; 
//                    }
                          g.setColor(hoverBgColor); 
			
                    }
			switch (state) {
				case NONE: 
                            
                                    g.setColor(bgColor)
                                            ; break;
				case PRESSED:g.setColor(pressedBgColor); break;
//				case HOVER: 
//                                    if(h==0)
//                                    {
//                                    g.drawImage(image, 0,0, 800,500,null);
//                                    h++;
//                            try {
//                                sleep(200);
//                            } catch (InterruptedException ex) {
//                                Logger.getLogger(RectangleButton.class.getName()).log(Level.SEVERE, null, ex);
//                            }
//                                    }
//                                    if(h==1)
//                                    {
//                                g.drawImage(image2, 0,0, 800,500,null);
//                                    h++;
//                            try {
//                                sleep(200);
//                            } catch (InterruptedException ex) {
//                                Logger.getLogger(RectangleButton.class.getName()).log(Level.SEVERE, null, ex);
//                            }
//                                    }
//                                    if(h==2)
//                                    {
//                                g.drawImage(image3, 0,0, 800,500,null);
//                                    h++;
//                            try {
//                                sleep(200);
//                            } catch (InterruptedException ex) {
//                                Logger.getLogger(RectangleButton.class.getName()).log(Level.SEVERE, null, ex);
//                            }
//                                    }
//                                    if(h==3)
//                                    {
//                                g.drawImage(image4, 0,0, 800,500,null);
//                                    h++;
//                            try {
//                                sleep(200);
//                            } catch (InterruptedException ex) {
//                                Logger.getLogger(RectangleButton.class.getName()).log(Level.SEVERE, null, ex);
//                            }
//                                    }
//                                    if(h==4)
//                                    {
//                                g.drawImage(image5, 0,0, 800,500,null);
//                                    h++;
//                            try {
//                                sleep(200);
//                            } catch (InterruptedException ex) {
//                                Logger.getLogger(RectangleButton.class.getName()).log(Level.SEVERE, null, ex);
//                            }
//                                    }
//                                    if(h==5)
//                                    {
//                                g.drawImage(image6, 0,0, 800,500,null);
//                                  h++;
//                            try {
//                                sleep(200);
//                            } catch (InterruptedException ex) {
//                                Logger.getLogger(RectangleButton.class.getName()).log(Level.SEVERE, null, ex);
//                            }
//                                    }
//                                    if(h==6)
//                                    {
//                             g.drawImage(image7, 0,0, 800,500,null);
//                             h++;
//                            try {
//                                sleep(200);
//                            } catch (InterruptedException ex) {
//                                Logger.getLogger(RectangleButton.class.getName()).log(Level.SEVERE, null, ex);
//                            }
//                                    }
//                                    if(h==7)
//                                    {
//                             g.drawImage(image8, 0,0, 800,500,null);
//                                    h=0;
//                            try {
//                                sleep(200);
//                            } catch (InterruptedException ex) {
//                                Logger.getLogger(RectangleButton.class.getName()).log(Level.SEVERE, null, ex);
//                            }
//                                    }
//                                
//                                    g.setColor(hoverBgColor); break;

		}
                }else {
                    k=0;
			g.setColor(Color.GRAY);
		}
		g.fillRect(posX, posY, width, height);
		
		g.setColor(Color.red);
		g.drawRect(posX, posY, width, height);
		g.drawRect(posX + 1, posY + 1, width - 2, height - 2);
		
		g.setColor(Color.WHITE);
		g.setFont(new Font("TimesRoman", Font.PLAIN, 14)); 
		g.drawString(text, posX + paddingTextX, posY + paddingTextY);
	}
}
