package demo;

public class bouble {
	public static void main(String []args) {
		int []arr= {20,51,7,1,88,11,33,55};
		int []b=boouble(arr);
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		}
		public static int[] boouble(int []arr) {
			int n=arr.length;
			int temp=arr[0];
			for(int i=0;i<n-1;i++) {
				for(int j=0;j<n-1-i;j++) {
					if(arr[j]<arr[j+1]) {
						temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
						
					}
				}
			} return arr;
			
		}

}
