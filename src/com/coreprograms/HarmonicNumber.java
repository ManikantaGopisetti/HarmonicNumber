package com.coreprograms;
import java.util.Scanner;

public class HarmonicNumber {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("enter n value = ");
		int n = scan.nextInt();
		
		if(n!=0) {
			
			double harmonicNum=0;
			for(int i=1;i<=n;i++) {
				harmonicNum=harmonicNum+1/(double)i;	
			}
			System.out.println(n+"th harmonic value = "+harmonicNum);
			
			
		}
		else {
			System.out.print("entered n value should not be 0 ");
		}
		
	}

}
