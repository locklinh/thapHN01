package game_object;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.nio.Buffer;

public abstract class Button {

	public static final int NONE = 0;
	public static final int PRESSED = 1;
	public static final int HOVER = 2;
	
	protected String text;
	protected int posX;
	protected int posY;
	protected int width;
	protected int height;
	protected int paddingTextX;
	protected int paddingTextY;
	protected boolean enabled;
	
	protected int state;
	protected Color bgColor;
	protected Color pressedBgColor;
	protected Color hoverBgColor;
        protected  BufferedImage image,image2,image3,image4,image5,image6,image7,image8,image9,image10,image11,image12,image13,image14,image15,image16,image17,image18,image19,image20,image21,image22,image23,image24,image25,image26,image27,image28,image29,image30,image31,image32,image33,image34,image35,image36,image37,image38,image39,image40,image41,image42,image43,image44,image45,image46,image47,image48,image49;
	
	public Button(String text, int posX, int posY, int width, int height, int paddingTextX, int paddingTextY,
			Color bgColor) {
		this.text = text;
		this.posX = posX;
		this.posY = posY;
		this.width = width;
		this.height = height;
		this.paddingTextX = paddingTextX;
		this.paddingTextY = paddingTextY;
		this.bgColor = bgColor;
                this.image=image;
                this.image2=image2;
                this.image3=image3;
                this.image4=image4;
                this.image5=image5;
                this.image6=image6;
                this.image7=image7;
                this.image8=image8;
                this.image9 = image9;
                this.image10 = image10;
                this.image11 = image11;
                this.image12 = image12;
                this.image13 = image13;
                this.image14 = image14;
                this.image15 = image15;
                this.image16 = image16;
                this.image17 = image17;
                this.image18 = image18;
                this.image19 = image19;
                this.image20 = image20;
                this.image21 = image21;
            this.image22 = image22;
            this.image23 = image23;
            this.image24 = image24;
            this.image25 = image25;
            this.image26 = image26;
            this.image27 = image27;
            this.image28 = image28;
            this.image29 = image29;
            this.image30 = image30;
            this.image31 = image31;
            this.image32 = image32;
            this.image33 = image33;
            this.image34 = image34;
            this.image35 = image35;
            this.image36 = image36;
            this.image37 = image37;
            this.image38 = image38;
            this.image39 = image39;
            this.image40 = image40;
            this.image41 = image41;
            this.image42 = image42;
            this.image43 = image43;
            this.image44 = image44;
            this.image45 = image45;
            this.image46 = image46;
            this.image47 = image47;
            this.image48 = image48;
            this.image49 = image49;
                                      
                                                                        
                                                
                                        
                                  
                                              
                                            
                                      
		enabled = true;
	}
	
	public void setEnable(boolean enabled) {
		this.enabled = enabled;
	}
	
	public void setState(int state) {
		this.state = state;
	}
	
	public void setBgColor(Color color) {
		bgColor = color;
	}

	public void setHoverBgColor(Color color) {
		hoverBgColor = color;
	}
	public void setPressedBgColor(Color color) {
		pressedBgColor = color;
	}
	public void image(BufferedImage Image,BufferedImage Image2,BufferedImage Image3,BufferedImage Image4,BufferedImage Image5,BufferedImage Image6,BufferedImage Image7,BufferedImage Image8,BufferedImage Image9,BufferedImage Image10,BufferedImage Image11,BufferedImage Image12,BufferedImage Image13,BufferedImage Image14,BufferedImage Image15,BufferedImage Image16,BufferedImage Image17,BufferedImage Image18,BufferedImage Image19){
          image=Image;
        image2=Image2;
        image3=Image3;
        image4=Image4;
        image5=Image5;
        image6=Image6;
        image7=Image7;
        image8=Image8;
         image9=Image9;
         image10=Image10;
         image11=Image11;
         image12=Image12;
         image13=Image13;
         image14=Image14;
         image15=Image15;
         image16=Image16;
         image17=Image17;
         image18=Image18;
         image19=Image19;

         
         
         
         
         
        
        
        }
	public abstract boolean isInButton(int x, int y);
	public abstract void draw(Graphics g);
}
