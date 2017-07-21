import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import junit.framework.Assert;







public class SdetTraining_TestCases {
	private WebDriver driver;
	 private String baseUrl;
	 
	
	// login testcase
	 
	 
	
	//public void tc_login()  throws InterruptedException{
		/* 1. open Browser and navigate to the AUT
		 * 2.Click on login Button on the top Right hand 
		 * 3.Click on Create Account Button
		 * 4.enter FirstName 
		 * 4.enter LastName
		 * 4.select  gender
		 * 
		 * 
		 */
		
		//System.setProperty("webdriver.gecko.driver", "C:\\071717\\Aljars\\geckodriver.exe");
	// driver =new FirefoxDriver();
	 @Test
	 
	 public void tc_login_wd(){
		// System.out.println("code for login will come here....");
		 
		 //System.setProperty("webdriver.ie.driver","C:\\071717\\Aljars\\IEDiverServer.exe");
		 
		 //driver =new InternetExplorerDriver();
		 
		 
		 System.setProperty("webdriver.gecko.driver", "C:\\071717\\Aljars\\geckodriver.exe");
		 driver =new FirefoxDriver();
		
		 
		 baseUrl = "http://sdettraining.com/";
		 
		
	
		 driver.get(baseUrl + "trguitransactions/Register.aspx");
		 driver.findElement(By.id("HeadLoginView_HeadLoginStatus")).click();
		 
		 //3.Click on create account button
		 
		 driver.findElement (By.xpath("//*[@id ='MainContent_txtUserName' ]")).sendKeys("sdet703@sdettraining.com");
		  //4.Type password.
		 
		 driver.findElement(By.name("ctl00$MainContent$txtPassword")).sendKeys("Hexaware07!");
		 
		 //click on login button
		 driver.findElement(By.xpath("//*[@id ='MainContent_btnLogin']")).click();
		 
		 
		 String vExpected ="Welcome Back!";
		 String vActual;
		 
		 vActual = driver.findElement(By.id("MainContent_lblid")).getText();
		 System.out.println("value we are reading is " + vActual);
		 
		 Assert.assertEquals(vExpected, vActual);
		 
		 if (vExpected.equals(vActual)){
			 System.out.println("All Good.... TEST PASSED!!!!!");
			 
			 
			 
		 }
		 else {
			 System.out.println("Something happened.....TEST FAILED!!!!");
		 }
		 
		 
		 
		 
		 
		 
		   /* driver.findElement(By.id("HeadLoginView_lblLoginStatus")).click();
		    driver.findElement(By.id("MainContent_txtUserName")).clear();
		    driver.findElement(By.id("MainContent_txtUserName")).sendKeys("sdet703@sdettraining.com");
		    driver.findElement(By.id("MainContent_txtPassword")).clear();
		    driver.findElement(By.id("MainContent_txtPassword")).sendKeys("Hexaware");
		    driver.findElement(By.id("MainContent_btnLogin")).click();
		    driver.findElement(By.id("HeadLoginView_HeadLoginStatus")).click();
		    driver.findElement(By.id("MainContent_txtUserName")).clear();
		    driver.findElement(By.id("MainContent_txtUserName")).sendKeys("sdet703@sdettraining.com");
		    driver.findElement(By.id("MainContent_txtPassword")).clear();
		    driver.findElement(By.id("MainContent_txtPassword")).sendKeys("Hexaware");
		    driver.findElement(By.id("MainContent_btnLogin")).click();
		    driver.findElement(By.id("HeadLoginView_HeadLoginStatus")).click();
		    driver.findElement(By.id("MainContent_txtUserName")).clear();
		    driver.findElement(By.id("MainContent_txtUserName")).sendKeys("sdet703@sdettraining.com");
		    driver.findElement(By.id("MainContent_txtPassword")).clear();
		    driver.findElement(By.id("MainContent_txtPassword")).sendKeys("Hexaware07!");
		    driver.findElement(By.id("MainContent_btnLogin")).click();
		    
		    */
		    
		    
		    
		    
	  }
	
	}


