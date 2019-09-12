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

import core.selenium.ProjectProperties;
import core.selenium.WebDriverManager;
import core.selenium.utils.ReadPropertyFile;
import org.openqa.selenium.WebDriver;
import pipefy.ui.pages.HomePage;
import pipefy.ui.pages.LoginPage;

/**
 * PageTransporter class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public final class PageTransporter {

    private static PageTransporter pageTransporter;
    private WebDriver driver;

    /**
     * Constructor of PageTransporter class.
     */
    private PageTransporter() {
        driver = WebDriverManager.getInstance().getDriver();
    }

    /**
     * Gets single instance of PageTransporter class.
     *
     * @return a PageTransporter object.
     */
    public static PageTransporter getInstance() {
        if (pageTransporter == null) {
            pageTransporter = new PageTransporter();
        }
        return pageTransporter;
    }

    /**
     * Navigates to login page use the URL.
     *
     * @return a LoginPage object.
     */
    public LoginPage navigateLoginPage() {
        navigateURL(ProjectProperties.URL_LOGIN.getValue());
        return new LoginPage();
    }

    /**
     * Navigates using the URL location.
     *
     * @param url is address to navigate.
     */
    private void navigateURL(final String url) {
        try {
            driver.get(ReadPropertyFile.getInstance().getProperty(url));
        } catch (NullPointerException ex) {
            ex.printStackTrace();
            throw new NullPointerException("This url is not valid :" + ex.getMessage());
        }
    }

    /**
     * Navigates to Homepage page use the URL.
     *
     * @return a HomePage object.
     */
    public HomePage navigateHomePage() {
        navigateURL(ProjectProperties.URL_HOMEPAGE.getValue());
        return new HomePage();
    }
}
