package qsp;

public class Converting {
	public static boolean name(String str) {
		int i=0;
		int j = str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)){
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		String str="madam";
		boolean res = name(str);
		System.out.println(res);
	}



}
