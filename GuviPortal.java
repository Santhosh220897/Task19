package task19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GuviPortal {

	public static void main(String[] args) {

		// Implement the webdriver to open the chromebrowser

		WebDriver driver = new ChromeDriver();

		// Maximize the window

		driver.manage().window().maximize();

		// Navigate to url

		driver.get("https://www.guvi.in/register");

		// Locating name Text box Element

		WebElement firstName = driver.findElement(By.id("name"));

		firstName.sendKeys("test");

		// Locating the EmailId Field

		WebElement emailId = driver.findElement(By.cssSelector("#email"));

		emailId.sendKeys("sankisanthoshkumar@gmail.com");

		// Locating the password Field

		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));

		password.sendKeys("Sankumar@1504");

		// Locating the Mobile Number Field

		WebElement mobileNo = driver.findElement(By.id("mobileNumber"));

		mobileNo.sendKeys("8098610824");

		// Locating & printing the Head Text

		WebElement heading = driver.findElement(By.className("mainHeading"));

		System.out.println(heading.getText());

		// Locating and printing the Sub heading

		WebElement subHeading = driver.findElement(By.xpath("(//span[text()='FREE with GUVI!'])[1]"));

		System.out.println(subHeading.getText());

		// Locating and printing the sub text

		WebElement subHead = driver.findElement(By.className("sub-head"));

		System.out.println(subHead.getText());

		//Locating the Signup Text
		
		WebElement SignUpText = driver.findElement(By.tagName("h2"));

		System.out.println(SignUpText.getText());

		//Locating the Login link and clicking as we already hava account
		
		WebElement login = driver.findElement(By.linkText("Login"));

		login.click();
		
		//Locating the emailId and sending keys

		WebElement emailId1 = driver.findElement(By.id("email"));

		emailId1.sendKeys("santhoshkumar220897@gmail.com");
		
		//Locating the password and entering

		WebElement password1 = driver.findElement(By.xpath("//input[@type='password']"));

		password1.sendKeys("Santhosh@2208");
		
		//Selecting the option keepsigned in

		WebElement keepSignin = driver.findElement(By.name("logged-in"));

		keepSignin.click();
		
		//Login

		WebElement signin = driver.findElement(By.id("login-btn"));

		signin.click();
		
		//Close the browser

		driver.quit();

	}

}
