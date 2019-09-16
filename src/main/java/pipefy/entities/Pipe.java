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

package pipefy.entities;

/**
 * Pipe class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class Pipe {

    private String name;

    /**
     * Gets the name attribute of its class.
     *
     * @return as string the name attribute.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name attribute with a new name.
     *
     * @param name update the name attribute.
     */
    public void setName(final String name) {
        this.name = name;
    }
}
