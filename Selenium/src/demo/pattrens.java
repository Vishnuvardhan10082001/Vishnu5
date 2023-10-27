package demo;

import java.util.Scanner;

public class pattrens {
	public static void main(String []args) {
	
		int n=5;
		for(int i=1;i<=n;i++) {
			int x=i;
			for(int j=n;j>=i;j--) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			for(int j=2;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}		
	}}
