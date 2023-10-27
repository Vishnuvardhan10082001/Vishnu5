package qsp;

public class palin {

	public static void main(String[] args) {
		Boolean ans = palind("ramara");
              System.out.println(ans);
	}
public static Boolean palind(String  a) {
	int i=0;
	int j=a.length()-1;
	System.out.println("j value"+j);
	while(i<j) {
		if(a.charAt(i)!=a.charAt(j)) {
			return false;
		}
		i++;
		j--;
	}
	return true;
}
}
