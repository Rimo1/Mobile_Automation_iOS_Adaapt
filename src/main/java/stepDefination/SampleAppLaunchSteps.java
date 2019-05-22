package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driverManager.iOSMobileDriver;
import pages.LoginPage;


public class SampleAppLaunchSteps {
    iOSMobileDriver mobileDriver =new iOSMobileDriver();
     LoginPage loginPage=new LoginPage();
    @Given("^The Appium server is running$")
    public void the_Appium_server_is_running() throws Throwable {
        mobileDriver.iosDriver();
    }

    @When("^The simulator is open$")
    public void the_simulator_is_open() throws Throwable {
        //loginPage.clickbutton();
    }

    @Then("^The app is launched$")
    public void the_app_is_launched() throws Throwable {

    }

    @Then("^The app is closed$")
    public void the_app_is_closed() throws Throwable {
       mobileDriver.CloseApp();
    }


}
