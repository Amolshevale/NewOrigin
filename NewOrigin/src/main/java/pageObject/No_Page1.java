package pageObject;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class No_Page1 {
	public WebDriver driver;
	public String user;
	public String pass; 
	
	@FindBy(id = "email")
	public WebElement username;

	@FindBy(id = "pass")
	public WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement loginbutton;

	public void initElement(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	
	public void cred(String user, String pass) throws InterruptedException {
		
		username.sendKeys(user);
		password.sendKeys(pass);
		Thread.sleep(3000);
		loginbutton.click();
		Thread.sleep(3000);

	}

}
