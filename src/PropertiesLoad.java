import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.System.Logger;
import java.util.Properties;



public class PropertiesLoad {

//private static org.apache.log4j.Logger log= LogManager.getLogger(PropertiesLoad.class.getName());	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			Properties prop=new Properties();
			FileInputStream fip=new FileInputStream("C:\\Users\\Raghavendra N\\eclipse-workspace\\CoreJava\\data.properties");
			prop.load(fip);
			//log.info("log informaration");
			System.out.println(prop.getProperty("url"));
			System.out.println(prop.getProperty("url"));
			System.out.println("Develop branch changes");
			
			prop.setProperty("name", "ragh");
			prop.setProperty("secondName", "ragh");
			FileOutputStream fos= new FileOutputStream("C:\\Users\\Raghavendra N\\eclipse-workspace\\CoreJava\\data.properties");
			prop.store(fos, null);
	}

}
