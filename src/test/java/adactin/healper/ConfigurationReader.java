package adactin.healper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	Properties p;
	public ConfigurationReader() throws IOException  {
		
File f= new File("C:\\Users\\ksant\\eclipse-workspace\\Adactin_project2\\src\\test\\java\\adactin\\healper\\Adactin.property");
FileInputStream is = new FileInputStream(f);
p= new Properties();
p.load(is);
	}
	
	public  String launchBrowser() {
		String browsername = p.getProperty("browser");
		return browsername;
		

	}
	public   String passurl() {
		String urlname = p.getProperty("url");
		return urlname;

	}
}
