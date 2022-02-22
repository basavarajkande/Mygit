package Login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadprofilepicture {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://edumatica.tk/login");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	//	System.out.println(driver.getPageSource());
		
		WebElement e1= driver.findElement(By.name("orgCode"));
		e1.sendKeys("institut34");
		
		WebElement e2= driver.findElement(By.name("mobileNumber"));
		e2.sendKeys("9535803470");
		
		WebElement e3= driver.findElement(By.name("password"));
		e3.sendKeys("W31come@123");
		
		WebElement e4 = driver.findElement(By.className("MuiButton-label"));
		e4.click();
		
		WebElement profile= driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/button/span[1]"));
	    profile.click();
	    
	    WebElement profile1= driver.findElement(By.xpath("//*[@id=\"menu-list-grow\"]/a[1]/div/div[2]"));
	    profile1.click();
	    
	    WebElement pick = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div[1]/div/div/div[2]/label/span"));
        pick.click();	  
	
        WebElement pick1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div[1]/div/div/div[2]/label/span"));
        pick1.sendKeys("C:\\Users\\Dell\\Downloads\\girl-with-cup.db9181d3");
	
	}

}
