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
public abstract class ThreeD extends Shape
{
    private double dim1;
    private double dim2;
    private double dim3;
    
    public ThreeD(double a,double b,double c)
    {
        dim1=a;
        dim2=b;
        dim3=c;
    }
    
    public ThreeD(double a){dim1=dim2=dim3=a;}
    public double  get_a(){return dim1;}
    public double get_b(){return dim2;}
    public double get_c(){return dim3;}
    public double volume(double a,double b,double c){return a*b*b;}
    public double volume(double a){return 3.14*a*a*a;}
}
class cube extends ThreeD
{
    public cube(double a,double b,double c)
    {
        super(a,b,c);
    }
    //public double area(){System.out.println("area is surface area"); return 0.0;}
    public double area(){return get_a()*get_b()+get_b()*get_c()+get_c()*get_a();} //surface area
}
class Sphere extends ThreeD
{
    public Sphere(double a)
    {
        super(a);
    }
    public double area(){return 4*3.14*get_a()*get_a();}
    
}
