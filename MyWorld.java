import greenfoot.*;
/**
 * The World our hero lives in.
 * 
 * @author (your name) 
 * @version April 2026
 */
public class MyWorld extends World {
    public int score = 0;
    Label scoreLabel;
    
    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld() {
        super(600, 400, 1);
        
        // Create the elephant object
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        
        // Create a label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        createApple();
    }
    
    /**
     * Inscrease score
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    
    public void createApple()
    {
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }
}
