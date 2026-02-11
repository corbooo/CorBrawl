package src.CorBrawl;

import java.awt.Rectangle;

public class Bullet {

    public int x;
    public int y;
    public int size;

    public Bullet(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

    public Rectangle getHitbox() {
        return new Rectangle(x, y, size, size);
    }
}
