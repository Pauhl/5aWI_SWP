package games.wintergame;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainGame extends BasicGame {
    private Rectangle rectangle;
    private Rectangle rectangle2;
    private List<Actor> actors;


    public MainGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
        this.actors=new ArrayList<>();

        // 1 mal aufgerufen
        Random random = new Random();
        for (int i=0; i < 100 ; i++) {
            Rectangle rectangle = new Rectangle(random.nextInt(600),random.nextInt(600), random.nextInt(15)+1, random.nextInt(15)+1);
            this.actors.add(rectangle);
        }
        for (int i=0; i < 50; i++) {
            Circle circle=new Circle();
            this.actors.add(circle);

        }

        for (int i=0; i < 50; i++) {
            Ellipse ellipse=new Ellipse();
            this.actors.add(ellipse);

        }

    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
        for(Actor actor:this.actors) {
            actor.update(delta);
        }



    }

    @Override
    public void render(GameContainer gc, Graphics graphics) throws SlickException {
        for(Actor actor:this.actors) {
            actor.render(graphics);
        }


    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new MainGame("Wintergame"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
