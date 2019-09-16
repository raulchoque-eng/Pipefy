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
 * Context class, creator to share all entities
 * of its project.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class Context {

    private User user;

    /**
     * Method constructor of Context class.
     */
    public Context() {
        user = new User();
    }

    /**
     * Gets User attribute of its class.
     *
     * @return the User attribute.
     */
    public User getUser() {
        return user;
    }
}
