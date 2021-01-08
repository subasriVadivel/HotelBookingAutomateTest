package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;

import AutomationTest.HotelBooking.globalDriver;

@RunWith(Cucumber.class)

public class StepDefinitionHotel extends globalDriver {

@Given("^Intialize the browser with chrome$")
public void initialize_the_browser_login_page() throws Throwable{
driver.get("file:///E:/Selenium/login.html");
 driver=initializeDriver();
}
	@And("Navigate to hotel booking login page \"([^\"]*)\"$")
	public void navigate_to_hotel_booking_login_page(String strArg1) throws Throwable{
		driver.get("file:///E:/Selenium/login.html");
		driver.get(strArg1);
	}
		@And("Verify login page heading as Hotel Booking Appplication$")
		public void verify_login_page_heading() throws Throwable {
		String PageHeading=driver.findElement(By.xpath("//*[@id=\"mainCnt\"]/div/div/h1")).getText();
		System.out.println("page heading is" + PageHeading);
		}
						
		@When("User login into application without username \"([^\"]*)\"$")
		public void user_login_into_application_username(String strArg1) throws Throwable{
		driver.findElement(By.name("Username")).sendKeys(strArg1);
		driver.findElement(By.cssSelector(".btn")).click();
		}
		
		@Then("Please enter username error message should be populate$")
		public void enter_username() throws Throwable{
		String UsernameErrorMsg=driver.findElement(By.id("userErrMsg")).getText();
		System.out.println("Username error message is" + UsernameErrorMsg);
		}
		@Given("Hotel Booking login page$")
		public void hotel_booking_login() throws Throwable{
		driver.get("file:///E:/Selenium/login.html");
		driver.findElement(By.name("Username")).clear();
		driver.findElement(By.name("Password")).clear();
		}
		
		@When("User login into application without providing password \"([^\"]*)\"$")
		public void user_login_into_application_password(String strArg1) throws Throwable{
		driver.findElement(By.name("Password")).sendKeys(strArg1);
		driver.findElement(By.cssSelector(".btn")).click();
		}
		@Then("Please enter password error message should be populate$")
		public void enter_password() throws Throwable{
		String PasswordErrorMsg=driver.findElement(By.id("pwdErrMsg")).getText();
		System.out.println("Password error message is" + PasswordErrorMsg);
		}
		
		@When("User login into application with username \\\"([^\\\"]*)\\\"$\" and password \"([^\"]*)\"$")
		public void user_login_into_application_username_password(String strArg1, String strArg2) throws Throwable{
		driver.findElement(By.name("Username")).sendKeys(strArg1);
		driver.findElement(By.name("Password")).sendKeys(strArg2);
		driver.findElement(By.cssSelector(".btn")).click();
		}
		@Then("Hotel booking should populate and verify page heading$")
		public void hotek_booking_page() throws Throwable{
		String PageHeading1=driver.findElement(By.xpath("/html/body/div/h2")).getText();
		System.out.println("page heading is" + PageHeading1);
		}
		
		}

