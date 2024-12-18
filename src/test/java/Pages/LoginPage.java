package Pages;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import org.openqa.selenium.*;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;
    WebDriverWait wait;

    //constructor
    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofMillis(30000));
    }

    //By Locactors
    By UserId_Xpath = By.xpath("//input[@name='uid']");
    By Password_Xpath = By.xpath("//input[@name='password']");
    By loginButton = By.xpath("//input[@name='btnLogin']");
    By Resetbutton = By.xpath("//input[@name='btnReset']");
    //By relative = RelativeLocator.with(By.tagName("input")).above(By.id("id=sdf"));

    public void enterUsername(String Username)
    {
        driver.findElement(UserId_Xpath).clear();
        driver.findElement(UserId_Xpath).sendKeys(Username);
    }

    public void enterPassword(String Password)
    {
        driver.findElement(Password_Xpath).clear();
        driver.findElement(Password_Xpath).sendKeys(Password);
    }

    public void clickLoginButton()
    {
        driver.findElement(loginButton).click();
    }

    public String getCurrentPageTitle()
    {
        return driver.getTitle();
    }

    public void unSuccessfullLogin()
    {
//        wait.until(ExpectedConditions.alertIsPresent());
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
