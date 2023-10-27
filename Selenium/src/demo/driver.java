package demo;

import org.testng.annotations.Test;

public class driver {
	@Test
	public void text()
	{
		bike b1=new bike("tvs",50,85500.00);
		bike b2=new bike("hero",55,95000.0);
		bike b3=new bike("pulsor",35,150000.0);
		bike []br= {b1,b2,b3};
		System.out.println(br);
		for(int i=0;i<br.length;i++) {
			System.out.println(br[i].name);
			System.out.println(br[i].mileage);
			System.out.println(br[i].cost);
	System.out.println("======================================");
		}
	}
}

