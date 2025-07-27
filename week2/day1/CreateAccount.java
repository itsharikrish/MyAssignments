package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccount {
    public static void main(String[] args) {
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("guest");
        ChromeDriver driver = new ChromeDriver(opt);
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.partialLinkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Accounts")).click();
        driver.findElement(By.linkText("Create Account")).click();
        driver.findElement(By.id("accountName")).sendKeys("TestLeaf Org");
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
        driver.findElement(By.name("numberEmployees")).sendKeys("100");
        driver.findElement(By.name("officeSiteName")).sendKeys("LeafTaps");
        driver.findElement(By.className("smallSubmit")).click();
        String title = driver.getTitle();
        System.out.println("Page title: " + title);
        driver.quit();
    }
}
