package qsp;

public class big {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5; 
	for(int i=n;i>=1;i--) {
		int st=i;
		for(int j=n;j>i;j--) {
			System.out.print(" ");
		}int x=1;
		for(int j=1;j<=2*i-1;j++) {
			System.out.print(x);
			if(j<st) {
				x++;
			}else {
				x--;
			}
			
		}System.out.println();
	}  int sp=1;
			for(int i=1;i<=n;i++) {
				int x=1;
				for(int j=n;j>i;j--) {
					System.out.print(" ");
			}for(int j=1;j<=2*i-1;j++) {
				System.out.print(x);
				if(j<i) {
					x++;
					sp=sp+2;
				}
				else {
					x--;
					sp=sp-2;
				}

	}System.out.println();

}}}
