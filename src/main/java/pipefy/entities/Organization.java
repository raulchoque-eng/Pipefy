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
 * Organization class.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class Organization {

    private String name;
    private String id;

    /**
     * Gets the name attribute of its class.
     *
     * @return as string the name attribute.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name attribute with new value of parameter.
     *
     * @param name use to set the name attribute.
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Gets the id attribute of its class.
     *
     * @return as string the id attribute.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the id attribute with new value of parameter.
     *
     * @param id use to set the id attribute.
     */
    public void setId(final String id) {
        this.id = id;
    }
}
