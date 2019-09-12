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

package core.report;

import core.selenium.WebDriverConfig;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * GeneratorReport class, create a report for our project.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class GeneratorReport {

    /**
     * Gets a instance of GeneratorReport.
     *
     * @return a GeneratorReport object.
     */
    public static GeneratorReport getInstance() {
        return new GeneratorReport();
    }

    /**
     * Generates the Report, set up and create a report.
     */
    public void generateReport() {
        WebDriverConfig webDriverConfig = WebDriverConfig.getInstance();
        final File reportOutputDirectory = new File("target");
        final List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add("target/cucumber.json");

        final String projectName = "Pipefy";

        final Configuration configuration = new Configuration(reportOutputDirectory, projectName);
        // additional metadata presented on main page
        configuration.addClassifications("Platform", "macOS");
        configuration.addClassifications("Browser", webDriverConfig.getNameBrowser());
        configuration.addClassifications("Branch", "release/1.0");
        final ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        final Reportable result = reportBuilder.generateReports();
        // and here validate 'result' to decide what to do if report has failed
    }
}
