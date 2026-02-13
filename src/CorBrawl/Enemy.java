package src.CorBrawl;

import java.awt.Rectangle;

public class Enemy {
    public int x, y;
    public int hp;
    public int size;

    public Enemy(int x, int y, int hp, int size) {
        this.x = x;
        this.y = y;
        this.hp = hp;
        this.size = size;
    }

    public Rectangle getHitbox() {
        int left = (int) (x - size / 2.0);
        int top = (int) (y - size / 2.0);
        return new Rectangle(left, top, size, size);
    }
}
