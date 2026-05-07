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
        Label label = new Label("Press <space> to Start", 40);
        addObject(label,310,299);
        label.setLocation(362,281);
        label.setLocation(275,284);
        label.setLocation(305,295);
        Label2 label2 = new Label2("Use <-- and --> to Move", 40);
        addObject(label2,291,250);
        elephant.setLocation(558,126);
        elephant.setLocation(515,129);
        label2.setLocation(334,213);
        label2.setLocation(313,260);
        label2.setLocation(300,248);
        label.setLocation(294,299);
        elephant.setLocation(523,122);
        label.setLocation(284,301);
        label.setLocation(249,287);
        label.setLocation(277,295);
        label2.setLocation(208,217);
        label2.setLocation(332,213);
        label2.setLocation(272,230);
        label2.setLocation(290,224);
        label2.setLocation(298,224);
        label.setLocation(247,303);
        label.setLocation(271,293);
        elephant.setLocation(506,101);
    }
}
