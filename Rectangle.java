package inheritance;

import java.util.Scanner;

public class Rectangle
{ 


public double area;

public double DisplayRectangle() {
	
	Scanner r=new Scanner(System.in);
	System.out.println("Enter the length of a rectangle");
	double l=r.nextDouble();
	System.out.println("Enter the width of a rectangle");
	double b=r.nextDouble();
	double area=l*b;
	return area;
	
	
	
} 
} 
