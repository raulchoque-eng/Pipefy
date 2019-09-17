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

package pipefy.ui;

import core.selenium.WebDriverManager;
import core.selenium.utils.ReadPropertyFile;
import org.openqa.selenium.WebDriver;
import pipefy.ui.pages.LoginPage;

/**
 * PageTransporter class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public final class PageTransporter {

    private static final String BASE_URL = "https://app.pipefy.com";
    /**
     * Navigates using the URL location.
     *
     * @param namePage is address to navigate.
     */
    public static void navigateURL(final String namePage) {
        try {
            String url = ReadPropertyFile.getInstance().getProperty(namePage.toLowerCase() + "Page");
            WebDriver driver = WebDriverManager.getInstance().getDriver();
            driver.navigate().to(url);
        } catch (NullPointerException ex) {
            ex.printStackTrace();
            throw new NullPointerException("This url is not valid :" + ex.getMessage());
        }
    }


    /**
     * Navigate to URL use and and point.
     *
     * @param endPoint use to complete the uri.
     */
    public static void navigateToURL(final String endPoint) {
        try {
            String uri = BASE_URL + endPoint;
            WebDriver driver = WebDriverManager.getInstance().getDriver();
            driver.navigate().to(uri);
        } catch (NullPointerException ex) {
            ex.printStackTrace();
            throw new NullPointerException("This url is not valid :" + ex.getMessage());
        }
    }

    /**
     * Goes to Login page.
     *
     * @return a LoginPage object.
     */
    public  static LoginPage goToLoginPage() {
        navigateURL("Login");
        return new LoginPage();
    }
}
