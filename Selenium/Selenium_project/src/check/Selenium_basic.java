package check;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;

public class Selenium_basic {

	public static void main(String[] args) {
		// instanciar a class webdriver
		WebDriver driver = new FirefoxDriver();
        driver.get("http://google.pt");
       try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
        
        driver.close();
	} 

}
