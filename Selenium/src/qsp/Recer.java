package qsp;

import org.apache.poi.hssf.record.PageBreakRecord.Break;

public class Recer {

	
	public static void main(String[] args) {
		int n=2;
		int a=20;
		int i=1;
		String c="even";
		String d="odd";
		while(i<a) {
		System.out.println(i%2==0?d:c+"<--->"+i);
		i++;
		}
	}

}
