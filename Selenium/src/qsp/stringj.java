package qsp;

public class stringj {

	public static void main(String[] args) {
		String ch="";
		String num="";
		String str="AKDKD48DD8rr88D";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A'&&str.charAt(i)<='Z'||str.charAt(i)>='a'&&str.charAt(i)<='z') {
				ch=ch+str.charAt(i);
			}
			else {
				num=num+str.charAt(i);
			}
		}  System.out.println(ch);
		System.out.println("numbers in the string is ----->  "+num);

	}

}
