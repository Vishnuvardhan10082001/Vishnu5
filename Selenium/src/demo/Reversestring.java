package demo;

public class Reversestring {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String s1= "vishnu";
			String s2=" ";
			for(int i=s1.length()-1;i>=0;i--) {
				 s2=s2+s1.charAt(i);
			}
	  System.out.println(s2);
		}

	}


