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
        return new Rectangle(x, y, size, size);
    }
}
