package cpm.qa.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.utils.Utility;

//import edu.emory.mathcs.backport.java.util.concurrent.TimeUnit;

//import edu.emory.mathcs.backport.java.util.concurrent.TimeUnit;

public class Testbase {
	
	public WebDriver driver;
	public FileInputStream file;
	public Properties prop;
	public Testbase()
	{
		
		try {
			 file=new FileInputStream("C:\\Users\\pramo\\eclipse-workspace\\FreeeCRMcucumberBDDFramework123\\src\\main\\java\\cpm\\qa\\config\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("file not found");
		}
		
		prop=new Properties();
		try {
			prop.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public WebDriver initialization()
	{
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\\\chtome\\\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\chtome\\chromedriver.exe");
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("please slect the correct browser");
		}
		
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
		return driver;
	}
	
		}

	
	
	
	
