package games.wintergame;

import org.newdawn.slick.Graphics;

import java.util.Random;

public class Circle implements Actor{

    private float x;
    private float y;

    private float d;
    private float xspeed;

    private float yspeed;

    public void render(Graphics graphics) {
        graphics.drawOval(this.x,this.y, this.d, this.d);

    }

    public void update(int delta) {
        this.x+=(float)delta/this.xspeed;
        this.y+=(float)delta/this.yspeed;

        if(x>800) {
            this.x=0;
        }

        if(y>600) {
            this.y=0;
        }



    }

    public Circle() {
        Random random=new Random();
        this.x = random.nextInt(600);
        this.y = random.nextInt(600);
        this.xspeed = random.nextInt(20)+1;
        this.yspeed = random.nextInt(20)+1;
        this.d = random.nextInt(25)+1;
    }
}
