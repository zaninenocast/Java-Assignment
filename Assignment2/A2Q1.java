package simplilearn;

import java.util.Scanner;

public class A2Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your fir no");
		int b = scan.nextInt();
		if (b%2==0){
			System.out.println("odd");
		}
		else
		{
			System.out.println("even");
		}
		
		System.out.println("enter your value");
		int num = scan.nextInt();
		if (num <0)
		{
			num = (-1)*num;
			System.out.println(num);
		}
						
		scan.close();
	}


	}


