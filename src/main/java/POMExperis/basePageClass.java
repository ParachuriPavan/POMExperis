package POMExperis;

import org.openqa.selenium.WebDriver;

public class basePageClass
{
    protected WebDriver driver;

    public basePageClass(WebDriver driver)

    {
        this.driver = driver;
    }
}