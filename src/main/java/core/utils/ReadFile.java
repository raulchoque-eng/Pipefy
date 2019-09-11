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

package core.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * ReadFile class, reads data from properties file.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public class ReadFile {

    /**
     * Gets Properties class with data.
     *
     * @return a Properties object.
     */
    public static Properties getInstance() {
        Properties properties = new Properties();
        try (InputStream input = new FileInputStream("gradle.properties")) {
            properties.load(input);
        } catch (FileNotFoundException ex) {
            throw new NullPointerException("This file not exist!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}
