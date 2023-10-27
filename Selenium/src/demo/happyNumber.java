package demo;

public class happyNumber {

	public static void main(String[] args) {
		int num=89;

			int sum=0;
		int ld;
		while(num>0) {
			
			ld=num%10;
			happyNumber hn=new happyNumber();
		int squre=hn.square(ld);
		sum=sum+squre;
		//System.out.println(sum);
		num=num/10;
		}
        System.out.println(sum);
      
	
		if(num==sum) {
		System.out.println("yes");
	}
	else {
		System.out.println("not");
	}
	}
public int square(int ld) {
	int squ=ld*ld;
	return squ;
}
}
