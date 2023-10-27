package qsp;

public class Palindrome {

	public static void main(String[] args) {
		String a="kmadamk";
		Boolean b = palin(a);
		System.out.println(b);
	}
	public static Boolean palin(String a) {
	int i=0;
	int j=a.length()-1;
	while(i<j) {
		if(a.charAt(i)==a.charAt(j)) {
			return true;
		}
		i++;
		j--;
	}
	return false;

}
}