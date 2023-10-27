package qsp;

public class pg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int st=n/2;
		int num=1;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=st;j++) {
				System.out.print(" ");	
			} int x=i;
			for(int j=1;j<=2*i-1;j++) {
				System.out.print(x);
				if(j>=1) {
					x--;
				}
				else {
					x++;
				}
				
			}System.out.println();
		}

	}

}
