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
        Properties prop = new Properties();
        try (InputStream input = new FileInputStream("gradle.properties")) {
            prop.load(input);
        } catch (FileNotFoundException ex) {
            throw new NullPointerException("This file not exist!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }
}
