package inheritance;

import java.util.Scanner;

public class AreaRectTria 
{ 
public static void main(String args[]) 
{ 
Scanner input=new Scanner(System.in);	
System.out.println("1- Recatngle   2-triangle");
int b=input.nextInt();

if(b==1)
	
{
Rectangle rect = new Rectangle(); 
rect.DisplayRectangle(); 
System.out.println("Area of Recatngle is "+rect.area);
}
else if(b==2)
	
{
Triangle tri = new Triangle(); 
tri.DisplayTriangle(); 
System.out.println("Area of Triangle is "+tri.area);
} 
} 
}
