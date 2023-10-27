package demo;

public class pograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {2,6,5,7,11,1,1};
		int [] b=sort(a);
		for(int  i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}

	}
	public static int[] sort(int [] a) {
	int max;	
 int n=a.length;
 for(int i=0;i<n-2;i++) {
	 for(int j=0;j<=n-2-i;j++) {
		if(a[j]>=a[j+1]) {
			max=a[j];
			a[j]=a[j+1];
			a[j+1]=max;
			
		}
	 }
 }
return a;
		
		
	}

}
