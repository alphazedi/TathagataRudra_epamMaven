package com.epam.maven_newyear;



import java.util.*;
import java.lang.String;
import java.io.*;

abstract class A
{
	public abstract void sort(String arr[], int price[], double weight[]); 
	public void display(String arr[], int price[], double weight[]) //display method
	{
		
	}
	public void range(String arr[], int price[], double weight[], int myrange) //to show items within range
	{
		
	}
}

class Chocolates extends A
{
	public void sort(String arr[], int price[], double weight[])
	{
		int i,j,price_temp;
		double weight_temp;
		String item_temp; 
		for(i=0;i<4;i++)
		{
			for(j=0;j<4-i;j++)
			{
				if(price[j]>price[j+1])
				{
					price_temp=price[j];
					price[j]=price[j+1];
					price[j+1]=price_temp;
					
					weight_temp=weight[j];
					weight[j]=weight[j+1];
					weight[j+1]=weight_temp;
					
					item_temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=item_temp;
				}
			}
		}
	}
	
	public void display(String arr[], int price[], double weight[])
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Item: "+arr[i]+  " Price: "+price[i]+" Weight: "+weight[i]);
		}
	}
	
	public void range(String arr[], int price[], double weight[], int myrange) //shows items within range
	{
		for(int i=0;i<5;i++)
		{
			if(price[i]<=myrange)
			{
				System.out.println("Item: "+arr[i]+" Price: "+price[i]+" Weight: "+weight[i]);
			}
		}
	}
}

class Sweets extends A
{
	public void sort(String arr[], int price[], double weight[])
	{
		int i,j,price_temp;
		double weight_temp;
		String item_temp;
		for(i=0;i<4;i++)
		{
			for(j=0;j<4-i;j++)
			{
				if(price[j]>price[j+1])
				{
					price_temp=price[j];
					price[j]=price[j+1];
					price[j+1]=price_temp;
					
					weight_temp=weight[j];
					weight[j]=weight[j+1];
					weight[j+1]=weight_temp;
					
					item_temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=item_temp;
				}
			}
		}
	}
	
	public void display(String arr[], int price[], double weight[])
	
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Item: "+arr[i]+" Price: "+price[i]+" Weight: "+weight[i]);
		}
	}
	
	public void range(String arr[], int price[], double weight[], int myrange) //shows items within range
	{
		for(int i=0;i<5;i++)
		{
			if(price[i]<=myrange)
			{
				System.out.println("Item: "+arr[i]+" Price: "+price[i]+" Weight: "+weight[i]);
			}
		}
	}
}


public class App 
{
  public static void main( String[] args )
  {
  	Scanner sc = new Scanner(System.in);
  	String choco_name[]= {"Ferrero Rocher","Smitten Chocolates","Cadbury Diary Milk","Hersheys","Lindt"}; 
  	int choco_price[]= {180,260,187,160,154}; 
  	double choco_weight[]={125,164,124.5,185.6,128}; 
  	String swt_name[]= {"Ladoo","Kheer","Rashgulla","Gulab Jamun","Rajbhog"}; 
  	int swt_price[]= {12,25,26,30,20}; 
  	double swt_weight[]= {5.6,3,2.5,4,3}; 
  	Chocolates c=new Chocolates();
  	Sweets s=new Sweets();
  	c.sort(choco_name, choco_price, choco_weight);
  	s.sort(swt_name, swt_price, swt_weight);
  	
			System.out.print("\t\t\t ___________________________________________________________________\n");
			System.out.print("\n\n\t\t\t\t\t\t  New Year Gifts \n\n");	
			System.out.print("\t\t\t __________________________________________________________________ \n");
			System.out.print("\n\t\t\t\tPlease, Choose from the following Options: \n\n");
			System.out.print("\t\t\t _________________________________________________________________ \n");
			System.out.print("\t\t\t|                                           	                  |\n");
			System.out.print("\t\t\t|             1  >> See Only Chocolates                           |\n");
			System.out.print("\t\t\t|             2  >> See Only Sweets                               |\n");
			System.out.print("\t\t\t|             3  >> See Both Sweets and Chocolates                |\n");
			System.out.print("\t\t\t|             4  >> Exit                                          |\n");
			System.out.print("\t\t\t|_________________________________________________________________|\n\n");
  	while(true)
  	{
  		System.out.print("__________________\n");
  		System.out.print("Enter your choice:\n");
  		System.out.println("__________________");
  		int choice = sc.nextInt();
  		switch(choice)
  		{
  			case 1: System.out.println("\nAvailable Chocolate Products: ");
  					System.out.println("_______________________________\n");
						c.display(choco_name, choco_price, choco_weight);
  					System.out.println("\nEnter your price range: ");
  					System.out.println("_______________________________\n");
  					int myrange=sc.nextInt();
  					c.range(choco_name, choco_price, choco_weight, myrange);
  					break;
  			case 2: System.out.println("\nAvailable Sweet Products: ");
		    			System.out.println("_______________________________\n");
						s.display(swt_name, swt_price, swt_weight);
						System.out.println("\nEnter your price range: ");
						System.out.println("_______________________________\n");
						int myrange1=sc.nextInt();
						s.range(swt_name, swt_price, swt_weight, myrange1);
						break;
				case 3: System.out.println("\nAvailable Chocolate and Sweet Products: ");
  					System.out.println("_______________________________\n");
						c.display(choco_name, choco_price, choco_weight);
  					System.out.println("__________________________\n");
  					s.display(swt_name, swt_price, swt_weight);
  					System.out.println("\nEnter your price range For Chocolates: ");
  					System.out.println("_______________________________\n");
						int myrange2=sc.nextInt();
  					c.range(choco_name, choco_price, choco_weight, myrange2);
  					System.out.println("\nEnter your price range for Sweets: ");
						System.out.println("_______________________________\n");
						int myrange3=sc.nextInt();
						s.range(swt_name, swt_price, swt_weight, myrange3);
						break;
  			case 4: System.exit(0);
  			default: System.out.println("\nInvalid Entry Please try again!");
  		}
  	}
  }
}

