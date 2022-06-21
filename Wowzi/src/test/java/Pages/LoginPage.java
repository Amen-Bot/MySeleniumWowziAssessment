package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	 // Locator for Email Address
	@FindBy(how=How.ID, using = "email")
	@CacheLookup
     WebElement Email;
	
	// Locator for Password
	@FindBy(how=How.ID, using = "password")
	@CacheLookup
	WebElement Password;
	
	// Locator for LogIn Button
	@FindBy(how=How.LINK_TEXT, using = "Log In")
	@CacheLookup
	WebElement LogInButton;
	
	// Locator for Banner
	@FindBy(how=How.CSS, using = "#modal > div > div > div > p > svg")
	@CacheLookup
	WebElement Banner;
	
	// Locator for Settings Button
	@FindBy(how=How.CSS, using = "#app > div > div > div:nth-child(2) > div.navbar.no-select > nav > div.navbar__right-menu > a.navbar__icon.navbar__icon--close > svg > path")
	@CacheLookup
	WebElement SettingsIcon;
	
	// Locator for LogOut Button
	@FindBy(how=How.CLASS_NAME, using = "logout")
	@CacheLookup
	WebElement LogOutButton;


	public void setEmail(String email) {
		driver.findElement((By) Email).sendKeys(email);
	}
	
	public void setPassword(String password) {
		driver.findElement((By) Password).sendKeys(password);

    }
	
    public void clickLogInButton() {
    	driver.findElement((By) LogInButton).click();
		
	}
    
    public void clickBanner() {
    	driver.findElement((By) Banner).click();
		
	}
    
    public void clickSettingsIcon() {
    	driver.findElement((By) SettingsIcon).click();
	}
    
    public void clickLogOutButton() {
    	driver.findElement((By) LogOutButton).click();
		
	}
    
    public LoginPage(WebDriver driver)
    
    {
    	this.driver=driver;
        {
    		
    	
        }
    }
	
}

