package assessement;

import java.util.Scanner;
class Program1
{
	 
	public static void main(String[] args) 
	{
    Scanner sc= new Scanner(System.in);   
    System.out.println("Enter Gender as M or F : ");  
    String gender= sc.nextLine(); 
    gender.toUpperCase();
		
    System.out.println( "INCOME: " );
    int Income = sc.nextInt();
   
    System.out.println( "year: " );
    int year = sc.nextInt();
    int tax;
    if (gender.equals("F")||gender.equals("f"))
	{
		if(year==2011 || year==2012)
		{
			if(Income>=190000)
			{
 				System.out.println("NO TAX ");
			}
			else if(Income>=190001 && Income<=500000)
			{
				tax=(Income*10)/100;
 				System.out.println("TAX is " +tax);
			}
			else if(Income>=500001 && Income<800000)
			{
				tax=(Income*20)/100;
 				System.out.println("TAX is " +tax);
			}
			else if(Income>=800000)
			{
				tax=(Income*30)/100;
 				System.out.println("TAX is " +tax);
			}
		}
	}
	else if(gender.equals("M") || gender.equals("F")||gender.equals("f")||gender.equals("m"))
    	{
    			if(Income<=180000)
    			{
    				System.out.println("NO TAX");
    			}
    			else if(Income>=180001 && Income<=500000)
     			{
    				tax=(Income*10)/100;
     				System.out.println("TAX is " +tax);
     			}
     			else if(Income>=500001 && Income<800000)
     			{
     				tax=(Income*20)/100;
     				System.out.println("TAX is " +tax);

     			}
     			else if(Income>=800000)
     			{
     				tax=(Income*30)/100;
     				System.out.println("TAX is " +tax);

     			}
     		
     	}
	else {
		System.out.println("Enter correct gender");
	}

	}
	

}
