package Utilities;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class ConfigReader {
	  private static Properties properties;

	    static {
	        try (FileInputStream input = new FileInputStream("C:\\Users\\VGANJIX\\OneDrive - Intel Corporation\\Documents\\Vinay\\Automation Practice\\Intel_ISVC\\Intel_ISVC_R4C\\src\\test\\java\\config.properties")) {
	            properties = new Properties();
	            properties.load(input);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public static String getProperty(String key) {
	        return properties.getProperty(key);
	    }
}
