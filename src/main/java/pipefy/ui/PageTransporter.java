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

/**
 * PageTransporter class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public final class PageTransporter {

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
}
