package SeleniumPractice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Invoking Chrome browser
		System.setProperty("webdriver.chrome.driver", "E://chromedriver_win32/chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.saucedemo.com/v1/";
		driver.get(url);
		driver.findElement(By.id("user-name")).sendKeys("standad_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//String login_button = "//input[@id = 'login-button']";
		//driver.findElement(By.xpath(login_button)).click();
		
		
		String login_button = "input#login-button";
		driver.findElement(By.cssSelector(login_button)).click(); 		
		
		
		String error_txt = driver.findElement(By.xpath("//h3[@data-test = 'error']")).getText();
		System.out.println(error_txt);
		
		boolean a = error_txt.contains("Epic sadface");
		System.out.println(a);
		
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.close();		
		
		//List <WebElement> list1 = driver.findElements(By.xpath("//*[@id='checkbox-example']//input)"));
						
	}

}
