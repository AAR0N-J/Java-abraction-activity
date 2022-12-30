import java.util.ArrayList;
/*
Title: AlienPack.java
Abstract: Makes an AlienPack array list with a given number of aliens. Can add aliens to the list.
Also, calculates the total damage of the alien pack
by using the getDamage methods in each alien type's class.
Author: Aaron Johnson
Date: 9-29-22
 */
public class AlienPack {
    private ArrayList<Alien> aliens;

    public AlienPack () { // This is not used in the demo, but
        // I thought it looks better to have both constructors because it is an ArrayList.
        aliens = new ArrayList<>();
    }
    public AlienPack (int numberOfAliens) {
        aliens = new ArrayList<>(numberOfAliens);
    }
    public void addAlien(Alien newAlien) {
        aliens.add(newAlien);
    }
    public ArrayList<Alien> getAliens() { return aliens; }
    public int calculateDamage() {
        int damage = 0;
        for (Alien alien : aliens) {
            damage += alien.getDamage();
        }
        return damage;
    }
}