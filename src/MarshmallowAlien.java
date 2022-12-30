/*
Title: MarshmallowAlien.java
Abstract: Makes an MarshmallowAlien and takes the health and name of the alien.
This is a type of alien and therefore inherits Alien. Also, getDamage method.
Author: Aaron Johnson
Date: 9-29-22
 */
public class MarshmallowAlien extends Alien{
    private static final int DAMAGE = 1;
    public MarshmallowAlien(int health,String name){
        super(health,name);
    }
    public int getDamage(){
        return DAMAGE;
    }
}
