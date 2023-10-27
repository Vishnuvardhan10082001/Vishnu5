package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertyFileReading {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
@Test
public void Property() throws IOException {
	FileInputStream fis=new FileInputStream("./data/comman.praperty.txt");
	Properties p=new Properties();
	p.load(fis);
	System.out.println(p.getProperty("usn"));
	System.out.println(p.getProperty("url"));
	System.out.println(p.getProperty("psw"));
}
}
