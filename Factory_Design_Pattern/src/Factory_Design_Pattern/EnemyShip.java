/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory_Design_Pattern;

/**
 *
 * @author sabbi
 */
public abstract class EnemyShip 
{
    private String name;
    private double amtDamage;
    public String getName(){return name;}
    public void setName(String newName){name=newName;}
    public double getDamage(){return amtDamage;}
    public void setDamage(int damage){amtDamage=damage;}
    
    public void followHeroShip()
    {
        System.out.println(getName()+"is following the hero");
    }
    
    public void enemyShipShoots()
    {
        System.out.println(getName()+"attacks and does "+getDamage());
    }
    
    public void displayEnemyShip()
    {
        System.out.println(getName()+"is on the Screen");
    }
}
