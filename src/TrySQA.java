import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TrySQA {
	 String appUrl = "https://jenkins.io/download/";
	 WebDriver driver;

@BeforeTest
public void setBaseUrl(){

	 System.setProperty("webdriver.gecko.driver", "\r\n" + 
	 		"C:\\\\Users\\\\ishan\\\\Downloads\\\\geckodriver-v0.21.0-win64\\\\geckodriver.exe");	
	 WebDriver driver = new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.get(appUrl);
	 String actualTitle = driver.getTitle(); 
     System.out.println("Page is "+actualTitle);
}
	
@Test(priority=0)
public void jenkinPage() {
	
     

 /*  try {
     Assert.assertNotNull(actualTitle);
     System.out.println("Test Passed");
    }       
   catch(Throwable e)
   {
	     System.out.println("Test Failed");
   }
 */
}    
@Test(priority=1)

public void jenkinOperation() {

            WebElement search = driver.findElement(By.id("lst-ib"));
            search.sendKeys("Selenium");
            WebElement searchButton = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[3]/center/input[1]"));
            searchButton.click();
            driver.close();
	  }	  
	  
//@AfterTest()

{
	
     }
}
