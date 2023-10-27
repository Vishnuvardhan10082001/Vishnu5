package demo;

public class Even {

	public static void main(String[] args) {
		
		int f[]=text();
		for (int i = 0; i < f.length; i++) {
			System.out.println(i);
		}
		
	}
		
	public static int[] text() {
		// TODO Auto-generated method stub
		int a=10;
		int b=50;
		int []d=new int[30];
		int e=0;
		for(int i=a;i<=b;i++) {
			if(i%2==0) {
			d[e]=i;
			e++;
			}
			else {
			}
			}
		return d;
 
		}

	}


