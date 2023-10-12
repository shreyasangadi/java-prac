package myfirstjavaprogram;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Invoking Chrome browser
		//System.setProperty("webdriver.chrome.driver", "E://chromedriver_win32/chromedriver.exe/");
		//WebDriver driver = new ChromeDriver();
		
		//Firefox launch
		System.setProperty("webdriver.chrome.driver", "E://chromedriver_win32/geckodriver.exe/");
		WebDriver driver = new FirefoxDriver();
		
		
		String url = "https://www.google.com";
		driver.get(url);
		String title = driver.getTitle();
		System.out.println(title);
		
		
		String url1 = driver.getCurrentUrl();
		System.out.println(url1);
		driver.close();

	}

}
