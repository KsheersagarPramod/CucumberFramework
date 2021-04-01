package practices;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CRMFrm {
	
	
	
	
	public void clickonbutton(WebDriver driver, WebElement ele)
	{
		ele.click();
		
	}
	
	
	
	public static void main(String[] args) throws InterruptedException
	{
		
		CRMFrm crm=new CRMFrm();
		WebDriver driver;
		System.out.println("hii ");
		System.setProperty("webdriver.chrome.driver","D:\\chtome\\chromedriver.exe"); 
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		
//		driver.get("https://www.google.com/");
//		driver.findElement(By.xpath("//div[@jscontroller='iDPoPb']/input")).sendKeys("tools");
//		List<WebElement> ele=driver.findElements(By.xpath("//ul[@class='erkvQe']//li//span/b"));
//		System.out.println(ele.size());
//		for(int i=0;i<ele.size();i++)
//		{
//			String res=ele.get(i).getText();
//			System.out.println(res);
//			if(res.equalsIgnoreCase("names"))
//			{
//				ele.get(i).click();
//			}
//		}
		
		
		
///driver.get("https://ui.cogmento.com/");
//		
////		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("pkpramodksheersagar@gmail.com");
////		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Pramod@123");
////		driver.findElement(By.xpath("//div[text()='Login']")).click();
////		String title=driver.getTitle();
////		driver.manage().window().maximize();
////		
////		WebElement ele=driver.findElement(By.xpath("//div[@class='menu-item-wrapper']//a[@href='/home']"));
////		System.out.println(title);
////		Actions action=new Actions(driver);
////		action.moveToElement(ele).build().perform();
////		List<WebElement> usrList=driver.findElements(By.xpath("//div[@class='vertical-timeline vertical-timeline--animate vertical-timeline--one-column-left']/div//span[@class='user']//a"));
////		int size=usrList.size();
////		System.out.println(size);
////		driver.findElement(By.xpath("//div[@class='menu-item-wrapper']//a[@href='/contacts']")).click();
////		List<WebElement> ele11=driver.findElements(By.xpath("//table[@class='ui celled sortable striped table custom-grid']/tbody/tr/td[2]/a"));
////		for(int j=0;j<ele11.size();j++)
////		{
////			System.out.println(ele11.get(j).getText());
////		}
////		Thread.sleep(1000);
////		driver.findElement(By.xpath("//div[@class='ui inverted transparent left icon input']/input")).click();
////		List<WebElement> elee=driver.findElements(By.xpath("//a[text()='Irfan m Konnur']//parent::td//preceding-sibling::td//div/input"));;
////	    for(int i=0;i<elee.size();i++)
////	    {
////	    action.moveToElement(elee.get(i)).build().perform();
////	    elee.get(i).click();
////	    Thread.sleep(1000);
////
		
//	    }
		
	driver.get("https://ui.cogmento.com/");
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("pkpramodksheersagar@gmail.com");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Pramod@123");
	WebElement elee1=driver.findElement(By.xpath("//div[text()='Login']"));
	crm.clickonbutton( driver,  elee1);
	String title=driver.getTitle();
	driver.manage().window().maximize();
	
	WebElement ele=driver.findElement(By.xpath("//div[@class='menu-item-wrapper']//a[@href='/home']"));
	System.out.println(title);
	Actions action=new Actions(driver);
	action.moveToElement(ele).build().perform();
	driver.findElement(By.xpath("//a[@href='/contacts']")).click();
	driver.findElement(By.xpath("//a[@href='/contacts/new']")).click();
	driver.findElement(By.xpath("//form[@class='ui form segment custom-form-container']/div[@class='two fields']//input[@name='first_name']")).sendKeys("Arpita");
	driver.findElement(By.xpath("//form[@class='ui form segment custom-form-container']/div[@class='two fields']//input[@name='last_name']")).sendKeys("Ksheersagar");
	driver.findElement(By.xpath("//form[@class='ui form segment custom-form-container']/div[@class='two fields']//input[@name='middle_name']")).sendKeys("Pramod");
	driver.findElement(By.xpath("//form[@class='ui form segment custom-form-container']/div[@class='two fields']//div[@name='status']")).click();
	List<WebElement> elee=driver.findElements(By.xpath("//div[@class='visible menu transition']/div/span"));
	System.out.println(elee.size());
	for(int i=0;i<elee.size();i++)
	{
		System.out.println(elee.get(i).getText());
		String result=elee.get(i).getText();
		if(result.contains("Inactive"))
		{
			
			elee.get(i).click();
		}
	}
	
	driver.findElement(By.xpath("//div[@class='ui right secondary pointing menu toolbar-container']/div/button[2]")).click();
	driver.findElement(By.xpath("//div[@id='dashboard-toolbar']//button/i[@class='trash icon']")).click();
	
	driver.findElement(By.xpath("//button[@class='ui red button']")).click();
	}

}
