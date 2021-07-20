package assessement;

import java.util.Scanner;

public class Program2 {
	
	public void calculate(int eggs){
		
		int gross= eggs/144;
		int left = eggs%144;
		
		int dozen=left/12;
		int extra=left%12;
		
		System.out.println(gross +"gross , "+dozen+"dozen , "+extra+"eggs.");
		
	}

	public static void main(String[] args) {
		
		Program2 p2=new Program2();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of eggs");
		int eggs= sc.nextInt();
		p2.calculate(eggs);
		sc.close();
		
	}

}
