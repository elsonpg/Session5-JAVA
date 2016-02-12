package inheritance2;

import java.util.Scanner;

public class Buildings 
{ 
public static void main(String args[]) 
{ 
Scanner input=new Scanner(System.in);	
System.out.println("1- Commercial   2-Residential");
int b=input.nextInt();

if(b==1)
	
{
Commercial com = new Commercial(); 
com.DisplayCommercial(); 
}
else if(b==2)
	
{
Residential res = new Residential(); 
res.DisplayResidential(); 
} 
} 
}
