/*
Title: Alien.java
Abstract: Makes an Alien and takes the health and name of the alien.
This is the base class for all types of aliens, there are 3.
Author: Aaron Johnson
Date: 9-29-22
 */
abstract class Alien {
    private int health; // 0 = dead, 100 = full strength
    private String name;
    public Alien(int health, String name) {
        this.health = health;
        this.name = name;
    }
    public abstract int getDamage();
}