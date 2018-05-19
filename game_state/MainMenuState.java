package game_state;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

import game_interface.GamePanel;
import game_object.Button;
import static game_object.Button.HOVER;
import game_object.RectangleButton;
import java.awt.image.BufferedImage;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import game_object.RectangleButton;
import game_object.Button;
import javax.swing.JOptionPane;

public class MainMenuState extends JFrame implements GameState {

	private Button[] buttons;
	private GamePanel context;
	private Button buttonIsPressing;
	private boolean canContinueGame = false;
        private static int i=0,k=0;
        private Button[] image; 
    public static BufferedImage hd1,hd2,hd3,hd4,hd5,hd6,hd7,hd8,hd9,hd10,hd11,hd12,hd13,hd14,hd15,hd16,cmt,bg,bg0,bg4,bg5,bg7,bg9,bg13,bg16,bg18,bg21,bg25,bg26,bg27,bg28,bg29,bg30,bg31,bg32,bg33,bg39,bg40,bg41,bg42,bg48,bg49, backgroud,backgroud1,backgroud2,backgroud3,backgroud4,backgroud5,backgroud6,backgroud7,backgroud8,backgroud9,backgroud10,backgroud11,backgroud12,backgroud13,backgroud14,backgroud15,backgroud16,backgroud17,backgroud18,backgroud19,backgroud20,backgroud21;
    /*,backgroud22,backgroud23,backgroud24,backgroud25,backgroud26,backgroud27,backgroud28,backgroud29,backgroud30,backgroud31, backgroud32, backgroud33, backgroud34, backgroud35, backgroud36, backgroud37, backgroud38, backgroud39, backgroud40, backgroud41, backgroud42, backgroud43, backgroud44, backgroud45, backgroud46, backgroud47, backgroud48, backgroud49, backgroud50, backgroud51, backgroud52,backgroud53, backgroud54, backgroud55, backgroud56, backgroud57, backgroud58, backgroud59, backgroud60, backgroud61, backgroud62, backgroud63, backgroud64, backgroud65, backgroud66, backgroud67, backgroud68, backgroud69, backgroud70, backgroud71, backgroud72, backgroud73, backgroud74, backgroud75, backgroud76, backgroud77, backgroud78, backgroud79, backgroud80, backgroud81, backgroud82, backgroud83, backgroud84, backgroud85, backgroud86, backgroud87, backgroud88, backgroud89, backgroud90, backgroud91, backgroud92, backgroud93, backgroud94, backgroud95, backgroud96, backgroud97, backgroud98, backgroud99, backgroud100, backgroud101, backgroud102, backgroud103, backgroud104, backgroud105, backgroud106, backgroud107, backgroud108;*/
       
   public static SoundPlayer sound;

	public MainMenuState(GamePanel context) throws IOException {
             
		this.context = context;
		buttons = new RectangleButton[5];
		File f = new File("gamesaving.dat");
                 
                            
                          
                bg0=ImageIO.read(new File("t1.png"));
//                bg1=ImageIO.read(new File("hd1.png"));
//                bg2=ImageIO.read(new File("hd2.png"));
//                bg3=ImageIO.read(new File("hd3.png"));
                bg4=ImageIO.read(new File("t5.png"));
                bg5=ImageIO.read(new File("t6.png"));
//                bg6=ImageIO.read(new File("hd4.png"));
                bg7=ImageIO.read(new File("t8.png"));
//                bg8=ImageIO.read(new File("hd5.png"));
                bg49=ImageIO.read(new File("t9.png"));
                bg9 = ImageIO.read(new File("t10.png"));
//                bg10 = ImageIO.read(new File("hd6.png"));
//                bg11 = ImageIO.read(new File("hd7.png"));
//                bg12 = ImageIO.read(new File("hd8.png"));
                bg13 = ImageIO.read(new File("t14.png"));
//                bg14 = ImageIO.read(new File("hd9.png"));
//                bg15 = ImageIO.read(new File("hd10.png"));
                bg16 = ImageIO.read(new File("t17.png"));
//                bg17 = ImageIO.read(new File("hd11.png"));
                bg18 = ImageIO.read(new File("t19.png"));
//                bg19 = ImageIO.read(new File("hd12.png"));
//                bg20 = ImageIO.read(new File("hd13.png"));
                bg21 = ImageIO.read(new File("t22.png"));
//                bg22 = ImageIO.read(new File("hd14.png"));
//                bg23 = ImageIO.read(new File("hd15.png"));
//                bg24 = ImageIO.read(new File("hd16.png"));
                bg25 = ImageIO.read(new File("t26.png"));
                bg26 = ImageIO.read(new File("t27.png"));
                bg27 = ImageIO.read(new File("t28.png"));
                bg28 = ImageIO.read(new File("t29.png"));
                bg29 = ImageIO.read(new File("t30.png"));
                bg30 = ImageIO.read(new File("t31.png"));
                bg31 = ImageIO.read(new File("t32.png"));
                bg32 = ImageIO.read(new File("t33.png"));
                bg33 = ImageIO.read(new File("t34.png"));
//                bg34 = ImageIO.read(new File("t35.png"));
//                bg35 = ImageIO.read(new File("t36.png"));
//                bg36 = ImageIO.read(new File("t37.png"));
//                bg37 = ImageIO.read(new File("t38.png"));
//                bg38 = ImageIO.read(new File("t39.png"));
                bg39 = ImageIO.read(new File("t40.png"));
                bg40 = ImageIO.read(new File("t41.png"));
                bg41 = ImageIO.read(new File("t42.png"));
                bg42 = ImageIO.read(new File("t43.png"));
//                bg43 = ImageIO.read(new File("t44.png"));
//                bg44 = ImageIO.read(new File("t45.png"));
//                bg45 = ImageIO.read(new File("t46.png"));
//                bg46 = ImageIO.read(new File("t47.png"));
//                bg47 = ImageIO.read(new File("t48.png"));
                bg48 = ImageIO.read(new File("t49.png"));               
                cmt=        ImageIO.read(new File("cmt.png"));   
          
                 try {
                hd1 = ImageIO.read(new File("hd1.png")); 
            } catch (IOException ex) {
                Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
            }
                         
                            try {
                hd2 = ImageIO.read(new File("hd2.png"));
            } catch (IOException ex) {
                Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                hd3 = ImageIO.read(new File("hd3.png"));
            } catch (IOException ex) {
                Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                hd4 = ImageIO.read(new File("hd4.png"));
            } catch (IOException ex) {
                Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                hd5 = ImageIO.read(new File("hd5.png"));
            } catch (IOException ex) {
                Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                hd6 = ImageIO.read(new File("hd6.png"));
            } catch (IOException ex) {
                Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                hd7 = ImageIO.read(new File("hd7.png"));
            } catch (IOException ex) {
                Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                hd8 = ImageIO.read(new File("hd8.png"));
            } catch (IOException ex) {
                Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                hd9 = ImageIO.read(new File("hd9.png"));
            } catch (IOException ex) {
                Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                hd10 = ImageIO.read(new File("hd10.png"));
            } catch (IOException ex) {
                Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                hd11 = ImageIO.read(new File("hd11.png"));
            } catch (IOException ex) {
                Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                hd12 = ImageIO.read(new File("hd12.png"));
            } catch (IOException ex) {
                Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                hd13 = ImageIO.read(new File("hd13.png"));
            } catch (IOException ex) {
                Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                hd14 = ImageIO.read(new File("hd14.png"));
            } catch (IOException ex) {
                Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                hd15 = ImageIO.read(new File("hd15.png"));
            } catch (IOException ex) {
                Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                hd16 = ImageIO.read(new File("hd16.png"));
            } catch (IOException ex) {
                Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
            }
                    
                   
               
		if(f.exists() && !f.isDirectory()) { 
		    canContinueGame = true;
		}

		buttons[0] = new RectangleButton("NEW GAME", 330, 130, 100, 40, 15, 25, Color.ORANGE);
		buttons[0].setHoverBgColor(Color.BLUE);
		buttons[0].setPressedBgColor(Color.GREEN);
//                buttons[0].image(bg0, bg1, bg2, bg3, bg4, bg5, bg6, bg7);
           
                               
        
		buttons[1] = new RectangleButton("CONTINUE", 330, 190, 100, 40, 15, 25, Color.ORANGE);
		buttons[1].setHoverBgColor(Color.BLUE);
		buttons[1].setPressedBgColor(Color.GREEN);
		if(!canContinueGame) {
			buttons[1].setEnable(false);
		}

		buttons[2] = new RectangleButton("TUTORIAL", 330, 250, 100, 40, 15, 25, Color.ORANGE);
		buttons[2].setHoverBgColor(Color.BLUE);
		buttons[2].setPressedBgColor(Color.GREEN);
                buttons[2].image(hd1, hd2, hd3,hd4, hd5, hd6, hd7, hd8, hd9, hd10, hd11, hd12, hd13, hd14, hd15, hd16, hd16, hd16,hd16);
              
            
            
		
                buttons[3] = new RectangleButton("PLAYER", 330, 310, 100, 40, 25, 25, Color.ORANGE);
		buttons[3].setHoverBgColor(Color.BLUE);
		buttons[3].setPressedBgColor(Color.GREEN);
                
		buttons[4] = new RectangleButton("EXIT", 330, 370, 100, 40, 35, 25, Color.ORANGE);
		buttons[4].setHoverBgColor(Color.BLUE);
		buttons[4].setPressedBgColor(Color.GREEN);
                buttons[4].image(bg0, bg4, bg7, bg9, bg13, bg16, bg18, bg21, bg25,bg26, bg30, bg33, bg39, bg42, bg48, bg49, bg49, bg49, bg49);
                
                  bg= ImageIO.read(new File("nen.jpg"));
                  
//                         backgroud
//            =    ImageIO.read(new File("1.png"));
//            backgroud1
//            =    ImageIO.read(new File("1.png"));
//            backgroud2
//            =    ImageIO.read(new File("2.png"));
//            backgroud3
//            =    ImageIO.read(new File("2.png"));
//            backgroud4
//            =    ImageIO.read(new File("3.png"));
//            backgroud5
//            =    ImageIO.read(new File("3.png"));
//            backgroud6
//            =    ImageIO.read(new File("4.png"));
//            backgroud7
//            =    ImageIO.read(new File("4.png"));
//            backgroud8
//            =    ImageIO.read(new File("5.png"));
//            backgroud9
//            =    ImageIO.read(new File("5.png"));
//            backgroud10
//            =    ImageIO.read(new File("6.png"));
//            backgroud11
//            =    ImageIO.read(new File("6.png"));
//            backgroud12
//            =    ImageIO.read(new File("7.png"));
            

//               backgroud1
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0313.jpg"));
//            backgroud2
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0314.jpg"));
//            backgroud3
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0315.jpg"));
//            backgroud4
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0316.jpg"));
//            backgroud5
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0317.jpg"));
//            backgroud6
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0318.jpg"));
//            backgroud7
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0319.jpg"));
//            backgroud8
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0320.jpg"));
//            backgroud9
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0321.jpg"));
//            backgroud10
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0322.jpg"));
//            backgroud11
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0323.jpg"));
//            backgroud12
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0324.jpg"));
//            backgroud13
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0325.jpg"));
//            backgroud14
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0326.jpg"));
//            backgroud15
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0327.jpg"));
//            backgroud16
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0328.jpg"));
//            backgroud17
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0329.jpg"));
//            backgroud18
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0330.jpg"));
//            backgroud19
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0331.jpg"));
//            backgroud20
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0332.jpg"));
//            backgroud21
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0333.jpg"));
//            backgroud22
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0334.jpg"));
//            backgroud23
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0335.jpg"));
//            backgroud24
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0336.jpg"));
//            backgroud25
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0337.jpg"));
//            backgroud26
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0338.jpg"));
//            backgroud27
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0339.jpg"));
//            backgroud28
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0340.jpg"));
//            backgroud29
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0341.jpg"));
//            backgroud30
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0342.jpg"));
//            backgroud31
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0343.jpg"));
//            backgroud32
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0344.jpg"));
//            backgroud33
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0345.jpg"));
//            backgroud34
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0346.jpg"));
//            backgroud35
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0347.jpg"));
//            backgroud36
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0348.jpg"));
//            backgroud37
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0349.jpg"));
//            backgroud38
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0350.jpg"));
//            backgroud39
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0351.jpg"));
//            backgroud40
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0352.jpg"));
//            backgroud41
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0353.jpg"));
//            backgroud42
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0354.jpg"));
//            backgroud43
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0355.jpg"));
//            backgroud44
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0356.jpg"));
//            backgroud45
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0357.jpg"));
//            backgroud46
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0358.jpg"));
//            backgroud47
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0359.jpg"));
//            backgroud48
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0360.jpg"));
//            backgroud49
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0361.jpg"));
//            backgroud50
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0362.jpg"));
//            backgroud51
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0363.jpg"));
//            backgroud52
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0364.jpg"));
//            backgroud53
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0365.jpg"));
//            backgroud54
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0366.jpg"));
//            backgroud55
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0367.jpg"));
//            backgroud56
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0368.jpg"));
//            backgroud57
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0369.jpg"));
//            backgroud58
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0370.jpg"));
//            backgroud59
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0371.jpg"));
//            backgroud60
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0372.jpg"));
//            backgroud61
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0373.jpg"));
//            backgroud62
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0374.jpg"));
//            backgroud63
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0375.jpg"));
//            backgroud64
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0376.jpg"));
//            backgroud65
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0377.jpg"));
//            backgroud66
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0378.jpg"));
//            backgroud67
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0379.jpg"));
//            backgroud68
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0380.jpg"));
//            backgroud69
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0381.jpg"));
//            backgroud70
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0382.jpg"));
//            backgroud71
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0383.jpg"));
//            backgroud72
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0384.jpg"));
//            backgroud73
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0385.jpg"));
//            backgroud74
//                    
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0386.jpg"));
//            backgroud75
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0387.jpg"));
//            backgroud76
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0388.jpg"));
//            backgroud77
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0389.jpg"));
//            backgroud78
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0390.jpg"));
//            backgroud79
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0391.jpg"));
//            backgroud80
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0392.jpg"));
//            backgroud81
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0393.jpg"));
//            backgroud82
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0394.jpg"));
//            backgroud83
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0395.jpg"));
//            backgroud84
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0396.jpg"));
//            backgroud85
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0397.jpg"));
//            backgroud86
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0398.jpg"));
//            backgroud87
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0399.jpg"));
//            backgroud88
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0400.jpg"));
//            backgroud89
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0401.jpg"));
//            backgroud90
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0402.jpg"));
//            backgroud91
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0403.jpg"));
//            backgroud92
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0404.jpg"));
//            backgroud93
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0405.jpg"));
//            backgroud94
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0406.jpg"));
//            backgroud95
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0407.jpg"));
//            backgroud96
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0408.jpg"));
//            backgroud97
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0409.jpg"));
//            backgroud98
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0410.jpg"));
//            backgroud99
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0411.jpg"));
//            backgroud100
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0412.jpg"));
//            backgroud101
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0413.jpg"));
//            backgroud102
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0414.jpg"));
//            backgroud103
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0415.jpg"));
//            backgroud104
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0416.jpg"));
//            backgroud105
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0417.jpg"));
//            backgroud106
//            =    ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 418.jpg"));
//             backgroud107 = ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 419.jpg"));
//            backgroud108 = ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0420.jpg"));
//            backgroud[109] = ImageIO.read(new File("26 anime mask - Chroma key _ Especial 1000 subs 0421.jpg"));
             
                          
                sound= new SoundPlayer(new File("emgaimua.wav")); 
                sound.play();
                
             
	}

	@Override
	public void stateUpdate() {
		
	}

	public void stateRender(Graphics g) {
            
     
          g.drawImage(bg,0, 0, context.getWidth(), context.getHeight(),null);
       
   

//            if(i==0)
//            {
//		g.drawImage(bg,0, 0, context.getWidth(), context.getHeight(),null);
//               
//            }
//             if(i==1)
//            {
//		g.drawImage(backgroud,-500, 0,800, context.getHeight(),null);
////                if((i+1)%2==0){ 
////                try {
////                    sleep(50);
////                } catch (InterruptedException ex) {
////                    Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
////                }
////              g.drawImage(bg,0, 0, context.getWidth(), context.getHeight(),null);
////            }
//            }  
//              if(i==2)
//            {
//		g.drawImage(backgroud1,-500, 0,800, context.getHeight(),null);
////                 if((i+1)%2!=0){ 
////                 try {
////                    sleep(200);
////                } catch (InterruptedException ex) {
////                    Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
////                }
////              g.drawImage(bg,0, 0, context.getWidth(), context.getHeight(),null);
////                 }
//            }  
//               if(i==3)
//            {
//		g.drawImage(backgroud2,-500, 0,800, context.getHeight(),null);
////                 if((i+1)%2==0){ 
////                try {
////                    sleep(200);
////                } catch (InterruptedException ex) {
////                    Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
////                }
////              g.drawImage(bg,0, 0, context.getWidth(), context.getHeight(),null);
////                 }
//            }   if(i==4)
//            {
////                 if((i+1)%2!=0){ 
////		g.drawImage(backgroud3,0, 0, context.getWidth(), context.getHeight(),null);
////                 try {
////                    sleep(200);
////                } catch (InterruptedException ex) {
////                    Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
////                }
//              g.drawImage(backgroud3,-500, 0,800, context.getHeight(),null);
////                 }
//            }   if(i==5)
//            {
//		g.drawImage(backgroud4,-500, 0,800, context.getHeight(),null);
////                 if((i+1)%2==0){ 
////                 try {
////                    sleep(200);
////                } catch (InterruptedException ex) {
////                    Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
////                }
////              g.drawImage(bg,0, 0, context.getWidth(), context.getHeight(),null);
////                 }
//            }   if(i==6)
//            {
//		g.drawImage(backgroud5,-500, 0,800, context.getHeight(),null);
////                 if((i+1)%2!=0){  
////                try {
////                    sleep(200);
////                } catch (InterruptedException ex) {
////                    Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
////                }
////              g.drawImage(bg,0, 0, context.getWidth(), context.getHeight(),null);
////            }
//            }   if(i==7)
//            {
//		g.drawImage(backgroud6,-500, 0,800, context.getHeight(),null);
////                 if((i+1)%2==0){ 
////                try {
////                    sleep(200);
////                } catch (InterruptedException ex) {
////                    Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
////                }
////              g.drawImage(bg,0, 0, context.getWidth(), context.getHeight(),null);
////                 }
//            } 
//            
//            if(i==8)
//            {
//		g.drawImage(backgroud7,-500, 0,800, context.getHeight(),null);
////                 if((i+1)%2!=0){  
////                try {
////                    sleep(200);
////                } catch (InterruptedException ex) {
////                    Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
////                }
////              g.drawImage(bg,0, 0, context.getWidth(), context.getHeight(),null);
////                 }
//            }  
//             if(i==9)
//            {
//		g.drawImage(backgroud8,-500, 0,800, context.getHeight(),null);
////                 if((i+1)%2==0){  
////                try {
////                    sleep(200);
////                } catch (InterruptedException ex) {
////                    Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
////                }
////              g.drawImage(bg,0, 0, context.getWidth(), context.getHeight(),null);
////                 }
//            }
//               if(i==10)
//            {
//		g.drawImage(backgroud9,-500, 0,800, context.getHeight(),null);
////                 if((i+1)%2!=0){ 
////                 try {
////                    sleep(200);
////                } catch (InterruptedException ex) {
////                    Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
////                }
////              g.drawImage(bg,0, 0, context.getWidth(), context.getHeight(),null);
////                 }
//            }  
//             if(i==11)
//            {
//		g.drawImage(backgroud10,-500, 0,800, context.getHeight(),null);
////                 if((i+1)%2==0){ 
////                try {
////                    sleep(200);
////                } catch (InterruptedException ex) {
////                    Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
////                }
////              g.drawImage(bg,0, 0, context.getWidth(), context.getHeight(),null);
////                 }
//            }  
//              if(i==12)
//            {
//		g.drawImage(backgroud11,-500, 0,800, context.getHeight(),null);
////                 if((i+1)%2!=0){  
////                try {
////                    sleep(200);
////                } catch (InterruptedException ex) {
////                    Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
////                }
////              g.drawImage(bg,0, 0, context.getWidth(), context.getHeight(),null);
////                 }
//            }  
//               if(i==13)
//            {
//		g.drawImage(backgroud12,-500, 0,800, context.getHeight(),null);
////                 if((i+1)%2==0){  
////                try {
////                    sleep(200);
////                } catch (InterruptedException ex) {
////                    Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
////                }
////              g.drawImage(bg,0, 0, context.getWidth(), context.getHeight(),null);
////                 }
//            }  
//                if(i==14)
//            {
//                try {
//                    backgroud13
//                            =    ImageIO.read(new File("7.jpg"));
//                } catch (IOException ex) {
//                   
//                }
//		g.drawImage(backgroud13,-500, 0,800, context.getHeight(),null);
////                 if((i+1)%2!=0){ 
////                 try {
////                    sleep(200);
////                } catch (InterruptedException ex) {
////                    Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
////                }
//             
////                 }
//            }  
//                
//                 if(i==15)
//            {
//		g.drawImage(backgroud14,-500, 0, 800, context.getHeight(),null);
//            }  
//                  if(i==16)
//            {
//		g.drawImage(backgroud15,0, 0, context.getWidth(), context.getHeight(),null);
//            } 
//                   if(i==17)
//            {
//		g.drawImage(backgroud16,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//                    if(i==18)
//            {
//		g.drawImage(backgroud17,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//                     if(i==19)
//            {
//		g.drawImage(backgroud18,0, 0, context.getWidth(), context.getHeight(),null);
//            }
//                      if(i==20)
//            {
//		g.drawImage(backgroud19,0, 0, context.getWidth(), context.getHeight(),null);
//            }
//               if(i==21)
//            {
//		g.drawImage(backgroud20,0, 0, context.getWidth(), context.getHeight(),null);
//            }
//                      
//                     
//                     
//                     if(i==22)
//            {
//		g.drawImage(backgroud21,0, 0, context.getWidth(), context.getHeight(),null);
//            }
//            }   if(i==23)
//            {
//		g.drawImage(backgroud23,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//             if(i==24)
//            {
//		g.drawImage(backgroud24,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//              if(i==25)
//            {
//		g.drawImage(backgroud25,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//               if(i==26)
//            {
//		g.drawImage(backgroud26,0, 0, context.getWidth(), context.getHeight(),null);
//            }   if(i==27)
//            {
//		g.drawImage(backgroud27,0, 0, context.getWidth(), context.getHeight(),null);
//            }   if(i==28)
//            {
//		g.drawImage(backgroud28,0, 0, context.getWidth(), context.getHeight(),null);
//            }   if(i==29)
//            {
//		g.drawImage(backgroud29,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//             if(i==30)
//            {
//		g.drawImage(backgroud30,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//              if(i==31)
//            {
//		g.drawImage(backgroud31,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//               if(i==32)
//            {
//		g.drawImage(backgroud32,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//                if(i==33)
//            {
//		g.drawImage(backgroud33,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//                 if(i==34)
//            {
//		g.drawImage(backgroud34,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//                  if(i==35)
//            {
//		g.drawImage(backgroud35,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//                   if(i==36)
//            {
//		g.drawImage(backgroud36,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//                    if(i==37)
//            {
//		g.drawImage(backgroud37,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//                     if(i==38)
//            {
//		g.drawImage(backgroud38,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//                      if(i==39)
//            {
//		g.drawImage(backgroud39,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//                       if(i==40)
//            {
//		g.drawImage(backgroud40,0, 0, context.getWidth(), context.getHeight(),null);
//            }   if(i==41)
//            {
//		g.drawImage(backgroud41,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//             if(i==42)
//            {
//		g.drawImage(backgroud42,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//              if(i==43)
//            {
//		g.drawImage(backgroud43,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//               if(i==44)
//            {
//		g.drawImage(backgroud44,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//                if(i==45)
//            {
//		g.drawImage(backgroud45,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//                 if(i==46)
//            {
//		g.drawImage(backgroud46,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//                  if(i==47)
//            {
//		g.drawImage(backgroud47,0, 0, context.getWidth(), context.getHeight(),null);
//            }   if(i==48)
//            {
//		g.drawImage(backgroud48,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//             if(i==49)
//            {
//		g.drawImage(backgroud49,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//              if(i==50)
//            {
//		g.drawImage(backgroud50,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//               if(i==51)
//            {
//		g.drawImage(backgroud51,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//                if(i==52)
//            {
//		g.drawImage(backgroud52,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//                 if(i==53)
//            {
//		g.drawImage(backgroud53,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//                  if(i==54)
//            {
//		g.drawImage(backgroud54,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//                   if(i==55)
//            {
//		g.drawImage(backgroud55,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//                    if(i==56)
//            {
//		g.drawImage(backgroud56,0, 0, context.getWidth(), context.getHeight(),null);
//            }   if(i==57)
//            {
//		g.drawImage(backgroud57,0, 0, context.getWidth(), context.getHeight(),null);
//            }   if(i==58)
//            {
//		g.drawImage(backgroud58,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//             if(i==59)
//            {
//		g.drawImage(backgroud59,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//              if(i==60)
//            {
//		g.drawImage(backgroud61,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//               if(i==62)
//            {
//		g.drawImage(backgroud62,0, 0, context.getWidth(), context.getHeight(),null);
//            }   if(i==63)
//            {
//		g.drawImage(backgroud63,0, 0, context.getWidth(), context.getHeight(),null);
//            }   if(i==64)
//            {
//		g.drawImage(backgroud64,0, 0, context.getWidth(), context.getHeight(),null);
//            }   if(i==65)
//            {
//		g.drawImage(backgroud65,0, 0, context.getWidth(), context.getHeight(),null);
//            }   if(i==66)
//            {
//		g.drawImage(backgroud66,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//             if(i==67)
//            {
//		g.drawImage(backgroud67,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//              if(i==68)
//            {
//		g.drawImage(backgroud68,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//               if(i==69)
//            {
//		g.drawImage(backgroud69,0, 0, context.getWidth(), context.getHeight(),null);
//            }   if(i==70)
//            {
//		g.drawImage(backgroud70,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//             if(i==71)
//            {
//		g.drawImage(backgroud71,0, 0, context.getWidth(), context.getHeight(),null);
//            }   if(i==72)
//            {
//		g.drawImage(backgroud72,0, 0, context.getWidth(), context.getHeight(),null);
//            }   if(i==73)
//            {
//		g.drawImage(backgroud73,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//             if(i==74)
//            {
//		g.drawImage(backgroud74,0, 0, context.getWidth(), context.getHeight(),null);
//            }   if(i==75)
//            {
//		g.drawImage(backgroud75,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//             if(i==76)
//            {
//		g.drawImage(backgroud76,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//              if(i==77)
//            {
//		g.drawImage(backgroud77,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//               if(i==78)
//            {
//		g.drawImage(backgroud78,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//                if(i==79)
//            {
//		g.drawImage(backgroud79,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//                 if(i==80)
//            {
//		g.drawImage(backgroud80,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//                  if(i==81)
//            {
//		g.drawImage(backgroud81,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//                   if(i==82)
//            {
//		g.drawImage(backgroud82,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//                    if(i==83)
//            {
//		g.drawImage(backgroud83,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//                     if(i==84)
//            {
//		g.drawImage(backgroud84,0, 0, context.getWidth(), context.getHeight(),null);
//            }   if(i==85)
//            {
//		g.drawImage(backgroud85,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//             if(i==86)
//            {
//		g.drawImage(backgroud86,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//              if(i==87)
//            {
//		g.drawImage(backgroud87,0, 0, context.getWidth(), context.getHeight(),null);
//            }   if(i==88)
//            {
//		g.drawImage(backgroud88,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//             if(i==89)
//            {
//		g.drawImage(backgroud89,0, 0, context.getWidth(), context.getHeight(),null);
//            }   if(i==90)
//            {
//		g.drawImage(backgroud90,0, 0, context.getWidth(), context.getHeight(),null);
//            }   if(i==91)
//            {
//		g.drawImage(backgroud91,0, 0, context.getWidth(), context.getHeight(),null);
//            }   if(i==92)
//            {
//		g.drawImage(backgroud92,0, 0, context.getWidth(), context.getHeight(),null);
//            }   if(i==93)
//            {
//		g.drawImage(backgroud93,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//             if(i==94)
//            {
//		g.drawImage(backgroud94,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//              if(i==95)
//            {
//		g.drawImage(backgroud95,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
//             
//              if(i==96)
//            {
//		g.drawImage(backgroud96,0, 0, context.getWidth(), context.getHeight(),null);
//            } 
//               if(i==97)
//            {
//		g.drawImage(backgroud97,0, 0, context.getWidth(), context.getHeight(),null);
//            }
//                if(i==98)
//            {
//		g.drawImage(backgroud98,0, 0, context.getWidth(), context.getHeight(),null);
//            }
//                 if(i==99)
//            {
//		g.drawImage(backgroud99,0, 0, context.getWidth(), context.getHeight(),null);
//            }
//              if(i==100)
//            {
//		g.drawImage(backgroud100,0, 0, context.getWidth(), context.getHeight(),null);
//            }
//               if(i==101)
//            {
//		g.drawImage(backgroud101,0, 0, context.getWidth(), context.getHeight(),null);
//            } 
//                if(i==102)
//            {
//		g.drawImage(backgroud102,0, 0, context.getWidth(), context.getHeight(),null);
//            } 
//              if(i==103)
//            {
//		g.drawImage(backgroud103,0, 0, context.getWidth(), context.getHeight(),null);
//            }
//               if(i==104)
//            {
//		g.drawImage(backgroud104,0, 0, context.getWidth(), context.getHeight(),null);
//            }
//                if(i==105)
//            {
//		g.drawImage(backgroud105,0, 0, context.getWidth(), context.getHeight(),null);
//            }
//                
//                 if(i==106)
//            {
//		g.drawImage(backgroud106,0, 0, context.getWidth(), context.getHeight(),null);
//            }
//                  if(i==107)
//            {
//		g.drawImage(backgroud107,0, 0, context.getWidth(), context.getHeight(),null);
//            }
//                
//              if(i==108)
//            {
//		g.drawImage(backgroud108,0, 0, context.getWidth(), context.getHeight(),null);
//            }  
            
           
          
//               i++;   
//               
//            
//           
//             
//           
//             if(i==14)   i=0; 
//           
            
               
          
                  
          try {
                    sleep(0);
                } catch (InterruptedException ex) {
                    
                    
                
        }
           
		for (Button bt : buttons) {
			bt.draw(g);
		}
              
//            try {
//                sleep(50);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
            
		for (Button bt : buttons) {
			if (bt.isInButton(e.getX(), e.getY())) {
                            
				bt.setState(RectangleButton.PRESSED);
				buttonIsPressing = bt;
			}
		}
		context.redraw();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
           
		for (Button bt : buttons) {
			if (bt.isInButton(e.getX(), e.getY()) && bt == buttonIsPressing) {  
				if (bt == buttons[0]) {
                                     sound.close();
                                  
                                    try {
                                        context.changeCurrentState(new GamePlayState(context));
                                    } catch (IOException ex) {
                                        Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
                                    }
				} else if (bt == buttons[1]) {
                                    try {
                                        context.changeCurrentState(new GamePlayState(context));
                                    } catch (IOException ex) {
                                        Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
                                    }
					try {
						((GamePlayState) context.getCurrentState()).continueGame();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				} else if(bt == buttons[4]) {
                          
					System.exit(0);
				} else if(bt == buttons[2]) {
                                    try {
                                        context.changeCurrentState(new TutorialState(context));
                                    } catch (IOException ex) {
                                        Logger.getLogger(MainMenuState.class.getName()).log(Level.SEVERE, null, ex);
                                    }
				} else if(bt == buttons[3]) {
					context.changeCurrentState(new PlayersState(context));
				}
			} 
                       
		}
		context.redraw();
		buttonIsPressing = null;
		for (Button bt : buttons) {
			bt.setState(Button.NONE);
		}
	}

	@Override
	public void mouseDragged(MouseEvent e) {
	}

	@Override
	public void mouseMoved(MouseEvent e) { 
           
		for (Button bt : buttons) {
			if (bt.isInButton(e.getX(), e.getY())) {
				bt.setState(RectangleButton.HOVER);
			} else {
				bt.setState(RectangleButton.NONE);
			}
		}
		context.redraw();
            
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

    private void restateRender(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
