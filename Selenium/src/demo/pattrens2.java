package demo;

public class pattrens2 {

	public static void main(String[] args) {
		int n=5; int k=1;
		for(int i=n;i>=1;i--) {
			int x=1;

			for(int j=i;j<n;j++) {
				System.out.print(" ");

			}
			for(int j=1;j<=i;j++) {
				System.out.print(x);
				x++;
				if(j<i) {
					System.out.print("*");
				}
			}
			
			for(int j=i;j<n;j++) {
				x--;
				System.out.print(" ");

			}System.out.println();
		}
	}
}
