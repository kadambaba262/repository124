package demowebshop_Configue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Read_Configue_Properties {
	
	Properties pro;

	public Read_Configue_Properties(){
		
		File src= new File("C:\\Users\\kadam\\eclipse-workspace\\DemoWeb\\src\\main\\java\\demowebshop_Configue\\Configue.properties");
	
		FileInputStream fis;

		try {
			fis = new FileInputStream(src);
			pro = new Properties();
			try {
				pro.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {

			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public String ChromePath() {
		String url = pro.getProperty("chromepath");
		return url;
	}
	
	public String email() {
		String mail = pro.getProperty("Email");
		return mail;
	}
	
	public String Password() {
		String pwd = pro.getProperty("Pass");
		return pwd;
	}
}
