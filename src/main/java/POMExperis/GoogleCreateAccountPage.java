package POMExperis;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleCreateAccountPage extends basePageClass {
    public GoogleCreateAccountPage(WebDriver driver)
    {
        super(driver);
    }
    public void createNewUser()
    {
        driver.findElement(By.id("FirstName")).sendKeys("Pavan");
        driver.findElement(By.id("LastName")).sendKeys("Parachuri");
        driver.findElement(By.id("Passwd")).sendKeys("F2welcome");
        driver.findElement(By.id("PasswdAgain")).sendKeys("F2welcome");
        driver.findElement(By.xpath("//label[@id='month-label']/span/div/div")).click();
        driver.findElement(By.xpath("//label[@id='month-label']/span/div[2]/div[@id=':5']")).click();
        driver.findElement(By.id("BirthDay")).sendKeys("9");
        driver.findElement(By.id("BirthYear")).sendKeys("1980");
        driver.findElement(By.xpath("//div[@id='Gender']/div/div")).click();
        driver.findElement(By.xpath("//div[@id='Gender']/div/div[@id=':f']")).click();
        driver.findElement(By.id("RecoveryPhoneNumber")).sendKeys("07478065445");
        driver.findElement(By.id("RecoveryEmailAddress")).sendKeys("pavan123@gmail.com");
        driver.findElement(By.id("SkipCaptcha")).click();
        driver.findElement(By.id("TermsOfService")).click();
        driver.findElement(By.id("submitbutton")).click();

    }
    public void isValidationErrorDisplayed()
    {
        Assert.assertTrue(driver.findElement(By.id("errormsg_0_GmailAddress")).getText().contains("You can't leave this empty."));
    }
}
