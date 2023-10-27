package demo;

public class oddsum {

	public static void main(String[] args) {
		int num=89;
		int num1=num;
		int ld;
		int sum=0;
		int fact;
		int count = count(num);
		while(num>0) {
			ld=num%10;
			 fact=facto(ld,count);
			 sum=sum+fact;
		     num=num/10;
		  count--;}
		System.out.println(sum);
		if (num1==sum) {
		System.out.println("s it is a armstrong number");}
		else {
			System.out.println("not ");
		}
	}
		public static int count(int n){
			int cou=0;
			while(n>0) {
				n=n/10;
				cou++;
					}
			System.out.println(cou);
			return cou;
		}
		public static  int facto(int ld,int count) {
			int fact=1;
			int sum=0;
			for (int i=0;i<count;i++){
				//System.out.println(i);
				fact=fact*ld;
			}sum=fact+sum;
		
			return sum;
		}
}
		
	
		
