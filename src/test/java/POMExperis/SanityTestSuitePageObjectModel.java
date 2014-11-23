package POMExperis;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SanityTestSuitePageObjectModel
{
    public static WebDriver driver;

    @BeforeClass
    public static void setup()
    {
        System.setProperty("webdriver.chrome.driver",
                "D:\\Automation\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.google.co.uk");
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void tearDown()
    {
        driver.quit();
        driver = null;
    }

    @Test
    public void userCanCreateNewAccount()
    {
        //Clicking on Gmail link in the Google Home Page
        GoogleHomePage GoogleHomePage = new GoogleHomePage(driver);
        GoogleHomePage.goToGmailLoginPage();
        //Clicking on the CreateAnAccount link in the Gmail Login Page
        GmailLoginPage GmailLoginPage = new GmailLoginPage(driver);
        GmailLoginPage.goToGoogleCreateAccountPage();
        //Creating new user account by entering details
        GoogleCreateAccountPage GoogleCreateAccountPage = new GoogleCreateAccountPage(driver);
        GoogleCreateAccountPage.createNewUser();
        //Assertion to verify the validation message when username is blank
        GoogleCreateAccountPage.isValidationErrorDisplayed();
    }
}
