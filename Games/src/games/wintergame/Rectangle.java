package games.wintergame;

import org.newdawn.slick.Graphics;

public class Rectangle implements Actor{

    private float x;
    private float y;
    private float xspeed;

    private float yspeed;

    public void render(Graphics graphics) {
        graphics.drawRect(this.x,this.y,10,10);

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

    public Rectangle(float x, float y, float xspeed, float yspeed) {
        this.x = x;
        this.y = y;
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }
}
