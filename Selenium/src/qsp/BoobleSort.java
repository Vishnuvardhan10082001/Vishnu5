package qsp;

import java.lang.reflect.Array;

public class BoobleSort {

	public static void main(String[] args) {
		int []a={2,8,7,6,5,7};
		int [] b=sort(a);
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}


	public static int[] sort( int [] a) {
		int n=a.length;
		int temp;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {

				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}   return a;
		
		}
	}

