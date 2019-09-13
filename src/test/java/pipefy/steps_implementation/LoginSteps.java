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
import cucumber.api.java.en.When;
import pipefy.ui.PageTransporter;
import pipefy.ui.pages.HomePage;
import pipefy.ui.pages.LoginPage;

/**
 * LoginSteps class, is the step implementation
 * to Automation of LoginPage page.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class LoginSteps {

    private PageTransporter pageTransporter = PageTransporter.getInstance();
    private HomePage homePage;
    private LoginPage loginPage;

    /**
     * Goes to the TypeForm Page.
     */
    @Given("^I go to the pipefy page$")
    public void goTypeFormPage() {
        homePage = pageTransporter.navigateHomePage();
    }

    /**
     * Log in as userType.
     *
     * @param userType is use for log in.
     */
    @When("^I log in as \"([^\"]*)\" user$")
    public void loginUser(final String userType) {
        loginPage = pageTransporter.navigateLoginPage();
        loginPage.logIn(userType);
    }
}
