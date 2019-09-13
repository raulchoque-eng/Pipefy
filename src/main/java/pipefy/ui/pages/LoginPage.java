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

package pipefy.ui.pages;

import core.selenium.utils.ReadJsonFile;
import core.selenium.utils.WebDriverMethod;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * LoginPage class, create a PageObject of LoginPage page
 * to interact with the UI of that page.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class LoginPage extends BasePage {

    @FindBy(css = "input[name=\"username\"]")
    private WebElement usernameTxt;

    @FindBy(css = "input[name=\"password\"]")
    private WebElement passwordTxt;

    @FindBy(css = "button[name=\"submit\"]")
    private WebElement logInBtn;

    @FindBy(css = ".auth0-lock-view-content")
    private WebElement formLogin;

    /**
     * Writes in usernameTxt WebElement the username parameter.
     *
     * @param username is to write in usernameTxt WebElement.
     */
    public void writeInUsername(final String username) {
        WebDriverMethod.setTxtElement(usernameTxt, username);
    }

    /**
     * Writes in passwordTxt WebElement the password parameter.
     *
     * @param password is to write in passwordTxt WebElement.
     */
    public void writeInPassword(final String password) {
        WebDriverMethod.setTxtElement(passwordTxt, password);
    }

    /**
     * Clicks to submit login form.
     */
    public void clickSubmit() {
        logInBtn.click();
    }


    /**
     * LogIn with username and password parameter.
     *
     * @param userType use to search the userTyper.
     */
    public void logIn(final String userType) {
        writeInUsername(ReadJsonFile.getInstance(userType).getUsername());
        writeInPassword(ReadJsonFile.getInstance(userType).getPassword());
        clickSubmit();
    }

    /**
     * Wait until Page object was find for.
     */
    @Override
    protected void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(formLogin));
    }
}
