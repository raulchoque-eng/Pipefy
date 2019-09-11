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

package core.selenium;

/**
 * ProjectProperties enum, create constants
 * to save name properties of project.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public enum ProjectProperties {

    BROWSER_NAME("browserName"),
    IMPLICIT_WAIT("implicitWait"),
    EXPLICIT_WAIT("explicitWait"),
    URL_LOGIN("loginPage"),
    URL_HOMEPAGE("homePage");

    private final String value;

    /**
     * Constructor of ProjectProperties enum.
     *
     * @param value value for create a ProjectProperties enum.
     */
    ProjectProperties(final String value) {
        this.value = value;
    }

    /**
     * Gets value of value constant of this enum.
     *
     * @return as String value constant.
     */
    public String getValue() {
        return value;
    }
}
