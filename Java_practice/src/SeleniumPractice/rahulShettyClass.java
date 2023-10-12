package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class rahulShettyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Invoking Chrome browser
				System.setProperty("webdriver.chrome.driver", "E://chromedriver_win32/chromedriver.exe/");
				WebDriver driver = new ChromeDriver();
				
				String url = "https://rahulshettyacademy.com/AutomationPractice/";
				driver.get(url);
				
				WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
				
				int count1 = footerdriver.findElements(By.tagName("a")).size();
				System.out.println(count1);
				
				String text = "Shryas";
				
				driver.findElement(By.xpath("//*[@name=\"enter-name\"]")).sendKeys(text);
				driver.findElement(By.xpath("//*[@id=\"alertbtn\"]")).click();
				
				String text1 = driver.switchTo().alert().getText();
				System.out.println(text1);
				driver.switchTo().alert().accept();
				
				//driver.switchTo().fram
				
				Actions a = new Actions(driver);
				
				
				
				
				
				
				
				driver.close();

	}

}
