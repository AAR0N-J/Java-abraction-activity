/*
Title: SnakeAlien.java
Abstract: Makes an SnakeAlien and takes the health and name of the alien.
This is a type of alien and therefore inherits Alien. Also, getDamage method.
Author: Aaron Johnson
Date: 9-29-22
 */
public class SnakeAlien extends Alien {
    private static final int DAMAGE = 10;

    public SnakeAlien(int health, String name) {
        super(health,name);
    }

    public int getDamage() {
        return DAMAGE;
    }
}
