package AutomationTest.HotelBooking;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class CaseStudyHotelBooking {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver","E:\\Selenium\\libs\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();        
        driver.get("file:///E:/Selenium/login.html");
        String PageHeading=driver.findElement(By.xpath("//*[@id=\"mainCnt\"]/div/div/h1")).getText();
        System.out.println("page heading is"+ PageHeading);
        
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.cssSelector(".btn")).click();
        String UsernameErrorMsg=driver.findElement(By.id("userErrMsg")).getText();
        System.out.println("username error message is "+ UsernameErrorMsg);
	
        driver.findElement(By.name("Password")).clear();
        driver.findElement(By.name("Password")).sendKeys("admin");
        driver.findElement(By.cssSelector(".btn")).click();
        String PasswordErrorMsg=driver.findElement(By.id("pwdErrMsg")).getText();
        System.out.println("password error message is "+ PasswordErrorMsg);
       
        driver.findElement(By.name("userName")).clear();
        driver.findElement(By.name("userName")).sendKeys("admin");
        driver.findElement(By.name("Password")).sendKeys("admin");
        driver.findElement(By.cssSelector(".btn")).click();
        String PageHeading1=driver.findElement(By.xpath("/html/body/div/h2")).getText();
        System.out.println("page heading is"+ PageHeading1);
        
        driver.findElement(By.id("btnPayment")).click();
        String alertmsgl=driver.switchTo().alert().getText();
        System.out.println("alert message is +alertmsg1");
        driver.switchTo().alert().accept();
        
        driver.findElement(By.id("FirstName")).sendKeys("Subasri");
        driver.findElement(By.id("btnPayment")).click();
        String alertmsg2=driver.switchTo().alert().getText();
        System.out.println("alert message is +alertmsg2");
        driver.switchTo().alert().accept();
        
        driver.findElement(By.id("LastName")).sendKeys("vadivel");
        driver.findElement(By.id("btnPayment")).click();
        String alertmsg3=driver.switchTo().alert().getText();
        System.out.println("alert message is +alertmsg3");
        driver.switchTo().alert().accept();
        
        driver.findElement(By.id("Email")).sendKeys("subasri.vadivel");
        driver.findElement(By.id("btnPayment")).click();
        String alertmsg4=driver.switchTo().alert().getText();
        System.out.println("alert message is +alertmsg4");
        driver.switchTo().alert().accept();
        driver.findElement(By.id("Email")).clear();
        driver.findElement(By.id("Email")).sendKeys("subasri.vadivel@gmail.com");
        
        driver.findElement(By.id("btnPayment")).click();
        String alertmsg5=driver.switchTo().alert().getText();
        System.out.println("alert message is +alertmsg5");
        driver.switchTo().alert().accept();
        
        driver.findElement(By.id("Mobile no")).sendKeys("123654");
        driver.findElement(By.id("btnPayment")).click();
        String alertmsg6=driver.switchTo().alert().getText();
        System.out.println("alert message is +alertmsg6");
        driver.switchTo().alert().accept();
        driver.findElement(By.id("Mobile no")).clear();
        driver.findElement(By.id("Mobile no")).sendKeys("9342781365");
        
        driver.findElement(By.id("btnPayment")).click();
        String alertmsg7=driver.switchTo().alert().getText();
        System.out.println("alert message is +alertmsg7");
        driver.switchTo().alert().accept();
        
        WebElement s1=driver.findElement(By.name("city"));
        Select d1=new Select(s1);
        d1.selectByIndex(2);
        
        driver.findElement(By.id("btnPayment")).click();
        String alertmsg8=driver.switchTo().alert().getText();
        System.out.println("alert message is +alertmsg8");
        driver.switchTo().alert().accept();
        
        WebElement s2=driver.findElement(By.name("state"));
        Select d2=new Select(s2);
        d2.selectByIndex(2);
        
        WebElement s3=driver.findElement(By.name("Number of guest staying"));
        Select d3=new Select(s3);
        d3.selectByVisibleText("5");
        
        driver.findElement(By.id("btnPayment")).click();
        String alertmsg9=driver.switchTo().alert().getText();  
        System.out.println("alert message is +alertmsg9");
        driver.switchTo().alert().accept();
        driver.findElement(By.id("cardholdername")).sendKeys("subasri");
        
        driver.findElement(By.id("btnPayment")).click();
        String alertmsg10=driver.switchTo().alert().getText();  
        System.out.println("alert message is +alertmsg10");
        driver.switchTo().alert().accept();
        driver.findElement(By.id("Debit Card Number")).sendKeys("43531245");
        
        driver.findElement(By.id("btnPayment")).click();
        String alertmsg11=driver.switchTo().alert().getText();  
        System.out.println("alert message is +alertmsg11");
        driver.switchTo().alert().accept();
        driver.findElement(By.id("CVV")).sendKeys("563");
        
        driver.findElement(By.id("btnPayment")).click();
        String alertmsg12=driver.switchTo().alert().getText();  
        System.out.println("alert message is +alertmsg12");
        driver.switchTo().alert().accept();
        driver.findElement(By.id("Expiration month")).sendKeys("12/12/2026");
        
        driver.findElement(By.id("btnPayment")).click();
        String alertmsg13=driver.switchTo().alert().getText();  
        System.out.println("alert message is +alertmsg13");
        driver.switchTo().alert().accept();
        driver.findElement(By.id("Expiration Year")).sendKeys("2026");
}
	}

     