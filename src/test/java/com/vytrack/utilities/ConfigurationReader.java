package com.vytrack.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    // 1 - Create the obj of Properties
    private static Properties properties = new Properties();

    static {
        try {
            // 2 - We need to open the file in java memory: FileInputStream
            FileInputStream file = new FileInputStream("configuration.properties");

            // 3 - load the properties object using FileInputStream
            properties.load(file);

            // close the file
            file.close();

        } catch (IOException e) {
            System.out.println("File not found in the ConfigurationReader class");
            e.printStackTrace();
        }
    }

    public static String getProperty(String keyword) {

        // 1- Create the object of Properties class
        // We need properties class to use methods coming from class like load(), getProperty("key")
        // it is static because we using it in static method and static block
        // It is private because I will be using only in this class


        // We want to open the properties file and load to properties object ONLY ONCE before reading
        // having static block because static runs first


        /**
         * This method is used to read value from a configuration.properties file
         *
         * @param keyword --> key name in configuration.properties file
         * @return --> value for the key. returns null if key is not found
         * driver.get(ConfigurationReader.getProperty("env"))
         */


            return properties.getProperty(keyword);
        }
    }


