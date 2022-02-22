package Login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://app.edumatica.io/login");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	//	System.out.println(driver.getPageSource());
		
	//	WebElement e1= driver.findElement(By.name("orgCode"));
	//	e1.sendKeys("institut38");
		
		WebElement e2= driver.findElement(By.name("mobileNumber"));
		e2.sendKeys("9535803470");
		
		WebElement e3= driver.findElement(By.name("password"));
		e3.sendKeys("W31come@123");
		
		WebElement e4 = driver.findElement(By.className("MuiButton-label"));
		e4.click();
		
		WebElement e5= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div/form/div[2]/div[2]/div/div/input"));
		e5.sendKeys("Basavakalyan Engineering College Basavakalyan");
		Thread.sleep(3000);
		
		WebElement e6 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div/form/div[3]/div[2]/div/div/input"));
		e6.sendKeys("Basawaarj.kande@mu-zero.io");
		Thread.sleep(3000);
		
		WebElement e7 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div/form/div[4]/div[2]/div/div/input"));
		e7.sendKeys("bangalore");
		Thread.sleep(3000);
		
		WebElement e8= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div/form/div[5]/div[2]/div/div/input"));
		e8.sendKeys("201001");
		Thread.sleep(3000);
		
		WebElement e9= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div/form/div[8]/button"));
		e9.click();
		Thread.sleep(3000);
		
		WebElement e10= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div/div[2]/div[2]/div/div/div"));
		e10.click();
		Thread.sleep(3000);
		
		WebElement board = driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[2]"));
		board.click();
		Thread.sleep(3000);
		
		WebElement cls = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div/div[3]/div[2]/div/div/div"));
		cls.click();
		Thread.sleep(3000);
		
		WebElement classselect = driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[6]"));
		classselect.click();
		Thread.sleep(3000);
		
		WebElement sub1 = driver.findElement(By.name("Mathematics"));
		sub1.click();
		Thread.sleep(3000);
		
		WebElement sub2 = driver.findElement(By.name("Science"));
		sub2.click();
		Thread.sleep(3000);
		
		WebElement add = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div/div[5]/div/button"));
		add.click();
		Thread.sleep(3000);
		
		WebElement nextstep = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div/div[7]/div[2]/button/span[1]"));
		nextstep.click();
		Thread.sleep(3000);
		
		WebElement btype = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div/div[2]/div[2]/div/div/div"));
		btype.click();
		Thread.sleep(3000);
		
		WebElement btype2 = driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[7]"));
		btype2.click();
		Thread.sleep(3000);
		
		WebElement doi = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div/div[3]/div[2]/div/div/input"));
		doi.sendKeys("25-03-1995");
		Thread.sleep(3000);
		
		WebElement BPAN = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div/div[4]/div[2]/div/div/input"));
		BPAN.sendKeys("BBRTA9087Q");
		Thread.sleep(3000);
		
		WebElement Bname = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div/div[5]/div[2]/div/div/input"));
		Bname.sendKeys("Teaching and training institute");
		Thread.sleep(3000);
		
		WebElement OPAN = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div/div[6]/div[2]/div/div/input"));
		OPAN.sendKeys("kjhgf9999p");
		Thread.sleep(3000);
		
		WebElement Oname = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div/div[7]/div[2]/div/div/input"));
		Oname.sendKeys("basavaraj kande");
		Thread.sleep(3000);
		
		WebElement finish = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div/div[8]/div[2]/button"));
	    finish.click();
		Thread.sleep(3000);
		
	
		
	
		
		
		
		
		

	}

}
