package adactin.healper;

import java.io.IOException;

public class FileReaderManager {
	private FileReaderManager() {
		
	}
public static FileReaderManager getinstance() {
	FileReaderManager frm =new FileReaderManager();
	return frm;

}
public ConfigurationReader getCRinstance() throws IOException {
	ConfigurationReader cr = new ConfigurationReader();
return cr;
}
	
}
