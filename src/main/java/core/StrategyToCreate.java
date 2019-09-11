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

package core;

import core.selenium.webdrivers.Browser;

/**
 * StrategyToCreate class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
@FunctionalInterface
public interface StrategyToCreate {

    /**
     * Execute method to create a Browser.
     *
     * @return a Browser object.
     */
    Browser executeMethod();
}
