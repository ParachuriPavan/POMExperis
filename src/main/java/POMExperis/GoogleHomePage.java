package POMExperis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleHomePage extends basePageClass
{
    public GoogleHomePage(WebDriver driver)
    {
        super(driver);
    }
    public void goToGmailLoginPage()
    {
        driver.findElement(By.className("gb_d")).click();

    }
}
