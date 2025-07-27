package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropdownAccounts {

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

        driver.findElement(By.id("accountName")).sendKeys("Hari1");
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");

        WebElement industry = driver.findElement(By.name("industryEnumId"));
        Select sel = new Select(industry);
        sel.selectByValue("IND_SOFTWARE");

        WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
        Select sel1 = new Select(ownership);
        sel1.selectByVisibleText("S-Corporation");

        WebElement source = driver.findElement(By.name("dataSourceId"));
        Select sel2 = new Select(source);
        sel2.selectByValue("LEAD_EMPLOYEE");

        WebElement marketingCampaign = driver.findElement(By.id("marketingCampaignId"));
        Select campaign = new Select(marketingCampaign);
        campaign.selectByIndex(6);

        WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
        Select sel4 = new Select(state);
        sel4.selectByValue("TX");

        driver.findElement(By.className("smallSubmit")).click();

        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Hari1')]"));
        String accountName = element.getText();
        if (accountName.contains("Hari1")) {
            System.out.println("Account name displayed correctly: " + accountName);
        } else {
            System.out.println("Account name mismatch. Found: " + accountName);
        }

        driver.quit();
    }
}
