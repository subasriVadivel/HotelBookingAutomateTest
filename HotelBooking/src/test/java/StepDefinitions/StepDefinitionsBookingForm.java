package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import AutomationTest.HotelBooking.globalDriver;

@RunWith(Cucumber.class)

public class StepDefinitionsBookingForm extends globalDriver{

	@Given("^User is on Hotel Booking Form Page$")
	public void user_hotel_Booking_page() throws Throwable{
	}
	
	@When("User clicking on Confirm Booking without providing First Name$")
	public void user_clicking_Without_Firstname() throws Throwable{
	driver.findElement(By.id("btnPayment")).click();
	}

	@When("User clicking on Confirm Booking without providing Last Name$")
	public void user_clicking_Without_Lastname() throws Throwable{
	driver.findElement(By.id("btnPayment")).click();
	}
	
	@When("Please fill the first Name alert message should populate$")
	public void Alert_message_Firstname() throws Throwable{
	String alertmsg1=driver.switchTo().alert().getText();
	System.out.println("alert message is" +alertmsg1);
	driver.switchTo().alert().accept();
	}
	
	@When("Please fill the Last Name alert message should populate$")
	public void Alert_message_Lastname() throws Throwable{
	String alertmsg2=driver.switchTo().alert().getText();
	System.out.println("alert message is" +alertmsg2);
	driver.switchTo().alert().accept();
	}
	
	@And("Enter First Name as \"([^\"]*)\"$")
	public void enter_first_name(String strArg1) throws Throwable {
	driver.findElement(By.id("FirstName")).sendKeys(strArg1);
	}
	
	@And("Enter Last Name as \"([^\"]*)\"$")
	public void enter_Last_name(String strArg1) throws Throwable {
	driver.findElement(By.id("LastName")).sendKeys(strArg1);
	}
	
	@When("User clicking on Confirm Booking with wrong email format as \"([^\"]*)\"$")
	public void wrong_email_format(String strArg1) throws Throwable{
	driver.findElement(By.id("EMail")).sendKeys("Subasri.Vadivel");
	driver.findElement(By.id("btnPayment")).click();
	}
	
	@When("Please fill the email alert message should populate$")
	public void email_alert_message() throws Throwable{
	String alertmsg4=driver.switchTo().alert().getText();
	System.out.println("alert message is" +alertmsg4);
	driver.switchTo().alert().accept();
	}
	
	@And("Enter Email as \"([^\"]*)\"$")
	public void Enter_email(String strArg1) throws Throwable {
	driver.findElement(By.id("Email")).clear();
	driver.findElement(By.id("Email")).sendKeys("Subasri.Vadivel@gmail.com");
	}
	
	@When("User clicking on Confirm Booking without providing Mobile no$")
	public void without_mobile_no() throws Throwable{
	driver.findElement(By.id("btnPayment")).click();
	}
	
	@When("Please fill the Mobile no alert message should populate$")
	public void Mobile_alert_message() throws Throwable{
	String alertmsg5=driver.switchTo().alert().getText();
	System.out.println("alert message is" +alertmsg5);
	driver.switchTo().alert().accept();
	}
	
	@When("User Clicking Confirm Booking with providing Mobile no doesnot start with either 7,8 or 9 and doesnot have 10 digits$")
	public void Mobile_not10_alert_message(String strArg1) throws Throwable{
	driver.findElement(By.id("Mobile no")).sendKeys("46857578");
	driver.findElement(By.id("btnPayment")).click();
	}
	
	@Then("Please enter valid Contact no alert message should populate$")
	public void Valid_Mobile_alert_message() throws Throwable{
	String alertmsg6=driver.switchTo().alert().getText();
	System.out.println("alert message is" +alertmsg6);
	driver.switchTo().alert().accept();
	}
	
	@Then("Enter Address detail$")
	public void Address_details(String strArg1) throws Throwable{
	driver.findElement(By.id("Address")).sendKeys("MG Road,Bangalore Karnataka");
	driver.findElement(By.id("btnPayment")).click();
	}
	
	@Then("Please select city alert message should populate$")
	public void City_alert_message() throws Throwable{
	String alertmsg7=driver.switchTo().alert().getText();
	System.out.println("alert message is" +alertmsg7);
	driver.switchTo().alert().accept();
	}
	
	@And("Select City using static dropdown$")
	public void City() throws Throwable {
	WebElement s1=driver.findElement(By.name("city"));
	Select d1=new Select(s1);
	d1.selectByIndex(2);
	}
	
	@When("User clicking on Confirm Booking without selecting state$")
	public void Without_selecting_state() throws Throwable{
	driver.findElement(By.id("btnPayment")).click();
	}
	
	@Then("Please enter valid state alert message should populate$")
	public void State_alert_message() throws Throwable{
	String alertmsg8=driver.switchTo().alert().getText();
	System.out.println("alert message is" +alertmsg8);
	driver.switchTo().alert().accept();
	}
	
	@And("Select State using static dropdown$")
	public void State() throws Throwable {
	WebElement s2=driver.findElement(By.name("state"));
	Select d2=new Select(s2);
	d2.selectByIndex(2);
	}
	
	@When("User select Number of guest staying using static dropdown$")
	public void Number_guest_staying() throws Throwable{
	WebElement s3=driver.findElement(By.name("Number of Guest Staying"));
	Select d3=new Select(s3);
	d3.selectByIndex(2);
	}
	
	@Then("Number of Guest staying selected successfully$")
	public void Number_of_guest() throws Throwable{
	}
	
	@When("User clicking on Confirm Booking without providing Card Holder Name$")
	public void Without_card_holder_name() throws Throwable{
	driver.findElement(By.id("btnPayment")).click();
	}
	
	@Then("Please fill card holder name alert message should populate$")
	public void cardholdername_alert_message() throws Throwable{
	String alertmsg9=driver.switchTo().alert().getText();
	System.out.println("alert message is" +alertmsg9);
	driver.switchTo().alert().accept();
	}
	
	@And("Enter Card holder name as \"([^\"]*)\"$")
	public void Enter_card_holder_name(String strArg1) throws Throwable {
	driver.findElement(By.id("cardholdername")).sendKeys(strArg1);
	}
	
	@When("User clicking on Confirm Booking without providing DebitCard Number$")
	public void Without_debit_card_number() throws Throwable{
	driver.findElement(By.id("btnPayment")).click();
	}
	
	@Then("Please fill Debit Card number alert message should populate$")
	public void debit_card_number_alert_message() throws Throwable{
	String alertmsg10=driver.switchTo().alert().getText();
	System.out.println("alert message is" +alertmsg10);
	driver.switchTo().alert().accept();
	}
	
	@And("Enter Debit Card Number as \"([^\"]*)\"$")
	public void Enter_debit_card_number(String strArg1) throws Throwable {
	driver.findElement(By.id("Debit Card Number")).sendKeys(strArg1);
	}
	
	@When("User clicking on Confirm Booking without providing CVV$")
	public void without_CVV() throws Throwable{
	driver.findElement(By.id("btnPayment")).click();
	}
	
	@Then("Please fill CVV alert message should populate$")
	public void CVV_alert_message() throws Throwable{
	String alertmsg11=driver.switchTo().alert().getText();
	System.out.println("alert message is" +alertmsg11);
	driver.switchTo().alert().accept();
	}
	
	@And("Enter CVV as \"([^\"]*)\"$")
	public void Enter_CVV(String strArg1) throws Throwable {
	driver.findElement(By.id("CVV")).sendKeys(strArg1);
	}
	
	@When("User clicking on Confirm Booking without providing Expiration Month$")
	public void without_Expiration_month() throws Throwable{
	driver.findElement(By.id("btnPayment")).click();
	}
	
	@Then("Please fill Expiration Month alert message should populate$")
	public void Expiration_Month_alert_message() throws Throwable{
	String alertmsg12=driver.switchTo().alert().getText();
	System.out.println("alert message is" +alertmsg12);
	driver.switchTo().alert().accept();
	}
	
	@And("Enter Expiration Month as \"([^\"]*)\"$")
	public void Enter_Expiration_Month(String strArg1) throws Throwable {
	driver.findElement(By.id("Expiration Month")).sendKeys("12/12/2026");
	}
	
	@When("User clicking on Confirm Booking without providing Expiration Year$")
	public void without_Expiration_year() throws Throwable{
	driver.findElement(By.id("btnPayment")).click();
	}
	
	@Then("Please fill Expiration Year alert message should populate$")
	public void Expiration_Year_alert_message() throws Throwable{
	String alertmsg13=driver.switchTo().alert().getText();
	System.out.println("alert message is" +alertmsg13);
	driver.switchTo().alert().accept();
	}
	
	@And("Enter Expiration Year as \"([^\"]*)\"$")
	public void Enter_Expiration_Year(String strArg1) throws Throwable {
	driver.findElement(By.id("Expiration Year")).sendKeys("2026");
	}
	
	@When("User clicking on Confirm Booking$")
	public void Clicking_confirm_booking() throws Throwable{
	driver.findElement(By.id("btnPayment")).click();
	}
	
	@Then("User naviagtes to success page and capture success message$")
	public void navigate_success_message() throws Throwable{
	String Successmsg=driver.findElement(By.xpath("/html/body/h1")).getText();
	System.out.println("Booking Completed Success is" +Successmsg);
	}
	
	@And("^Close the Window$")
	public void close_window() throws Throwable {
	driver.quit();
	}
	
}
