package StepDefnition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch {
	
	WebDriver driver= null;
	@Given("user is open the chrome browser")
	public void user_is_open_the_chrome_browser() throws InterruptedException {
	 
	  String path=System.getProperty("user.dir");
	 
      System.setProperty("WebDriver.chrome.driver", path+"/src/test/resources/Drivers/chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  driver.get("https://google.com");
	  Thread.sleep(5000);
	  System.out.println(path);
	  System.out.println("browser opened");
	}

	@When("user enters {string} in search tab")
	public void user_enters_in_search_tab(String string) throws InterruptedException {
		System.out.println(string +" entered");
		driver.findElement(By.name("q")).sendKeys(string);
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
	}

	@And("navigate to Home page")
	public void navigate_to_home_page() {
		System.out.println("Home page displayed");
		boolean source = driver.getPageSource().contains("Online Courses");
		if(source==true)
			System.out.println("pass");
		else
			System.out.println("fail");
	}

	@Then("close the browser")
	public void close_the_browser() {
		driver.close();
		driver.quit();
		
		System.out.println("Closed successfully");
	}

}
