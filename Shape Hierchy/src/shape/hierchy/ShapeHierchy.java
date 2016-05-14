/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape.hierchy;

/**
 *
 * @author sabbi
 */
public class ShapeHierchy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        triangle t1=new triangle(3,4);
        System.out.println(t1.area());
        circle c1=new circle(4);
        System.out.println(c1.area());
        
        cube cu1=new cube(1,2,3);
        System.out.println(cu1.area());
        System.out.println(cu1.volume(1,2,3));
        
        Sphere sh1=new Sphere(4);
        System.out.println(sh1.area());
        System.out.println(sh1.volume(4));
        
        
    }
}
