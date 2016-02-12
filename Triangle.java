package inheritance;

import java.util.Scanner;

public class Triangle extends Rectangle 
{ 


public  double DisplayTriangle() {
	Scanner t=new Scanner(System.in);
	System.out.println("Enter the length of a triangle");
	double h=t.nextDouble();
	System.out.println("Enter the width of a triangle");
	double base=t.nextDouble();
	double area=(1/2)*h*base;
	return area;
	
} 
} 
