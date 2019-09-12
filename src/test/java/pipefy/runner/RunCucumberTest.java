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

package pipefy.runner;

import core.report.GeneratorReport;
import core.selenium.WebDriverManager;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterTest;

/**
 * RunCucumberTest class, run all test of framework.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
@CucumberOptions(features = "src/test/resources/features",
        glue = {"pipefy/steps_implementation", "pipefy/hooks"},
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"})
public class RunCucumberTest extends AbstractTestNGCucumberTests {

    /**
     * Run the last test in our framework.
     */
    @AfterTest
    public void runLastTest() {
        WebDriverManager.getInstance().getDriver().close();
        GeneratorReport.getInstance().generateReport();
    }
}
