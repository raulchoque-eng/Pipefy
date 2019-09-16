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
import pipefy.entities.Pipe;
import pipefy.entities.User;
import pipefy.ui.PageTransporter;
import pipefy.ui.pages.LoginPage;
import pipefy.ui.pages.OrganizationPage;
import pipefy.ui.pages.PipePage;
import pipefy.ui.pages.PipeTemplatePage;

/**
 * PipeSteps class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class PipeSteps {

    private LoginPage loginPage;
    private OrganizationPage organizationPage;
    private PipePage pipePage;
    private User user;
    private Pipe pipe;

    /**
     * Constructor method for share states between objects.
     *
     * @param context has all share entities.
     */
    public PipeSteps(final Context context) {
        this.user = context.getUser();
        this.pipe = context.getPipe();
    }

    /**
     * Logs in as a user type.
     *
     * @param userType to select a user.
     */
    @Given("^I am logged in as \"([^\"]*)\" user$")
    public void loginAsUser(final String userType) {
        loginPage = PageTransporter.goToLoginPage();
        user.init(userType);
        organizationPage = loginPage.logIn(user);
    }

    /**
     * Adds a new pipe template with the name's template.
     *
     * @param nameTemplate use to choose the pipe template.
     */
    @When("^I add a new Pipe with template \"([^\"]*)\"$")
    public void addNewPipeWithTemplate(final String nameTemplate) {
        PipeTemplatePage pipeTemplatePage = organizationPage.clickNewTemplate();
        pipe.setName(nameTemplate);
        pipePage = pipeTemplatePage.selectPipeTemplate(pipe);
    }

    /**
     * Shows the information of Pipe.
     */
    @Then("^I should see the information Pipe$")
    public void showInformationPipe() {
        Assert.assertEquals(pipe.getName(), pipe.getName(), "It's name of pipe not exist!");
    }
}
