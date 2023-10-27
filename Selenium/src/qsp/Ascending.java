package qsp;

public class Ascending {
       public static void main(String []args) {
    	   
       
	int []a= {1,55,77,88,22,6,2,101};
	int n=a.length;
	
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(a[i]<a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	  for(int i=0;i<n;i++) {
		  System.out.println(a[i]);
	  }
}}
