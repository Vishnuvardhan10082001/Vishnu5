package demo;

import org.testng.annotations.Test;

public class arrayof {
	@Test
	public static void test()
	{
		arrayof a= new arrayof();
		arrayof a1= new arrayof();
		arrayof a2= new arrayof();
		arrayof a3= new arrayof();
		arrayof a4= new arrayof();
		arrayof []arr= {a,a1,a2,a3,a4};
		arrayof []ar=new arrayof[5];
		ar[0]=a1;
		ar[1]=a2;
		ar[2]=a3;
		System.out.println(ar.length);
		System.out.println(arr.length);
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		
	}

}
