package demo;

public class bhim {


	public static  void main(String [] args) {
		// TODO Auto-generated method stub
		int []a= {9,8,7,5,6,78,9};
		int n=a.length;

		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}
}
