package testNG;

import javax.swing.GroupLayout.Group;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	public WebDriver driver;
	

	@BeforeTest
	public void login() throws InterruptedException {
		String email = "e.tayeh@yahoo.com";

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		driver.findElement(By.xpath("//*[@id=\"login_field\"]")).sendKeys(email);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("201010566Ehab");
		driver.findElement(By.xpath("//*[@id=\"login\"]/div[4]/form/div/input[11]")).click();

	}

	@Test(groups = "family")
	public void test_Title() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "GitHub";
		Assert.assertEquals(actualTitle, expectedTitle);

	}

	@Test(groups = "family")
	public void tet_LogutProcess() {
		System.out.println("Logged Out ");
	}

	@Test
	public void tet_ExitingUserName() {
		System.out.println("Name ");
	}

}
