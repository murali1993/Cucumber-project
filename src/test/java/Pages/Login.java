package Pages;

import org.dom4j.rule.Action;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.thucydides.core.annotations.findby.By;

public class Login {

	public static WebDriver driver;

	public void Home() throws InterruptedException {

		String path = System.getProperty("user.dir") + "\\chromedriver.exe";
		System.out.println(path);

		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();

		driver.get("https://kanbanflow.com/");
	}

	public void loginpage() {

		driver.manage().window().maximize();
		WebElement loginbtn = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		loginbtn.click();
	}

	public void login() {

		WebElement email = driver.findElement(By.xpath("//input[contains(@id,'email')]"));
		email.click();
		email.sendKeys("muralimuthaiyah1811@gmail.com");

		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.click();
		password.sendKeys("123456789");
		WebElement signInSubmit = driver.findElement(By.xpath("//button[@type='submit']"));
		signInSubmit.click();

		WebElement prof = driver.findElement(By.xpath("//img[@id='menuLinks-avatar']"));
		prof.click();
	}

	public void logout() throws InterruptedException {

		Thread.sleep(2000);
		WebElement logout = driver.findElement(By.xpath("//a[@class='menuLinks-logout userMenu-item userMenu-link']"));
		logout.click();
	}

}
