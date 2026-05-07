import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author marian
 * @version May 2026
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Elephant", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(titleLabel, getWidth()/2, 200);
        prepare();
    }

    /**
     * The main world act loop
     */
    public void act()
    {
        //start the game if user presses the space bar
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,408,150);
        elephant.setLocation(523,71);
        Label label = new Label("Use \u2190 and \u2192 to Move", 40);
        addObject(label,220,257);
        label.setLocation(297,243);
        label.setLocation(305,240);

        Label labe2 = new Label("Press <space> to Start", 40);
        addObject(label,310,299);
        labe2.setLocation(362,281);
        labe2.setLocation(275,284);
        labe2.setLocation(305,295);

        Label label2 = new Label("Press <space> to Start", 40);
        addObject(label2,241,309);
        label2.setLocation(316,301);
        elephant.setLocation(496,118);
        label.setLocation(381,218);
        label.setLocation(289,251);
        label2.setLocation(233,300);
        label2.setLocation(287,304);
        label2.setLocation(260,294);
        label2.setLocation(262,302);
    }
}
