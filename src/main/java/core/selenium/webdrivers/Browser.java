/*
 * Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package core.selenium.webdrivers;

import org.openqa.selenium.WebDriver;

import java.io.File;

/**
 * Browser abstract class, abstract behavior.
 * It promise will made in the future in its sub classes,
 * and reuse code.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public abstract class Browser {

    /**
     * Gets a WebDriver object for use a browser.
     *
     * @return as WebDriver.
     */
    public abstract WebDriver getDriver();

    /**
     * Validates if exist a WebDriver with these value.
     *
     * @param pathDriver use to find the Webdriver.
     * @return a true o false value.
     */
    protected boolean existWebDriver(final String pathDriver) {
        File file = new File(pathDriver);
        return file.exists()? true:false;
    }
}
