import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-3);
        if(getX() <= 0) {
            resetBanana();
        }
        if(isTouching(Hero.class)) {
            Dead dead = new Dead();
            getWorld().addObject(dead, 300, 200);
            getWorld().removeObject(this);
        }
        // Add your action code here.
    }
    public void resetBanana() {
            int num = Greenfoot.getRandomNumber(2);
            if(num == 0) {
                setLocation(600, 100);
            } else {
                setLocation(600, 300);
            }

    }
}
