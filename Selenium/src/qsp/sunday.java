package qsp;

public class sunday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {2,10,3,4,5,11};
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}   
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
