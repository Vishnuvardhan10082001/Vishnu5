package demo;

public class pattrens1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=7; 
int x=n/2+1;
for(int i=1;i<=n;i++) {
	
	for(int j=1;j<=n;j++) {
		if(i+j==5||i-j==3||i+j==11||j-i==3) {
			//System.out.print(i+"=="+j);
		System.out.print("*"+" ");
	}
		else {
			System.out.print(" ");
		}
	}
	System.out.println();
}
	}

}
