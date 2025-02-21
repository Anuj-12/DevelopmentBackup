package main;

import entity.Player;
import object.SuperObject;
import tile.TileManager;

import javax.swing.*;
import java.awt.*;

// Have to run the methods inside the implemented class (here Runnable -> method is run)
// GamePanel uses the properties of JPanel

public class GamePanel extends JPanel implements Runnable{

    //Screen Settings
    final int originalTileSize = 16;    // 16x16 tiles
    final int scale = 3;

    public final int tileSize = originalTileSize * scale;  // 48x48
    public final int maxScreenCol = 16;
    public final int maxScreenRow = 12;
    public final int screenWidth = tileSize * maxScreenCol;    // 768 pixels
    public final int screenHeight = tileSize * maxScreenRow;   // 576 pixels

    // WORLD SETTINGS
    public final int maxWorldCol = 50;
    public final int maxWorldRow = 50;

    int FPS = 60;

    TileManager tileM = new TileManager(this);
    KeyHandler keyH = new KeyHandler();
    Sound music = new Sound();
    Sound se = new Sound();
    public CollisionChecker cChecker = new CollisionChecker(this);
    public AssetSetter aSetter = new AssetSetter(this);
    public Player player = new Player(this, keyH);
    public SuperObject[] obj = new SuperObject[10];     // Can only display 10 objects at a time
    public UI ui = new UI(this);
    Thread gameThread;

    // Set player default
    int playerX = 100;
    int playerY = 100;
    int playerSpeed = 4;

    public GamePanel(){
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));    // Sets the dimension of this class (i.e. JPanel)
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);    // When component is focusable it can receive inputs from keyboard
    }

    public void setupGame(){
        aSetter.setObject();

        playMusic(0);
    }

    public void startGameThread(){
        gameThread = new Thread(this);      // Passing main.GamePanel constructor --> by using "this"
        gameThread.start();
    }

    // SLEEP METHOD

//    @Override
//    public void run() {
//
//        // Can draw 1/FPS
//        double drawInterval = 1000000000/FPS;   // 0.016667 seconds   1,000,000,000 nanoseconds = 1 second
//        double nextDrawTime = System.nanoTime() + drawInterval;
//        while(gameThread != null){  // As long as the game thread exists this will run
//
//            //  UPDATE : Update info such as character position
//            update();
//
//            // DRAW : Draw the updated info
//            repaint();  // Calling the paintComponent method
//
//            // Sleep Method
//            //
//            try {
//                double remainingTime = nextDrawTime - System.nanoTime();
//                remainingTime /= 999999;   // convert it to milliseconds because thread.sleep()
//
//                if(remainingTime < -1){
//                    remainingTime = 0;
//                }
//
//                Thread.sleep((long) remainingTime);  // Like delay()
//                nextDrawTime += drawInterval;
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }

    public void update(){
        player.update();
    }

    // Delta/Accumulator Method
    @Override
    public void run(){

        double drawInterval = 1000000000/FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;
        long timer = 0;
        int drawCount = 0;


        while(gameThread != null){

            currentTime = System.nanoTime();

            delta += (currentTime - lastTime)/ drawInterval;
            timer += (currentTime -lastTime);   // time passed
            lastTime = currentTime;

            if(delta >= 1){
            	long startTime = System.nanoTime(); // Start time for update and repaint
                update();
                repaint();
                long endTime = System.nanoTime(); // End time for update and repaint
                // System.out.println("Update and repaint time: " + (endTime - startTime) + " ns");
                delta--;
                drawCount++;
            }

            if(timer >= 1000000000){
                System.out.println("FPS : " + drawCount);
                drawCount = 0;
                timer = 0;
            }
        }
    }

    // Graphics class has many functions to draw on screen
    public void paintComponent(Graphics g){   // Standard method to draw on JPanel

        super.paintComponent(g);

        // Graphics2D class helps us get more control over geometry, coordinate transforms and text layout
        Graphics2D g2 = (Graphics2D)g;  // Type casting
        // Paint component needs graphics class but Graphics2D has more methods

        // Draw tile first then player... they are like two layers

        // TILE
        tileM.draw(g2);

        // OBJECT
        for(int i = 0; i < obj.length; i++){    // obj --> SuperObject array

            if(obj[i] != null){     // Check if there is an object inside the array
                obj[i].draw(g2, this);
            }
        }
        
        // PLAYER
        player.draw(g2);

        // UI
        ui.draw(g2);

        g2.dispose();   // Releases system resources being used by the Graphics2D object

    }

    public void playMusic(int i){
        music.setFile(i);
        music.play();
        music.loop();
    }

    public void stopMusic(int i){
        music.stop();
    }

    public void playSE(int i){

        se.setFile(i);
        se.play();
    }
}
