package qsp;

public class dimond {
	public static void main (String[]args) {
		int n=7;
		int st=1;
		int sp=n/2;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print(" ");
			}int x=1;
			for(int j=1;j<=st;j++) {
				System.out.print(x);
				if(j<=st/2) {
					x++;
				}
				else {
					x--;
				}
			}if(i<=n/2) {
				sp--;
				st=st+2;

			}
			else {
				sp++;
				st=st-2;
			}System.out.println();
		}
	}

}
