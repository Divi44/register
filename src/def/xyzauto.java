package def;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class xyzauto {
	
	
	@DataProvider
	public Object[][] data(){
	 Object[][] num = new Object[2][2];
	 num[0][0]= "abc@gmail.com";
	 num[0][1]= "abc";
	 num[1][0]= "admin@gmail.com";
	 num[1][1]= "admin";
		
		
		return num;
	}
	@Test(dataProvider="data")
	public void getData(String username,String password) {
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		System.out.println("Pass");
		System.out.println("successful");
		
		//driver.quit();
		
	}

}
