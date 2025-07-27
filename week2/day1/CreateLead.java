package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		String title = driver.getTitle();
		System.out.println(title);
		
		
		driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		WebElement pwd = driver.findElement(By.name("PASSWORD"));
		pwd.sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari Krishnan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S S");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Software Engineer");
		driver.findElement(By.name("submitButton")).click();
	    String actualTitle = driver.findElement(By.id("viewLead_generalProfTitle_sp")).getText();
	    if (actualTitle.equals("Software Engineer")) 
	    {
	            System.out.println("Title is displayed correctly: " + actualTitle);
	    } 
	    else 
	    {
	            System.out.println("Title mismatch. Found: " + actualTitle);
	    }
	    

	}

}
