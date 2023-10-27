package demo;

public class summ {

	public static void main(String[] args) {
		int a=371;
		int sum=0;
		int squ=1;
		int count=square(371);
		System.out.println(count);
		/*while(a>0) {
			int num=a/10;
			for(int i=1;i<=count;i++) {
				
				squ=squ*num;
				sum=sum+squ;
				a=a/10;
				}
			System.out.println(sum);
		}*/
	
	
	}
   static int square(int x) {
	   int count=0;
	   while(x>0) {
		 
		   
		   x=x/10;
		   count++;}
	   
	return x;
	   
   }
}
