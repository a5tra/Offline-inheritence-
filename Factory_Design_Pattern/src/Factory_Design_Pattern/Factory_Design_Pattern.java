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
import java.util.Scanner;
public class Factory_Design_Pattern 
{
    public static void main(String args[])
    {
        ShipFactory FactoryOne=new ShipFactory();
        
        EnemyShip theEnemy=null;
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("what type of ship?(U/R/B)");
        
        if(input.hasNextLine())
        {
            String enemyShipOption=input.nextLine();
            theEnemy=FactoryOne.makeEnemyShip(enemyShipOption);
        }
        if(theEnemy!=null)
        {
            doStuffEnemy(theEnemy);
        }
        else
            System.out.println("ENTER U,R or B next time");
        
    }
    
    public static void doStuffEnemy(EnemyShip enemyOne)
    {
        enemyOne.displayEnemyShip();
        enemyOne.followHeroShip();
        enemyOne.enemyShipShoots();
    }
    
}
