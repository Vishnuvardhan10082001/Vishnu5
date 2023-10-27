package demo;

public class xylam {

	public static void main(String[] args) {
		int num=693;
		int os=0,ms=0,temp=num;
		do {
			int d=temp%10;
			if(num==temp||temp==d) {
				os=os+d;}
			else {
				ms=ms+d;
			}
	
			temp=temp/10;
			}while(temp>0);
		System.out.println("os"+os);
		System.out.println(ms+"ms");
	}
    
}
