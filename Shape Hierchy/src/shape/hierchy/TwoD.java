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
public abstract class TwoD extends Shape 
{
    private double dim1;
    private double dim2;
    
    public TwoD(double a,double b)
    {
        dim1=a;
        dim2=b;
    }
    public TwoD(double a)
    {
        dim1=dim2=a;
    }
    public double get_a(){return dim1;}
    public double get_b(){return dim2;}
}
class circle extends TwoD
{
    public circle(double a){ super(a);}
    
    public double area()
    {
        return 3.14*super.get_a()*get_a();
    }
}
class triangle extends TwoD
{
    public triangle(double a,double b)
    {
        super(a,b);
    }
    public double area()
    {
        return 0.5*get_a()*get_b();
    }
}
class rectangle extends TwoD
{
    public rectangle(double a,double b){super(a,b);}
    public double area(){return get_a()*get_b();}
}