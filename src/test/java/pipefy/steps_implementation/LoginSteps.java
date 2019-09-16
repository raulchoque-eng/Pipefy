/*
 * Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package pipefy.steps_implementation;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pipefy.entities.Context;
import pipefy.entities.User;
import pipefy.ui.PageTransporter;
import pipefy.ui.pages.HomePage;
import pipefy.ui.pages.LoginPage;
import pipefy.ui.pages.OrganizationPage;

/**
 * LoginSteps class, is the step implementation
 * to Automation of LoginPage page.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class LoginSteps {

    private HomePage homePage;
    private LoginPage loginPage;
    private User user;
    private OrganizationPage organization;

    public LoginSteps(Context context) {
        this.user = context.getUser();
    }

    /**
     * Goes to the main page of Pipefy website.
     */
    @Given("^user is in Pipefy page$")
    public void goHomePage() {
        PageTransporter.navigateURL("home");
        homePage = new HomePage();

    }

    /**
     * Goes to page that you choose.
     *
     * @param namePage is the name of page.
     */
    @When("^the user goes to the \"([^\"]*)\" page$")
    public void goToPage(String namePage) {
        PageTransporter.navigateURL(namePage);
    }

    /**
     * Logs in as user type that you choose.
     *
     * @param userType to login in the page.
     */
    @When("^the user logs in as \"([^\"]*)\" user$")
    public void loginUserType(String userType) {
        loginPage = new LoginPage();
        user.init(userType);
        organization = loginPage.logIn(user);
    }

    /**
     * Sees user's organization title.
     */
    @Then("^the user should see his organization page$")
    public void seeUserOrganization() {
        Assert.assertEquals(user.getCompanyName(), organization.getOrganizationTitle(),
                "It isn't user's organization.");
    }

}
