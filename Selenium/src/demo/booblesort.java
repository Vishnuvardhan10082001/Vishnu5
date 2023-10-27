package demo;

public class booblesort {

	public static void main(String[] args) {
		int []arr= {2,2,7,3,6,9,8,9};
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			System.out.println("====================");
			
		}
		test(arr);
	}
	public static void test(int arr[]) {
	   int n = arr.length;
	   int temp;
	   for(int i=0;i<=n-2;i++) {
		   for(int j=0;j<=n-2-i;j++) {
			   if(arr[j]>=arr[j+1]) {
				   temp=arr[j];
				   arr[j]=arr[j+1];
				   arr[j+1]=temp;
			   }
		   }
	   }
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);}
		
   }
	}


