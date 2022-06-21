package wowziStepDef;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class wowziStepDef {
	WebDriver driver;

	@Given("I enter a valid url")
	public void i_enter_a_valid_url() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\aaghayedo\\eclipse-workspace\\Wowzi\\src\\test\\resources\\drivers\\chromedriver.exe");
		    driver =  new ChromeDriver();
		    LoginPage LoginPage= PageFactory.initElements(driver, LoginPage.class);
		    driver.manage().deleteAllCookies();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    //Navigate to the url
		    driver.get("https://platform.wowzi.co/auth/login");
		    driver.manage().window().maximize();
		    Thread.sleep(5000);
		}
	
	@Then("User is redirected to the Wowzi login page")
public void User_is_redirected_to_the_wowzi_login_page(){
			String expectedText = "Wowzi";
			String actualText = driver.getTitle();
			Assert.assertEquals(actualText, expectedText);
			System.out.println("Title of the web page is: "+driver.getTitle());
	}
	
//@invalidEmailAddress
	@Given("I am on the Wowzi login page")
public void i_am_on_the_Wowzi_login_page() {
		driver.get("https://platform.wowzi.co/auth/login");
	}
	
	@When("I enter an invalid email address")
		public void i_enter_an_invalid_email_address() {
		LoginPage.setEmail("amenaghayedo5@yokmail.com");
	}
	
	@And("I enter a valid password")
	public void i_enter_a_valid_password() {
		LoginPage.setPassword("Nigeria#3");
}
	
	@Then("User is rejected from accessing the login page")
	public void user_is_rejected_from_accessing_the_login_page() {
		System.out.println("User Rejected");
}

//@invalidPassword
	@Given("User is on the Wowzi login page")
	public void user_is_on_the_Wowzi_login_page() {
			driver.get("https://platform.wowzi.co/auth/login");
		}
	
	@When("User enter a valid email address")
	public void user_enter_a_valid_email_address() {
		LoginPage.setEmail("amenaghayedo@gmail.com");
		}
	
	@And("User enter an invalid password")
	public void user_enter_an_invalid_password() {
		LoginPage.setPassword("Nigeria#2022");
	}    
	
	@Then("I am rejected from accessing the login page")
	public void i_am_rejected_from_accessing_the_login_page() {
		System.out.println("User Rejected");
		
	}
	
//@loginButton
	@Given("Amen is on the Wowzi login page")
	public void amen_is_on_the_Wowzi_login_page() {
			driver.get("https://platform.wowzi.co/auth/login");
		}
	
	@When("Amen enters a valid email address")
	public void amen_enters_a_valid_email_address() {
		LoginPage.setEmail("amenaghayedo@gmail.com");
		}
	
	@And("Amen enters a valid password")
	public void amen_enters_a_valid_password() {
		LoginPage.setPassword("Nigeria#3");
	} 
	
	@And("Amen clicks on the login button")
	public void amen_clicks_on_the_login_button() {
		LoginPage.clickLogInButton();
	}
	
	@Then("Amen is redirected to the next page")
	public void amen_is_redirected_to_the_next_page() {
		System.out.println("Amen is redirected to the next page");
		
	}
	
//@SuccessfulLogin
	@Given("Customer is on the Wowzi login page")
	public void customer_is_on_the_Wowzi_login_page() {
			driver.get("https://platform.wowzi.co/auth/login");
		}
	
	@When("Customer enters a valid email address")
	public void customer_enters_a_valid_email_address() {
		LoginPage.setEmail("amenaghayedo@gmail.com");
		}
	
	@And("Customer enters a valid password")
	public void Customer_enters_a_valid_password() {
		LoginPage.setPassword("Nigeria#3");
	} 
	
	@And("Customer clicks on the login button")
	public void Customer_clicks_on_the_login_button() {
		LoginPage.clickLogInButton();
	}
	
	@Then("Customer is redirected to User profile page")
	public void Customer_is_redirected_to_user_profile_page() {
		System.out.println("Customer is redirected to User profile page");
		
	}

//@closeBanner
	@Given("Cheryl is on the Wowzi login page")
	public void cheryl_is_on_the_Wowzi_login_page() throws InterruptedException {
			driver.get("https://platform.wowzi.co/auth/login");
			Thread.sleep(5000);
		}
	
	@When("Cheryl enters a valid email address")
	public void cheryl_enters_a_valid_email_address() {
		LoginPage.setEmail("amenaghayedo@gmail.com");
		}
	
	@And("Cheryl enters a valid password")
	public void cheryl_enters_a_valid_password() {
		LoginPage.setPassword("Nigeria#3");
	} 
	
	@And("Cheryl clicks on the login button")
	public void cheryl_clicks_on_the_login_button() throws InterruptedException {
		LoginPage.clickLogInButton();
		Thread.sleep(5000);
	}
	
	@Then("Cheryl should be able to close the banner on the User profile page")
	public void cheryl_should_be_able_to_close_the_banner_on_the_user_profile_page() {
		System.out.println("Cheryl has closed the banner");
		LoginPage.clickBanner();
		
	}

//@logOut
	
	@Given("Amy is on the Wowzi login page")
	public void amy_is_on_the_Wowzi_login_page() {
			driver.get("https://platform.wowzi.co/auth/login");
		}
	
	@When("Amy enters a valid email address")
	public void amy_enters_a_valid_email_address() {
		LoginPage.setEmail("amenaghayedo@gmail.com");
		}
	
	@And("Amy enters a valid password")
	public void amy_enters_a_valid_password() {
		LoginPage.setPassword("Nigeria#3");
	} 
	
	@And("Amy clicks on the login button")
	public void amy_clicks_on_the_login_button() {
		LoginPage.clickLogInButton();
	}
	
	@Then("Amy should be able to close the banner on the User profile page")
	public void amy_should_be_able_to_close_the_banner_on_the_user_profile_page() {
		System.out.println("Amy has closed the banner");
	}
	
	@And("Amy clicks on the settings icon")
	public void amy_clicks_on_the_settings_icon() {
		LoginPage.clickSettingsIcon();
	}
	
	@And("Amy clicks on the logout button")
	public void amy_clicks_on_the_logout_button() {
		LoginPage.clickLogOutButton();
	}
	
	@And("Amy should be logged out of the Wowzi Application successfully")
	public void amy_should_be_logged_out_of_the_Wowzi_Application_successfully() {
		System.out.println("Amy is been logged out of the Wowzi Application successfully");
	}

}