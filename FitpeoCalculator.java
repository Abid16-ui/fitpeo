import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FitpeoCalculator 
{
	public static void main(String[] args) throws AWTException 
	{
		//Navigate to the FitPeo Homepage:
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fitpeo.com/");
			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to the Revenue Calculator Page:
		driver.findElement(By.xpath("//div[text()='Revenue Calculator']")).click();	
		
		//Scroll Down to the Slider section:
		WebElement txt=driver.findElement(By.xpath("//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng']"));
		txt.sendKeys(Keys.ENTER);
		Actions a=new Actions(driver);
		a.sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys("820").perform();
		
		//Select CPT Codes:
		driver.findElement(By.xpath("(//*[@class='PrivateSwitchBase-input css-1m9pwf3'])[1]")).click();
		driver.findElement(By.xpath("(//*[@class='PrivateSwitchBase-input css-1m9pwf3'])[2]")).click();
		driver.findElement(By.xpath("(//*[@class='PrivateSwitchBase-input css-1m9pwf3'])[3]")).click();
		driver.findElement(By.xpath("(//*[@class='PrivateSwitchBase-input css-1m9pwf3'])[8]")).click();
		
	}
}