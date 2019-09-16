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

import core.selenium.utils.ReadJsonFile;

/**
 * User class, create instances of User
 * and interact with it.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class User {
    private String username;
    private String  password;
    private String companyName;

    /**
     * Method constructor of User class.
     *
     * @param userType to create a user instance.
     */
    public void init(final String userType) {
        username = ReadJsonFile.getInstance(userType).getUsername();
        password = ReadJsonFile.getInstance(userType).getPassword();
        companyName = ReadJsonFile.getInstance(userType).getCompanyName();
    }

    /**
     * Method constructor empty of User class.
     */
    public User() {}

    /**
     * Gets the user name attribute of its class.
     *
     * @return as string the user name attribute.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Gets the company name attribute of its class.
     *
     * @return as String the company name attribute.
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Gets the password attribute of its class.
     *
     * @return as string the password attribute.
     */
    public String getPassword() {
        return password;
    }
}
