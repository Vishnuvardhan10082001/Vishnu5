package demo;

public class fibnosireccertion {

	public static void main(String[] args) {
		fib(1,0,1);
	}
     
		public static void fib(int a,int f1,int f2) {
		
		int temp;
	
        if(a==9) {
        	return ;
        }
        	System.out.println(f1);
        	temp=f1+f2;
        	f1=f2;
        	f2=temp;
        	
        	a++;
            fib(a,f1,f2);
        }
        
		}


