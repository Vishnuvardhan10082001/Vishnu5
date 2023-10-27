package demo;

public class strong {

	public static void main(String[] args) {
		int num=145;
		int sum=last(num);
		System.out.println(num+ "  sum is the"+sum);
	}
	public static int last(int num) {
		int ld;
		int sum=0;
		while(num>0) {
			ld=num%10;
			int fact=fact(ld);
			sum=sum+fact;
			num=num/10;
		}return sum;
	}
	public static int fact(int ld) {
		int fac=1;
		int sum=0;
		for (int i=ld;i>0;i--) {
			fac=i*fac;
			
			System.out.println("fac"+fac);
		}sum=sum+fac;
		System.out.println("sum"+sum);
		return sum;
	}

}
