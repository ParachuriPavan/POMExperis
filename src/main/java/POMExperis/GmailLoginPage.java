package POMExperis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GmailLoginPage extends basePageClass

    {
        public GmailLoginPage(WebDriver driver)
        {
        super(driver);
        }

    public void goToGoogleCreateAccountPage()
    {
        driver.findElement(By.id("link-signup")).click();
        Utils.waitForSomeTime();
    }
}
