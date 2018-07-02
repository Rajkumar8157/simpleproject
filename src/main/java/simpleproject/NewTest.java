package simpleproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {

	public WebDriver driver;
	 
	  @Test
	  public void openMyBlog() throws InterruptedException {
	 driver.get("https://www.softwaretestingmaterial.com/");
	 Thread.sleep(100);
	 driver.findElement(By.xpath("//img[@alt='Selenium Tutorial']")).click();
	 Thread.sleep(100);
	 String title = driver.getTitle();
	 System.out.println("Title is ="+title);
	  }
	  
	  @BeforeClass
	  public void beforeClass() {
	   
	   System.setProperty("webdriver.chrome.driver", "E:\\gitworkspace\\SimpleProject\\drivers\\chromedriver.exe");
	   driver = new ChromeDriver();
	   
	  }
	 
	  @AfterClass
	  public void afterClass() {
	   driver.quit();
	  }
	 
	}
