import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class E2E_Flow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\ishan\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");	
		 WebDriver driver = new FirefoxDriver();
		 String appUrl = "http://newtours.demoaut.com/mercurysignon.php";
		 driver.get(appUrl);
	     
		 driver.findElement(By.linkText("SIGN-ON")).click();
		 
		WebElement UserName= driver.findElement(By.name("userName"));
		UserName.sendKeys("Ishan");
	
		WebElement Password= driver.findElement(By.name("password"));
        Password.sendKeys("123");
        
        driver.findElement(By.name("login")).click();
        
        driver.findElement(By.linkText("registration form")).click();
	
        
		WebElement firstName= driver.findElement(By.name("firstName"));
		firstName.sendKeys("Ishan");
		
		WebElement lastName= driver.findElement(By.name("lastName"));
		lastName.sendKeys("Gupta");
		
		Select SelectCountry= new Select(driver.findElement(By.name("country")));
		SelectCountry.selectByValue("92");
		
		WebElement N_UserName =driver.findElement(By.name("email"));
		N_UserName.sendKeys("Ishan_Gupta_");
		
		WebElement O_Password =driver.findElement(By.name("password"));
		O_Password.sendKeys("1234");
		
		WebElement C_Password =driver.findElement(By.name("confirmPassword"));
		C_Password.sendKeys("1234");
		
		
		driver.findElement(By.name("register")).click();
		
		
		WebElement Content=driver.findElement(By.cssSelector("body > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(4) > td:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(3) > td:nth-child(1) > p:nth-child(3) > a:nth-child(1) > font:nth-child(1) > b:nth-child(1)"));
		
		if (Content!=null) {
			
			System.out.println("Content is present");
		}
		
		else 
		{
			System.out.println("Content is not present");
		
		}
		
		driver.findElement(By.linkText("sign-in")).click();


		WebElement UserName_N= driver.findElement(By.name("userName"));
		UserName_N.sendKeys("Ishan_Gupta_");
	
		WebElement Password_N= driver.findElement(By.name("password"));
        Password_N.sendKeys("1234");
	
        driver.findElement(By.name("login")).click();
        
         
        
}

}