package StepDefinitions;

import Pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import java.time.Duration;

public class LoginStepdefinition {

    private static final Logger log = LoggerFactory.getLogger(LoginStepdefinition.class);
    WebDriver driver;
    LoginPage login;

    @Before
    public void setEnv()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
    }

    @Given("user is on Bank login page")
    public void user_is_on_bank_login_page()  {
        driver.get("https://demo.guru99.com/V1/index.php");
        login = new LoginPage(driver);
    }

    @When("user enters {string} and {string}")
    public void user_enters_and(String string, String string2) {
        login.enterUsername(string);
        login.enterPassword(string2);
    }
    @When("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
        login.clickLoginButton();
    }
    @Then("user able to login to the bank successfully")
    public void user_able_to_login_to_the_bank_successfully() {
        Assert.assertEquals("GTPL Bank Manager HomePage" ,login.getCurrentPageTitle().trim());
    }

    @Then("user unable to login to the bank")
    public void user_unable_to_login_to_the_bank()
    {
        login.unSuccessfullLogin();
    }


    @After
    public void cleanUp()
    {
        driver.quit();
    }

}
