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

package pipefy.hook;

import core.Log;
import core.selenium.WebDriverManager;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

/**
 * Hook class, implement action between scenarios.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class Hook {

    /**
     * Driver of type WebDriver.
     */
    private WebDriver driver;

    /**
     * Constructor of Hook class.
     */
    public Hook() {
        driver = WebDriverManager.getInstance().getDriver();
    }

    /**
     * Embed screenshot when a scenario is fail.
     *
     * @param scenario use to add screenshot;
     */
    @After
    public void embedScreenshotOnFail(final Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
                scenario.write("URL at failure: " + driver.getCurrentUrl());
            } catch (WebDriverException wde) {
                Log.getInstance().getLogger().error("Embed Failed " + wde.getMessage());
                throw new NullPointerException("This data type is invalid!!");
            } catch (ClassCastException cce) {
                cce.printStackTrace();
                throw new NullPointerException("This file is defective!!");
            }
        }
        driver.manage().deleteAllCookies();
    }
}
