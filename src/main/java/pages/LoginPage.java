package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import driverManager.iOSMobileDriver;

public class LoginPage {

    @FindBy(how = How.ID, using = "login.button.xpath")
    private WebElement Login;




}