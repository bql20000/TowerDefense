package mygame.tile.tower;
import mygame.tile.Tile;

public class Tower extends Tile {
    private int attackSpeed;
    private int attackRange;
    private int damage;
    private long lastBulletGenerationTime;

    public Tower() {}
    public Tower(int x, int y) {
        super(x, y);
        lastBulletGenerationTime = 0;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public int getAttackRange() {
        return attackRange;
    }

    public void setAttackRange(int attackRange) {
        this.attackRange = attackRange;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public long getLastBulletGenerationTime() {
        return lastBulletGenerationTime;
    }

    public void setLastBulletGenerationTime(long lastBulletGenerationTime) {
        this.lastBulletGenerationTime = lastBulletGenerationTime;
    }
}
