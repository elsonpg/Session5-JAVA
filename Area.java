package constructoroverloading;

import java.util.*;

public class Area
{
    private int length, breadth,areaRectangle;
    private final float half=0.5f;
    private float base, height, areaTriangle;

    Area()
    {
        length=0;
        breadth=0;
        base=0.0f;
        height=0.0f;
    }

    void input(int l,int b)
    {
        length=l;
        breadth=b;
    }

    void input(float b,float h)
    {
        base=b;
        height=h;
    }
    
    void AreaTriangle()
    {
        areaTriangle=half*base*height;
        System.out.println("Area of Triangle is "+areaTriangle+"cm.square"   );
    }

    void AreaRectangle()
    {
        areaRectangle=length*breadth;
        System.out.println("Area of Rectangle is "+areaRectangle+"cm.square"   );
    }
}

class MainFunOverloaded
{
    public static void main(String arg[])
    {
        //Input from user
        @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Radius of Circle as integer");
        System.out.println("Enter the Length and Breadth of Rectangle as integer");
        int len=sc.nextInt();
        int bre=sc.nextInt();
        System.out.println("Enter the Base and height of Triangle as float");
        float b=sc.nextFloat();        
        float h=sc.nextFloat();
        
        Area rectangle =new Area();
        Area triangle =new Area();
        
        //Function Call
        rectangle.input(len,bre);
        triangle.input(b,h);
        
        
        rectangle.AreaRectangle();
        triangle.AreaTriangle();
    }
}