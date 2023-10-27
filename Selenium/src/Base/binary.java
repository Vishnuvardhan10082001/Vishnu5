package Base;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.testng.annotations.Test;

public class binary  {
	@Test
public static  void main(String []args) {
		int n=5;
		
		for(int i=1;i<=n;i++) {
			int x=i;
			for(int j=n;j>i;j--){
				
				System.out.print(" ");
			}for(int j=i;j>=1;j--) {
				
				System.out.print(x+"");
				x++;
			}
			x--;
			for(int j=2;j<=i;j++) {
				x--;
				System.out.print(x);
				//x--;
			}
			System.out.println();
			}
		}
}

